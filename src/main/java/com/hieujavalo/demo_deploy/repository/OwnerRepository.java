package com.hieujavalo.demo_deploy.repository;

import com.hieujavalo.demo_deploy.entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long> {
}