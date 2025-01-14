package com.hieujavalo.demo_deploy.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "automaker_id", nullable = false)
    private Automaker automaker;

    @Column(name = "car_model", nullable = false, length = 100)
    private String carModel;

    @Column(name = "car_colour", length = 20)
    private String carColour;

    @Column(name = "number_plate", length = 50)
    private String numberPlate;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    public Car() {}

    public Car(Long id, Automaker automaker, String carModel, String carColour, String numberPlate, Owner owner) {
        this.id = id;
        this.automaker = automaker;
        this.carModel = carModel;
        this.carColour = carColour;
        this.numberPlate = numberPlate;
        this.owner = owner;
    }

    public Car(Automaker automaker, String carModel, String carColour, String numberPlate, Owner owner) {
        this.automaker = automaker;
        this.carModel = carModel;
        this.carColour = carColour;
        this.numberPlate = numberPlate;
        this.owner = owner;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Automaker getAutomaker() {
        return automaker;
    }

    public void setAutomaker(Automaker automaker) {
        this.automaker = automaker;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarColour() {
        return carColour;
    }

    public void setCarColour(String carColour) {
        this.carColour = carColour;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}