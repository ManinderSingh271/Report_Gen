package com.example.ReportGen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ReportGen.model.Report;

public interface ReportRepository extends JpaRepository<Report, Long>{

}
