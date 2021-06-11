package com.neosoft.poc3.entity;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Insurancerepo extends JpaRepository<InsurancePlan, Serializable> {

}
