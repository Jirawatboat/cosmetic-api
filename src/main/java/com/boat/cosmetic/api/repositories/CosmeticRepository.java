package com.boat.cosmetic.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boat.cosmetic.api.entities.Cosmetic;

public interface CosmeticRepository extends JpaRepository<Cosmetic, String>{

}
