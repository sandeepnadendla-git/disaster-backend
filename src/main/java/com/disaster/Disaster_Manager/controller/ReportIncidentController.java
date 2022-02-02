package com.disaster.Disaster_Manager.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.disaster.Disaster_Manager.model.LoginData;
import com.disaster.Disaster_Manager.model.ReportIncident;
import com.disaster.Disaster_Manager.model.User;
import com.disaster.Disaster_Manager.service_helper.ReportIncidentServiceHelper;
import com.disaster.Disaster_Manager.service_helper.UserServiceHelper;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v2/")
public class ReportIncidentController {
	@Autowired
	ReportIncidentServiceHelper incidentservicehp;
 
	@GetMapping("/IncidentReports")
	public List<ReportIncident> getAllIncidentReports(){
		return this.incidentservicehp.finAll();
	}
	
	@PostMapping("/saveReport")
	public ResponseEntity<String> saveReport(@RequestBody ReportIncident ri) {

		
			incidentservicehp.saveReport(ri);
		
		 return new ResponseEntity<>(HttpStatus.OK);	
}
}


