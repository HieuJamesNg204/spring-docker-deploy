package com.hieujavalo.demo_deploy.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hieujavalo.demo_deploy.enums.Continent;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "country")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 100, nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "continent", nullable = false)
    private Continent continent;

    @JsonIgnore
    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Automaker> automakers;

    public Country() {}

    public Country(Long id, String name, Continent continent) {
        this.id = id;
        this.name = name;
        this.continent = continent;
    }

    public Country(String name, Continent continent) {
        this.name = name;
        this.continent = continent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    public List<Automaker> getAutomakers() {
        return automakers;
    }

    public void setAutomakers(List<Automaker> automakers) {
        this.automakers = automakers;
    }
}