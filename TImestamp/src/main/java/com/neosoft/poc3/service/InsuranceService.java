package com.neosoft.poc3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.poc3.entity.InsurancePlan;
import com.neosoft.poc3.entity.Insurancerepo;

@Service
public class InsuranceService {

	@Autowired
	private Insurancerepo repo;

	public void saveData() {

		InsurancePlan plan = new InsurancePlan();
		plan.setPlanId(1);

		plan.setPlanName("IC");

		plan.setStauts("Approved");

		repo.save(plan);

	}

}
