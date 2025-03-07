package com.example.ReportGen.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ReportGen.model.Report;
import com.example.ReportGen.service.ReportService;

@RestController
@RequestMapping("/reports")
public class ReportController {
	@Autowired
	ReportService service;
	
	@GetMapping()
	public ArrayList<Report> getReports() {
		//System.out.println("in Controller...");
		return service.getReports(); 	
	}
	
	@PostMapping()
	public Report addReport(@RequestBody Report report) {
//		System.out.println("in post controller");
		return service.addReport(report);
	}
	
	@PutMapping("/update")
	public Report updateReport(@RequestBody Report report) {
		System.out.println("in PUT controller");
		return service.updatReport(report);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteReport(@PathVariable(name = "id") Long id) {
		System.out.println("DELETED.");
		service.deleteReport(id);
	}

}
