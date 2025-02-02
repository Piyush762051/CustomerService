package com.ebs.main.model;

import com.ebs.main.enm.ServiceType;
import com.ebs.main.enm.TermsAndCondition;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EnquiryRequest
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int requestId;
	
	@Enumerated(EnumType.STRING)
	private ServiceType serviceType;
	
	private String dilevaryAddress;
	
	@Enumerated(EnumType.STRING)
	private TermsAndCondition termsAndConditionsAgree;
	
	
}
