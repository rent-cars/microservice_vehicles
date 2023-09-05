package com.rentcar.vehicles.web.controller;

import com.rentcar.vehicles.web.dao.VehiclesDao;
import com.rentcar.vehicles.web.model.Vehicles;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@RequestMapping("/vehicles")

@RestController
public class VehiclesController {

    @Autowired

    private final VehiclesDao vehiclesDao;
    private RestOperations restTemplate = new RestTemplate();


// 🍋 ---- constructor ----
    public VehiclesController(VehiclesDao vehiclesDao) {
        this.vehiclesDao = vehiclesDao;
    }

// -----------------------



    @ApiOperation("Affiche tous les véhicules")
    @GetMapping
    public List<Vehicles> listClients() {
        List<Vehicles> vehicles = vehiclesDao.findAll();
        return vehicles;
    }


}
