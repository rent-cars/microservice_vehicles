package com.rentcar.vehicles.web.controller;

import com.rentcar.vehicles.web.dao.VehicleDao;
import com.rentcar.vehicles.web.model.Vehicle;
import io.swagger.annotations.ApiOperation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;


@RequestMapping("/vehicles")

@RestController
public class VehiclesController {

    //@Autowired

    private final VehicleDao vehicleDao;
    private RestOperations restTemplate = new RestTemplate();


    // 🍋 ---- constructor ----
    public VehiclesController(VehicleDao vehiclesDao) {
        this.vehicleDao = vehiclesDao;
    }

// -----------------------


    @ApiOperation("Affiche tous les véhicules")
    @GetMapping
    public List<Vehicle> listVehicle(@RequestParam(value = "brand", required = false) String brand, @RequestParam(value = "type", required = false) String type) {
        if(brand==null && type==null) {
            List<Vehicle> vehicles = vehicleDao.findAll();
            return vehicles;

        }else if(type==null){
            return  vehicleDao.findByBrand(brand);

        }else {
            return  vehicleDao.findByType(type);
        }
    }



    @ApiOperation("Affiche le véhicule par son numéro d'immatriculation")
    @GetMapping("/{registration}")
    public Vehicle getVehicleByRegistration(@PathVariable String registration) {
        return vehicleDao.findByRegistration(registration);
    }



    @ApiOperation("Ajoute un nouveau véhicule")
    @PostMapping
    public void addVehicle(@RequestBody Vehicle vehicle) {
        vehicleDao.save(vehicle);
    }

    @ApiOperation("Modifie un véhicule par son numéro d'immatriculation")
    @PutMapping("/{registration}")
    public Vehicle updateVehicle(@PathVariable String registration, @RequestBody Vehicle vehicle){
        vehicle.setRegistration(registration);
        Vehicle updateVehicle = vehicleDao.save(vehicle);
        return updateVehicle;
    }

    @ApiOperation("Supprimer un véhicule par son numéro d'immatriculation")
    @DeleteMapping("/{registration}")
    @Transactional
    public void deleteVehicle(@PathVariable String registration){
        vehicleDao.deleteByRegistration(registration);
    }

}
