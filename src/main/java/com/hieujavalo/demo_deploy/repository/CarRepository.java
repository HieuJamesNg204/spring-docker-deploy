package com.hieujavalo.demo_deploy.repository;

import com.hieujavalo.demo_deploy.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    @Query("SELECT c FROM Car c JOIN c.automaker a WHERE a.name = :automakerName")
    Optional<List<Car>> findByAutomakerName(@Param("automakerName") String automakerName);

    @Query("SELECT c FROM Car c JOIN c.automaker a JOIN a.country cn WHERE cn.name = :countryName")
    Optional<List<Car>> findByCountry(@Param("countryName") String countryName);
}