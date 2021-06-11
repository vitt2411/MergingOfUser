package com.neosoft.poc3.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Data
public class InsurancePlan {
	@Id
	@GeneratedValue
	private int planId;

	private String planName;
	@CreationTimestamp
	@Column(updatable = false)
	private LocalDate createDate;
	@UpdateTimestamp
	@Column(insertable = false)
	private LocalDate updateDate;

	private String stauts;

}
