package org.sushma.mosquitoApp.dto.project;

import java.io.Serializable;
import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="projects_table")
public class ProjectDTO implements Serializable {

	public ProjectDTO() {
		System.out.println(this.getClass().getSimpleName() +" created");
	}

	@Id
	@GenericGenerator(name="mid", strategy="increment")
	@GeneratedValue(generator="mid")
	@Column(name="p_id")
	private int pId;
	@Column(name="p_name")
	private String projectName;
	@Column(name="p_domain")
	private String projectDomain;
	@Column(name="p_code")
	private String projectCode;

	
	@Column(name="p_startDate")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date projectStartDate;

	@Column(name="p_endDate")	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date projectEndDate;

	@Column(name="p_description")
	private String projectDescription;
	@Column(name="p_status")
	private String projectStatus;

	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectDomain() {
		return projectDomain;
	}
	public void setProjectDomain(String projectDomain) {
		this.projectDomain = projectDomain;
	}
	public String getProjectCode() {
		return projectCode;
	}
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}


	public Date getProjectStartDate() {
		return projectStartDate;
	}
	public void setProjectStartDate(Date projectStartDate) {
		this.projectStartDate = projectStartDate;
	}
	public Date getProjectEndDate() {
		return projectEndDate;
	}
	public void setProjectEndDate(Date projectEndDate) {
		this.projectEndDate = projectEndDate;
	}
	public String getProjectDescription() {
		return projectDescription;
	}
	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}
	public String getProjectStatus() {
		return projectStatus;
	}
	public void setProjectStatus(String projectStatus) {
		this.projectStatus = projectStatus;
	}
	@Override
	public String toString() {
		return "ProjectDTO [pId=" + pId + ", projectName=" + projectName + ", projectDomain=" + projectDomain
				+ ", projectCode=" + projectCode + ", projectStartDate=" + projectStartDate + ", projectEndDate="
				+ projectEndDate + ", projectDescription=" + projectDescription + ", projectStatus=" + projectStatus
				+ "]";
	}



}

