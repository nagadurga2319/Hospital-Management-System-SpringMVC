package com.main.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author nagadurgalaks.prasa
 *
 */
@Entity
@Table(name = "Diagnosis")
public class PatientDiagnosis {
	@Id
	private Integer diagnosisId;
	@NotNull
	private Integer pid;
	@NotEmpty
	private String symptom;
	@NotEmpty
	private String diagnosis;
	@NotEmpty
	private String doctor;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@NotNull
	@Temporal(TemporalType.DATE)
	private Date dod;
	@Enumerated(EnumType.STRING)
	private FollowUp followup;
	@DateTimeFormat(pattern = "yyyy-MM-dd")

	@Temporal(TemporalType.DATE)
	private Date dof;
	@NotNull
	private Integer bill;
	@NotEmpty
	private String cardNum;
	@Enumerated(EnumType.STRING)
	private Payment pay;

	/**
	 * @return the diagnosisId
	 */
	public Integer getDiagnosisId() {
		return diagnosisId;
	}

	/**
	 * @param diagnosisId
	 *            the diagnosisId to set
	 */
	public void setDiagnosisId(Integer diagnosisId) {
		this.diagnosisId = diagnosisId;
	}

	/**
	 * @return the pid
	 */
	public Integer getPid() {
		return pid;
	}

	/**
	 * @param pid
	 *            the pid to set
	 */
	public void setPid(Integer pid) {
		this.pid = pid;
	}

	/**
	 * @return the symptom
	 */
	public String getSymptom() {
		return symptom;
	}

	/**
	 * @param symptom
	 *            the symptom to set
	 */
	public void setSymptom(String symptom) {
		this.symptom = symptom;
	}

	/**
	 * @return the diagnosis
	 */
	public String getDiagnosis() {
		return diagnosis;
	}

	/**
	 * @param diagnosis
	 *            the diagnosis to set
	 */
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	/**
	 * @return the doctor
	 */
	public String getDoctor() {
		return doctor;
	}

	/**
	 * @param doctor
	 *            the doctor to set
	 */
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	/**
	 * @return the dod
	 */
	public Date getDod() {
		return dod;
	}

	/**
	 * @param dod
	 *            the dod to set
	 */
	public void setDod(Date dod) {
		this.dod = dod;
	}

	/**
	 * @return the followup
	 */
	public FollowUp getFollowup() {
		return followup;
	}

	/**
	 * @param followup
	 *            the followup to set
	 */
	public void setFollowup(FollowUp followup) {
		this.followup = followup;
	}

	/**
	 * @return the dof
	 */
	public Date getDof() {
		return dof;
	}

	/**
	 * @param dof
	 *            the dof to set
	 */
	public void setDof(Date dof) {
		this.dof = dof;
	}

	/**
	 * @return the bill
	 */
	public Integer getBill() {
		return bill;
	}

	/**
	 * @param bill
	 *            the bill to set
	 */
	public void setBill(Integer bill) {
		this.bill = bill;
	}

	/**
	 * @return the cardNum
	 */
	public String getCardNum() {
		return cardNum;
	}

	/**
	 * @param cardNum
	 *            the cardNum to set
	 */
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	/**
	 * @return the pay
	 */
	public Payment getPay() {
		return pay;
	}

	/**
	 * @param pay
	 *            the pay to set
	 */
	public void setPay(Payment pay) {
		this.pay = pay;
	}

}
