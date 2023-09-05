package com.rentcar.vehicles.web.dao;


import com.rentcar.vehicles.web.model.Vehicles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehiclesDao extends JpaRepository<Vehicles, String> {

    List<Vehicles> findAll();
}
