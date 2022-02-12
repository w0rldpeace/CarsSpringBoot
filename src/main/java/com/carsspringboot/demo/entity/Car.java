package com.carsspringboot.demo.entity;

import java.time.LocalDate;
import java.util.ArrayList;

public class Car {


    private Long id;
    private String manufacturer;
    private String model;
    private ArrayList<String> type;
    private LocalDate madeFrom;
    private LocalDate madeUntil;
    private ArrayList<String> transmission;
    private int weight;
    private int numberOfDoors;
    private int kwPower;
    private int hpPower;
    private int numberOfCylinders;
    private double displacement;
    private String engineCode;

    public Car(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public ArrayList<String> getType() {
        return type;
    }

    public void setType(ArrayList<String> type) {
        this.type = type;
    }

    public LocalDate getMadeFrom() {
        return madeFrom;
    }

    public void setMadeFrom(LocalDate madeFrom) {
        this.madeFrom = madeFrom;
    }

    public LocalDate getMadeUntil() {
        return madeUntil;
    }

    public void setMadeUntil(LocalDate madeUntil) {
        this.madeUntil = madeUntil;
    }

    public ArrayList<String> getTransmission() {

        return transmission;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getKwPower() {
        return kwPower;
    }

    public void setKwPower(int kwPower) {
        this.kwPower = kwPower;
    }

    public int getHpPower() {
        return hpPower;
    }

    public void setHpPower(int hpPower) {
        this.hpPower = hpPower;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public String getEngineCode() {
        return engineCode;
    }

    public void setEngineCode(String engineCode) {
        this.engineCode = engineCode;
    }

    public void init(){

        transmission.add("Schaltgetriebe");
        transmission.add("Automatik");
        transmission.add("Halb-Automatik");

        type.add("Limousine");
        type.add("Coupe");
        type.add("Kombi");
        type.add("Kleinwagen");
        type.add("Gelaendewagen");
        type.add("Van");
        type.add("Cabrio");

    }
}
