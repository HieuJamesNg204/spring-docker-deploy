package com.hieujavalo.demo_deploy.repository;

import com.hieujavalo.demo_deploy.entity.Automaker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutomakerRepository extends JpaRepository<Automaker, Long> {
}