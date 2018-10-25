package org.sushma.mosquitoApp.dto.resource;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="resource_table")
public class ResourceDTO  implements Serializable{

	public ResourceDTO() {
		System.out.println(this.getClass().getSimpleName()+" created");
	}
	@Id
	@GenericGenerator(name="rIdGen",strategy="increment")
	@GeneratedValue(generator="rIdGen")
	@Column(name="r_id")
	int rId;
	@Column(name="r_name")
	String resrcName;
	@Column(name="r_designation")
	String resrcDesignation;
	@Column(name="r_empNo")
	String resrcEmpNo;
	@Column(name="r_projName")
	String resrcProjName;
	@Column(name="r_email")
	String resrcEmail;
	@Column(name="r_mgrEmail")
	String resrcMgrEmail;
	@Column(name="r_password")
	String rescrPassword;
	
	public int getrId() {
		return rId;
	}
	public void setrId(int rId) {
		this.rId = rId;
	}
	public String getResrcName() {
		return resrcName;
	}
	public void setResrcName(String resrcName) {
		this.resrcName = resrcName;
	}
	public String getResrcDesignation() {
		return resrcDesignation;
	}
	public void setResrcDesignation(String resrcDesignation) {
		this.resrcDesignation = resrcDesignation;
	}
	public String getResrcEmpNo() {
		return resrcEmpNo;
	}
	public void setResrcEmpNo(String resrcEmpNo) {
		this.resrcEmpNo = resrcEmpNo;
	}
	public String getResrcProjName() {
		return resrcProjName;
	}
	public void setResrcProjName(String resrcProjName) {
		this.resrcProjName = resrcProjName;
	}
	public String getResrcEmail() {
		return resrcEmail;
	}
	public void setResrcEmail(String resrcEmail) {
		this.resrcEmail = resrcEmail;
	}
	public String getResrcMgrEmail() {
		return resrcMgrEmail;
	}
	public void setResrcMgrEmail(String resrcMgrEmail) {
		this.resrcMgrEmail = resrcMgrEmail;
	}
	public String getRescrPassword() {
		return rescrPassword;
	}
	public void setRescrPassword(String rescrPassword) {
		this.rescrPassword = rescrPassword;
	}
	@Override
	public String toString() {
		return "ResourceDTO [rId=" + rId + ", resrcName=" + resrcName + ", resrcDesignation=" + resrcDesignation
				+ ", resrcEmpNo=" + resrcEmpNo + ", resrcProjName=" + resrcProjName + ", resrcEmail=" + resrcEmail
				+ ", resrcMgrEmail=" + resrcMgrEmail + ", rescrPassword=" + rescrPassword + "]";
	}
	
	
	
	
}
