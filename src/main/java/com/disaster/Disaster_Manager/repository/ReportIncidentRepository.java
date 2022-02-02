
package com.disaster.Disaster_Manager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.disaster.Disaster_Manager.model.ReportIncident;
import com.disaster.Disaster_Manager.model.User;

@Repository
public interface ReportIncidentRepository extends JpaRepository<ReportIncident, Long> {

	
	
}
