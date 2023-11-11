package com.rahul.beans;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "emp.info")
public class Employee {

	private String name;
	private long id;
	private String[] skills;
	private List<String> teamMembers;
	private Set<Long> phoneNumbers;
	private Map<String, Object> idDetails;
	private Company company;

	public void setName(String name) {
		this.name = name;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setSkills(String[] skills) {
		this.skills = skills;
	}

	public void setTeamMemebers(List<String> teamMemebers) {
		this.teamMembers = teamMemebers;
	}

	public void setPhoneNumber(Set<Long> phoneNumber) {
		this.phoneNumbers = phoneNumber;
	}

	public void setIdDetails(Map<String, Object> idDetails) {
		this.idDetails = idDetails;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", skills=" + Arrays.toString(skills) + ", teamMemebers="
				+ teamMembers + ", phoneNumber=" + phoneNumbers + ", idDetails=" + idDetails + ", company=" + company
				+ "]";
	}

}
