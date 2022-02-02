package com.disaster.Disaster_Manager.service_helper;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.disaster.Disaster_Manager.model.ReportIncident;
import com.disaster.Disaster_Manager.model.User;
import com.disaster.Disaster_Manager.repository.ReportIncidentRepository;
import com.disaster.Disaster_Manager.repository.UserRepository;

@Service
@Transactional
public class ReportIncidentServiceHelper {
	@Autowired
	private ReportIncidentRepository incidentRepository;

	public List<ReportIncident> finAll(){
		return incidentRepository.findAll();
	}
	
	public void saveReport(ReportIncident ri) {
		incidentRepository.save(ri);
	}
	
}
