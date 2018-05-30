package com.jcintegration.OrderProcessingApplication.CCValidation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CreditCardInfo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private Integer sNo;	
	private String ccNo;
	private String ccName;
	private String ccStatus;
	
	public Integer getsNo() {
		return sNo;
	}
	public void setsNo(Integer sNo) {
		this.sNo = sNo;
	}
	
	public String getCcNo() {
		return ccNo;
	}
	public void setCcNo(String ccNo) {
		this.ccNo = ccNo;
	}
	public String getCcName() {
		return ccName;
	}
	public void setCcName(String ccName) {
		this.ccName = ccName;
	}
	public String getCcStatus() {
		return ccStatus;
	}
	public void setCcStatus(String ccStatus) {
		this.ccStatus = ccStatus;
	}
	

}
