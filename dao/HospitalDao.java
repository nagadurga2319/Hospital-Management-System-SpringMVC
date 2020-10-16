package com.main.dao;

import java.util.List;

import com.main.model.AddPhysician;
import com.main.model.EnrollPatient;
import com.main.model.PatientDiagnosis;
import com.main.model.PhysicianSearch;

/**
 * @author nagadurgalaks.prasa
 *
 */
public interface HospitalDao {
	public void enrolling(EnrollPatient en);

	public List<EnrollPatient> fetchPatient();

	public void addPhysician(AddPhysician addphy);

	public List<AddPhysician> fetchPhysician();

	public void searchPhysicianByCriteria(PhysicianSearch ps);

	public List<AddPhysician> searchPhysician(PhysicianSearch ps);

	public void patientDiagnosisDetails(PatientDiagnosis pd);

	public List<PatientDiagnosis> fetchPatientDiagnosis();

	public EnrollPatient patientHistoryDetails(Integer patId);
}
