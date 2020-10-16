package com.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author nagadurgalaks.prasa
 *
 */
@Entity
@Table(name = "physician")
public class AddPhysician {
	@Id
	private String physiacianid;
	@NotEmpty
	@Size(min = 3, max = 15)
	private String firstName;
	@NotEmpty
	@Size(min = 3, max = 15)
	private String lastName;
	@NotEmpty
	private String department;
	@NotEmpty
	private String qualification;
	@NotNull
	private Integer experience;
	@NotEmpty
	private String state;
	@NotEmpty
	private String insPlan;

	/**
	 * @return the physiacianid
	 */
	public String getPhysiacianid() {
		return physiacianid;
	}

	/**
	 * @param physiacianid
	 *            the physiacianid to set
	 */
	public void setPhysiacianid(String physiacianid) {
		this.physiacianid = physiacianid;
	}

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
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department
	 *            the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * @return the qualification
	 */
	public String getQualification() {
		return qualification;
	}

	/**
	 * @param qualification
	 *            the qualification to set
	 */
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	/**
	 * @return the experience
	 */
	public Integer getExperience() {
		return experience;
	}

	/**
	 * @param experience
	 *            the experience to set
	 */
	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the insPlan
	 */
	public String getInsPlan() {
		return insPlan;
	}

	/**
	 * @param insPlan
	 *            the insPlan to set
	 */
	public void setInsPlan(String insPlan) {
		this.insPlan = insPlan;
	}
}
