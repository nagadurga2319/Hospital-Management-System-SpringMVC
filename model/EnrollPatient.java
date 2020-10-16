package com.main.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author nagadurgalaks.prasa
 *
 */
@Entity
@Table(name = "PatientDetails")
public class EnrollPatient {
	@Id
	
	private Integer pid;
	@NotEmpty
	@Size(min = 3, max = 15)
	private String firstName;
	@NotEmpty
	@Size(min = 3, max = 15)
	private String lastName;
	@NotEmpty
	private String password;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@NotNull
	@Temporal(TemporalType.DATE)
	private Date dob;
	@NotEmpty
	@Email
	private String email;
	@NotNull
	private Long conNum;
	@NotEmpty
	private String status;
	@NotEmpty
	private String insPlan;

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
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}

	/**
	 * @param dob
	 *            the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the conNum
	 */
	public Long getConNum() {
		return conNum;
	}

	/**
	 * @param conNum
	 *            the conNum to set
	 */
	public void setConNum(Long conNum) {
		this.conNum = conNum;
	}

	/**
	 * @return the insPlan
	 */
	public String getInsPlan() {
		return insPlan;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @param insPlan
	 *            the insPlan to set
	 */
	public void setInsPlan(String insPlan) {
		this.insPlan = insPlan;
	}

}
