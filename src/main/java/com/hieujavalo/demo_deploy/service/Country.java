package com.hieujavalo.demo_deploy.service;

import com.hieujavalo.demo_deploy.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Country {
    private final CountryRepository countryRepository;

    @Autowired
    public Country(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }
}