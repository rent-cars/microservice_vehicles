package com.rentcar.vehicles.web.dao;


import com.rentcar.vehicles.web.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VehicleDao extends JpaRepository<Vehicle, String> {

    List<Vehicle> findAll();

    Vehicle findByRegistration(String registration);

    List<Vehicle> findByBrand(String brand);

    List<Vehicle> findByType(String type);


    Vehicle save(Vehicle vehicle);

    void deleteByRegistration(String registration);

}
