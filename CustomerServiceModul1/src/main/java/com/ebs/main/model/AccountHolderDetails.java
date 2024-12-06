package com.ebs.main.model;

import java.util.Date;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AccountHolderDetails
{

@Id	
@GeneratedValue(strategy = GenerationType.AUTO)
 private int accountHolderId;               //primaryKey(int)
 private String accountHolderName;
 private String accountHolderAddress;
 private String	accountHolderEmail;
 private String	accountHolderContactNumber;
 private Date accountHolderDateOfBirth;
 
 @Enumerated(EnumType.STRING)
 private	String	accountHolderGender;  // MALE,FEMALE,OTHER
 @Lob
 @Column(length = 999999999)
 private	byte[]	accountHolderAdharCard;
 @Lob
 @Column(length = 999999999)
 private	byte[]	accountHolderPanCard;
 @Lob
 @Column(length = 999999999)
 private	byte[]	accountHolderPhoto;
 @Lob
 @Column(length = 999999999)
 private	byte[]	accountHolderJoiningLatter;  //Optional
 @Lob
 @Column(length = 999999999)
 private	byte[]	accountHolderSalarySlip;    //Optional


}
