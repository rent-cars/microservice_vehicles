package com.rentcar.vehicles.web.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;


//@JsonFilter("monFiltreDynamique")  // commenter pour pouvoir utiliser les autres méthodes qui n'ont pas de filtres


@Entity
public class Vehicle {

    @Id
    @Size(min=6, max=15)
    private String registration;

    @Size(min=4, max=15)
    private String type;

    @Size(min=3, max=15)
    private String brand;

    @Size(min=1, max=25)
    private String model;

    @Size(min=3, max=15)
    private String color;

    private int cylinder;

    private float loadVolume;

    private int currentPrice;

    @Override
    public String toString() {
        return "Vehicle{" +
                "registration='" + registration + '\'' +
                ", type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", cylinder=" + cylinder +
                ", loadVolume=" + loadVolume +
                ", currentPrice=" + currentPrice +
                '}';
    }

    //  🥎 -------- constructor ----------

    public Vehicle(){};

    public Vehicle(String registration, String type, String brand, String model, String color, int cylinder, float loadVolume, int currentPrice) {
        this.registration = registration;
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.cylinder = cylinder;
        this.loadVolume = loadVolume;
        this.currentPrice = currentPrice;
    }


    //  🥎 -------- getter and setter ----------


    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCylinder() {
        return cylinder;
    }

    public void setCylinder(int cylinder) {
        this.cylinder = cylinder;
    }

    public float getLoadVolume() {
        return loadVolume;
    }

    public void setLoadVolume(int loadVolume) {
        this.loadVolume = loadVolume;
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(int currentPrice) {
        this.currentPrice = currentPrice;
    }
}
