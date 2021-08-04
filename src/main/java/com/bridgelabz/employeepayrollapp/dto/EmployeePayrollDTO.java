package com.bridgelabz.employeepayrollapp.dto;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

public @Data class EmployeePayrollDTO {
	
	@Pattern(regexp = "^[A-Z]{1}[a-z A-Z\\s]{2,}$", message = "Employee Name Invalid")
	@NotEmpty(message = "Employee name cannot be null")
	public String name;
	
	@Min(value=5000, message="Min Wage should be more than 5000")
	public long salary;
	
	@Pattern(regexp = "male|female", message ="Gender needs to be male or female")
	public String gender;
	
	@JsonFormat(pattern ="dd MMM yyyy")
	@NotNull(message="startDate should Not be Empty")
	@PastOrPresent(message="startDate should be past or todays date")
	public LocalDate startDate;
	
	@NotNull(message="Note cannot be Empty")
	public String note;
	
	@NotNull(message="profilePic cannot be Empty")
	public String profilePic;
	
	@NotNull(message="department should Not be Empty")
	public List<String> department;
		
}
