package org.sushma.mosquitoApp.dto.issue;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="issue_table")
public class IssueDTO implements Serializable{

	@Id
	@GenericGenerator(name="issueId",strategy="increment")
	@GeneratedValue(generator="issueId")
	@Column(name="issue_id")
	private int iId;
	@Column(name="issue_number")
	private String issueNum;
	@Column(name="issue_projName")
	private String projName;
	@Column(name="issue_type")
	private String issuetype;
	@Column(name="issue_priority")
	private int issuePriority;
	@Column(name="issue_description")
	private String issueDesc;
	@Column(name="issue_resourceEmail")
	private String resourceEmail;
	@Column(name="issue_status")
	private String issueStatus;
	public IssueDTO() {
		System.out.println(this.getClass().getSimpleName()+" created");
	}
	public int getiId() {
		return iId;
	}
	public void setiId(int iId) {
		this.iId = iId;
	}
	public String getIssueNum() {
		return issueNum;
	}
	public void setIssueNum(String issueNum) {
		this.issueNum = issueNum;
	}
	public String getProjName() {
		return projName;
	}
	public void setProjName(String projName) {
		this.projName = projName;
	}
	public String getIssuetype() {
		return issuetype;
	}
	public void setIssuetype(String issuetype) {
		this.issuetype = issuetype;
	}
	public int getIssuePriority() {
		return issuePriority;
	}
	public void setIssuePriority(int issuePriority) {
		this.issuePriority = issuePriority;
	}
	public String getIssueDesc() {
		return issueDesc;
	}
	public void setIssueDesc(String issueDesc) {
		this.issueDesc = issueDesc;
	}
	public String getResourceEmail() {
		return resourceEmail;
	}
	public void setResourceEmail(String resourceEmail) {
		this.resourceEmail = resourceEmail;
	}
	public String getIssueStatus() {
		return issueStatus;
	}
	public void setIssueStatus(String issueStatus) {
		this.issueStatus = issueStatus;
	}
	@Override
	public String toString() {
		return "IssueDTO [iId=" + iId + ", issueNum=" + issueNum + ", projName=" + projName + ", issuetype=" + issuetype
				+ ", issuePriority=" + issuePriority + ", issueDesc=" + issueDesc + ", resourceEmail=" + resourceEmail
				+ ", issueStatus=" + issueStatus + "]";
	}
	
}
