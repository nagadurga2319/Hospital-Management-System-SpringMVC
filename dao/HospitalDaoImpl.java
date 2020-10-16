package com.main.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.main.model.AddPhysician;
import com.main.model.EnrollPatient;
import com.main.model.PatientDiagnosis;
import com.main.model.PhysicianSearch;

/**
 * @author nagadurgalaks.prasa
 *
 */
@Repository
public class HospitalDaoImpl implements HospitalDao {
	private static Logger log = Logger.getLogger(HospitalDaoImpl.class);
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void enrolling(EnrollPatient en) {

		log.info("Inside Dao enrolling()");
		sessionFactory.getCurrentSession().save(en);

	}

	@Override
	public List<EnrollPatient> fetchPatient() {

		log.info("Inside Dao fetchPatient()");
		Query query = sessionFactory.getCurrentSession().createQuery("from EnrollPatient e");
		List<EnrollPatient> patList = query.list();
		return patList;

	}

	@Override
	public void addPhysician(AddPhysician addphy) {

		log.info("Inside Dao addPhysician()");
		sessionFactory.getCurrentSession().save(addphy);
	}

	@Override
	public List<AddPhysician> fetchPhysician() {

		log.info("Inside Dao fetchPhysician()");
		Query query = sessionFactory.getCurrentSession().createQuery("from AddPhysician a");
		List<AddPhysician> phyList = query.list();
		return phyList;
	}

	@Override
	public void searchPhysicianByCriteria(PhysicianSearch ps) {

		log.info("Inside Dao searchPhysicianByCriteria()");
		sessionFactory.getCurrentSession().save(ps);
	}

	@Override
	public List<AddPhysician> searchPhysician(PhysicianSearch ps) {

		log.info("Inside Dao serachPhysician()");
		Query query = sessionFactory.getCurrentSession().createQuery(
				"from AddPhysician p where p.state=:pstate and p.insPlan=:pinsPlan and p.department=:pdepartment");

		query.setParameter("pstate", ps.getState());
		query.setParameter("pinsPlan", ps.getInsPlan());
		query.setParameter("pdepartment", ps.getDepartment());

		List<AddPhysician> psList = query.list();
		return psList;
	}

	@Override
	public void patientDiagnosisDetails(PatientDiagnosis pd) {

		log.info("Inside Dao patientDiagnosisDetails()");
		sessionFactory.getCurrentSession().save(pd);
	}

	@Override
	public List<PatientDiagnosis> fetchPatientDiagnosis() {

		log.info("Inside Dao fetchPatientDiagnosis()");
		Query query = sessionFactory.getCurrentSession().createQuery("from PatientDiagnosis pd");
		List<PatientDiagnosis> diaList = query.list();
		return diaList;
	}

	@Override
	public EnrollPatient patientHistoryDetails(Integer patId) {

		log.info("Inside Dao patientHistoryDetails()");
		EnrollPatient en = (EnrollPatient) sessionFactory.getCurrentSession().get(EnrollPatient.class, patId);
		return en;
	}

}
