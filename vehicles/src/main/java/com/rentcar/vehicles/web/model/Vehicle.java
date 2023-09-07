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

    private int horsepowerTax;

    private float loadVolume;

    private int currentPrice;

    private float kmPrice;

    private float cylinderPrice;

    private float volumePrice;

    private float cleaningCoast;

    @Override
    public String toString() {
        return "Vehicle{" +
                "registration='" + registration + '\'' +
                ", type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", cylinder=" + cylinder +
                ", horsepowerTax=" + horsepowerTax +
                ", loadVolume=" + loadVolume +
                ", currentPrice=" + currentPrice +
                ", kmPrice=" + kmPrice +
                ", cylinderPrice=" + cylinderPrice +
                ", volumePrice=" + volumePrice +
                ", cleaningCoast=" + cleaningCoast +
                '}';
    }

//  🥎 -------- constructor ----------

    public Vehicle(){};

    public Vehicle(String registration, String type, String brand, String model, String color, int cylinder, int horsepowerTax, float loadVolume, int currentPrice, float kmPrice, float cylinderPrice, float volumePrice, float cleaningCoast) {
        this.registration = registration;
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.cylinder = cylinder;
        this.horsepowerTax = horsepowerTax;
        this.loadVolume = loadVolume;
        this.currentPrice = currentPrice;
        this.kmPrice = kmPrice;
        this.cylinderPrice = cylinderPrice;
        this.volumePrice = volumePrice;
        this.cleaningCoast = cleaningCoast;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCylinder() {
        return cylinder;
    }

    public void setCylinder(int cylinder) {
        this.cylinder = cylinder;
    }

    public int getHorsepowerTax() {
        return horsepowerTax;
    }

    public void setHorsepowerTax(int horsepowerTax) {
        this.horsepowerTax = horsepowerTax;
    }

    public float getLoadVolume() {
        return loadVolume;
    }

    public void setLoadVolume(float loadVolume) {
        this.loadVolume = loadVolume;
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(int currentPrice) {
        this.currentPrice = currentPrice;
    }

    public float getKmPrice() {
        return kmPrice;
    }

    public void setKmPrice(float kmPrice) {
        this.kmPrice = kmPrice;
    }

    public float getCylinderPrice() {
        return cylinderPrice;
    }

    public void setCylinderPrice(float cylinderPrice) {
        this.cylinderPrice = cylinderPrice;
    }

    public float getVolumePrice() {
        return volumePrice;
    }

    public void setVolumePrice(float volumePrice) {
        this.volumePrice = volumePrice;
    }

    public float getCleaningCoast() {
        return cleaningCoast;
    }

    public void setCleaningCoast(float cleaningCoast) {
        this.cleaningCoast = cleaningCoast;
    }
}
