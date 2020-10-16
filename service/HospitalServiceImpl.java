package com.main.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.main.dao.HospitalDao;
import com.main.model.AddPhysician;
import com.main.model.EnrollPatient;
import com.main.model.PatientDiagnosis;
import com.main.model.PhysicianSearch;

/**
 * @author nagadurgalaks.prasa
 *
 */

@Service
@Transactional
public class HospitalServiceImpl implements HospitalService {
	private static Logger log = Logger.getLogger(HospitalServiceImpl.class);
	@Autowired
	private HospitalDao hospitalDao;

	@Override
	public void enrolling(EnrollPatient en) {

		log.info("Inside enrolling()");
		hospitalDao.enrolling(en);
	}

	@Override
	public List<EnrollPatient> fetchPatient() {

		log.info("Inside fetchPatient()");
		List<EnrollPatient> patList = hospitalDao.fetchPatient();
		return patList;

	}

	@Override
	public void addPhysician(AddPhysician addphy) {

		log.info("Inside addPhysician()");
		hospitalDao.addPhysician(addphy);

	}

	@Override
	public List<AddPhysician> fetchPhysician() {

		log.info("Inside fetchPhysician()");
		List<AddPhysician> phyList = hospitalDao.fetchPhysician();
		return phyList;
	}

	@Override
	public void searchPhysicianByCriteria(PhysicianSearch ps) {

		log.info("Inside searchPhysicianByCriteria()");
		hospitalDao.searchPhysicianByCriteria(ps);
	}

	@Override
	public List<AddPhysician> searchPhysician(PhysicianSearch ps) {

		log.info("Inside searchPhysician()");
		List<AddPhysician> psList = hospitalDao.searchPhysician(ps);
		return psList;
	}

	@Override
	public void patientDiagnosisDetails(PatientDiagnosis pd) {

		log.info("Inside patientDiagnosisDetails()");
		hospitalDao.patientDiagnosisDetails(pd);
	}

	@Override
	public List<PatientDiagnosis> fetchPatientDiagnosis() {

		log.info("Inside fetchPatientDiagnosis()");
		List<PatientDiagnosis> diaList = hospitalDao.fetchPatientDiagnosis();
		return diaList;
	}

	@Override
	public EnrollPatient patientHistoryDetails(Integer patId) {

		log.info("Inside patientHistoryDetails()");
		EnrollPatient en = hospitalDao.patientHistoryDetails(patId);
		return en;

	}

}
