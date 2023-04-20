package io.jetprocess.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name ="jp_docfile")
public class DocFile {
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	@Column(name = "docfileid")
	private long id;
	
	/* Group instance */
	private long groupId;
	/*    Audit Fields  */
	private long companyId;
	private long userId;
	private String userName;

	@JsonFormat(pattern ="dd-MM-yyyy hh:mm:ss" ,timezone = "Asia/Kolkata")
	private Date createDate;
	@JsonFormat(pattern ="dd-MM-yyyy hh:mm:ss" , timezone = "Asia/Kolkata")
	private Date modifiedDate;
	/*  Other Fields  */
	private String nature;
	private String type;
	private long headId;
	private long fileCodeId;
	private String subject;
	private String fileNo;
	private long categoryId;
	private String remarks;
	private String reference;
	private long year;
	private long userPostId;
	@Column(name ="current_user_id")
	private long currentUser;
	private int currentState;
	private long dealingOrganizationId;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getGroupId() {
		return groupId;
	}
	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}
	public long getCompanyId() {
		return companyId;
	}
	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = new Date();
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = new Date();
	}
	public String getNature() {
		return nature;
	}
	public void setNature(String nature) {
		this.nature = nature;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getHeadId() {
		return headId;
	}
	public void setHeadId(long headId) {
		this.headId = headId;
	}
	public long getFileCodeId() {
		return fileCodeId;
	}
	public void setFileCodeId(long fileCodeId) {
		this.fileCodeId = fileCodeId;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getFileNo() {
		return fileNo;
	}
	public void setFileNo(String fileNo) {
		this.fileNo = fileNo;
	}
	public long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public long getYear() {
		return year;
	}
	public void setYear(long year) {
		this.year = year;
	}
	public long getUserPostId() {
		return userPostId;
	}
	public void setUserPostId(long userPostId) {
		this.userPostId = userPostId;
	}
	public long getCurrentUser() {
		return currentUser;
	}
	public void setCurrentUser(long currentUser) {
		this.currentUser = currentUser;
	}
	public int getCurrentState() {
		return currentState;
	}
	public void setCurrentState(int currentState) {
		this.currentState = currentState;
	}
	public long getDealingOrganizationId() {
		return dealingOrganizationId;
	}
	public void setDealingOrganizationId(long dealingOrganizationId) {
		this.dealingOrganizationId = dealingOrganizationId;
	}
	public DocFile(long id, long groupId, long companyId, long userId, String userName, Date createDate,
			Date modifiedDate, String nature, String type, long headId, long fileCodeId, String subject, String fileNo,
			long categoryId, String remarks, String reference, long year, long userPostId, long currentUser,
			int currentState, long dealingOrganizationId) {
		super();
		this.id = id;
		this.groupId = groupId;
		this.companyId = companyId;
		this.userId = userId;
		this.userName = userName;
		this.createDate = createDate;
		this.modifiedDate = modifiedDate;
		this.nature = nature;
		this.type = type;
		this.headId = headId;
		this.fileCodeId = fileCodeId;
		this.subject = subject;
		this.fileNo = fileNo;
		this.categoryId = categoryId;
		this.remarks = remarks;
		this.reference = reference;
		this.year = year;
		this.userPostId = userPostId;
		this.currentUser = currentUser;
		this.currentState = currentState;
		this.dealingOrganizationId = dealingOrganizationId;
	}
	
	@Override
	public String toString() {
		return "DocFile [id=" + id + ", groupId=" + groupId + ", companyId=" + companyId + ", userId=" + userId
				+ ", userName=" + userName + ", createDate=" + createDate + ", modifiedDate=" + modifiedDate
				+ ", nature=" + nature + ", type=" + type + ", headId=" + headId + ", fileCodeId=" + fileCodeId
				+ ", subject=" + subject + ", fileNo=" + fileNo + ", categoryId=" + categoryId + ", remarks=" + remarks
				+ ", reference=" + reference + ", year=" + year + ", userPostId=" + userPostId + ", currentUser="
				+ currentUser + ", currentState=" + currentState + ", dealingOrganizationId=" + dealingOrganizationId
				+ "]";
	}
	public DocFile() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	}
