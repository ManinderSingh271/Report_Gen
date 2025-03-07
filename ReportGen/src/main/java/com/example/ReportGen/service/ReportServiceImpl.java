package com.example.ReportGen.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ReportGen.model.Report;
import com.example.ReportGen.model.ReportBasedOn;
import com.example.ReportGen.repository.ReportRepository;

@Service
public class ReportServiceImpl implements ReportService{

	@Autowired
	ReportRepository repo;

	@Override
	public ArrayList<Report> getReports() {
		// TODO Auto-generated method stub
		//System.out.println("In getReports");
		return (ArrayList<Report>) repo.findAll();
	}

	@Override
	public Report addReport(Report report) {
		// TODO Auto-generated method stub
		//		System.out.println("in add report");
		return repo.save(report);
	}

	@Override
	public Report updatReport(Report report) {
		// TODO Auto-generated method stub
		System.out.println("in UPDATE report");
		Report rpt=new Report();
		rpt.setReportName(report.getReportName());
		rpt.setBasedOn(report.getBasedOn());
		return repo.save(rpt);
	}

	@Override
	public void deleteReport(Long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);

	}

	@Override
	public void chkLombok() {
		// TODO Auto-generated method stub
		ReportBasedOn rptb=ReportBasedOn.builder()
											.id(1)
											.basedOnName("Meter")
											.member("meter1")
											.member("meter2")
											.build();
		
		
										

	}

}
