package com.main.model;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author nagadurgalaks.prasa
 *
 */
public class PhysicianSearch {
	@NotEmpty
	private String state;
	@NotEmpty
	private String insPlan;
	@NotEmpty
	private String department;

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

}
