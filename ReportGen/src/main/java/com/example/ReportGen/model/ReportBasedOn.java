package com.example.ReportGen.model;

import java.util.List;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

@Data
@Builder
public class ReportBasedOn {
	private long id;
	private String basedOnName;
	@Singular
	private List<String> members; 

}
