package com.example.ReportGen.service;

import com.example.ReportGen.model.Report;
import java.util.ArrayList;

public interface ReportService {
	ArrayList<Report> getReports();
	Report addReport(Report report);
	Report updatReport(Report report);
	void deleteReport(Long id);
	
	void chkLombok();
}
