package com.main.controller;

import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.main.model.AddPhysician;
import com.main.model.EnrollPatient;
import com.main.model.PatientDiagnosis;
import com.main.model.PhysicianSearch;

import com.main.service.HospitalService;

/**
 * @author nagadurgalaks.prasa
 *
 */
@Controller
public class HospitalController {
	private static Logger log = Logger.getLogger(HospitalController.class);
	@Autowired
	private HospitalService hospitalService;

	@RequestMapping(value = "/patient", method = RequestMethod.GET)
	public String loadRegistrationForm(ModelMap map) {
		log.info("Request inside loadRegistration method");
		EnrollPatient en = new EnrollPatient();
		map.addAttribute("enrollForm", en);
		return "EnrollPatient";
	}

	@RequestMapping(value = "/enroll", method = RequestMethod.POST)
	public String enrolling(@Validated @ModelAttribute("enrollForm") EnrollPatient en, BindingResult result,
			ModelMap map) {
		String viewPage;
		if (result.hasErrors()) {
			log.info("validation errors occured");
			viewPage = "EnrollPatient";
		} else {
			log.info("invoking enrolling method");
			Random r = new Random();
			int pid = r.nextInt(899) + 100;
			en.setPid(pid);
			hospitalService.enrolling(en);
			List<EnrollPatient> patList = hospitalService.fetchPatient();
			map.addAttribute("patientList", patList);
			viewPage = "enrollsuccess";
		}
		return viewPage;
	}

	@RequestMapping(value = "/physician", method = RequestMethod.GET)
	public String loadPhysician(ModelMap map) {
		log.info("Request inside loadPhysician method");
		AddPhysician addphy = new AddPhysician();
		map.addAttribute("physicianForm", addphy);
		return "AddPhysician";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addPhysician(@Validated @ModelAttribute("physicianForm") AddPhysician addphy, BindingResult result,
			ModelMap map) {
		String viewPage;
		if (result.hasErrors()) {
			log.info("validation errors occured");
			viewPage = "AddPhysician";
		} else {
			log.info("invoking addPhysician method");
			Random r = new Random();
			int phyid = r.nextInt(899) + 100;
			String pid = "PR" + phyid;
			addphy.setPhysiacianid(pid);
			hospitalService.addPhysician(addphy);
			List<AddPhysician> phyList = hospitalService.fetchPhysician();
			map.addAttribute("physicianList", phyList);
			viewPage = "physiciansuccess";
		}
		return viewPage;
	}

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String loadSearch(ModelMap map) {
		log.info("Request inside loadSearch method");
		PhysicianSearch ps = new PhysicianSearch();
		map.addAttribute("searchForm", ps);
		return "PhysicianSearch";
	}

	@RequestMapping(value = "/physearch", method = RequestMethod.POST)
	public String searchPhysicianByCriteria(@Validated @ModelAttribute("searchForm") PhysicianSearch ps,
			BindingResult result, ModelMap map) {
		String viewPage;
		if (result.hasErrors()) {
			log.info("validation errors occured");
			viewPage = "PhysicianSearch";
		} else {
			log.info("invoking searchPhysicianByCriteria method");

			List<AddPhysician> psList = hospitalService.searchPhysician(ps);
			map.addAttribute("physicianList", psList);
			viewPage = "physiciansuccess";
		}
		return viewPage;
	}

	@RequestMapping(value = "/diagnosis", method = RequestMethod.GET)
	public String loadDiagnosisForm(ModelMap map) {
		log.info("Request inside loadDiagnosisForm method");
		PatientDiagnosis pd = new PatientDiagnosis();
		map.addAttribute("diagnosisForm", pd);
		return "PatientDiagnosis";
	}

	@RequestMapping(value = "/dia", method = RequestMethod.POST)
	public String patientDiagnosisDetails(@Validated @ModelAttribute("diagnosisForm") PatientDiagnosis pd,
			BindingResult result, ModelMap map) {
		String viewPage;
		if (result.hasErrors()) {
			log.info("validation errors occured");
			viewPage = "PatientDiagnosis";
		} else {
			log.info("invoking patientDiagnosisDetails method");
			Random r = new Random();
			int daid = r.nextInt(899) + 100;
			pd.setDiagnosisId(daid);
			hospitalService.patientDiagnosisDetails(pd);
			List<PatientDiagnosis> diaList = hospitalService.fetchPatientDiagnosis();
			map.addAttribute("diagnosisList", diaList);
			viewPage = "diagnosissuccess";
		}
		return viewPage;
	}

	@RequestMapping(value = "/view/{patId}")
	public String patientHistoryDetails(@PathVariable("patId") Integer ptId, ModelMap map) {
		log.info("Patient History Details");
		EnrollPatient en = hospitalService.patientHistoryDetails(ptId);
		map.addAttribute("viewForm", en);
		return "ViewPatientHistory";
	}
}
