package com.example.ReportGen.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="reports")
public class Report {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long reportId;

	private String reportName;
	private int basedOn;

	public Report() {
		
	}
	/**
	 * @param reportName
	 * @param basedOn
	 */
	public Report(String reportName, int basedOn) {
		super();
		this.reportName = reportName;
		this.basedOn = basedOn;
	}
	public String getReportName() {
		return reportName;
	}
	public void setReportName(String reportName) {
		this.reportName = reportName;
	}
	public int getBasedOn() {
		return basedOn;
	}
	public void setBasedOn(int basedOn) {
		this.basedOn = basedOn;
	}
}
