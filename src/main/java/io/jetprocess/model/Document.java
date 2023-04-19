package io.jetprocess.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "document")
public class Document {
	
	@Id
	@Column(name ="documentId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private long groupId;
	private long companyId;
	private long userId;
	private Date createDate;
	private Date modifiedDate;
	private long folderId;
	private String treePath;
	private String name;
	
	private String fileName;
	private String extension;
	private String mimeType;
	private String title;
	private String description;
	private long typeId;
	private String version;
	private long size;
	private long smallImageId;
	private long largeImageId;
	private long custom1ImageId;
	private long custom2ImageId;
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
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public long getFolderId() {
		return folderId;
	}
	public void setFolderId(long folderId) {
		this.folderId = folderId;
	}
	public String getTreePath() {
		return treePath;
	}
	public void setTreePath(String treePath) {
		this.treePath = treePath;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
	public String getMimeType() {
		return mimeType;
	}
	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getTypeId() {
		return typeId;
	}
	public void setTypeId(long typeId) {
		this.typeId = typeId;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long size) {
		this.size = size;
	}
	public long getSmallImageId() {
		return smallImageId;
	}
	public void setSmallImageId(long smallImageId) {
		this.smallImageId = smallImageId;
	}
	public long getLargeImageId() {
		return largeImageId;
	}
	public void setLargeImageId(long largeImageId) {
		this.largeImageId = largeImageId;
	}
	public long getCustom1ImageId() {
		return custom1ImageId;
	}
	public void setCustom1ImageId(long custom1ImageId) {
		this.custom1ImageId = custom1ImageId;
	}
	public long getCustom2ImageId() {
		return custom2ImageId;
	}
	public void setCustom2ImageId(long custom2ImageId) {
		this.custom2ImageId = custom2ImageId;
	}
	public Document(long id, long groupId, long companyId, long userId, Date createDate, Date modifiedDate,
			long folderId, String treePath, String name, String fileName, String extension, String mimeType,
			String title, String description, long typeId, String version, long size, long smallImageId,
			long largeImageId, long custom1ImageId, long custom2ImageId) {
		super();
		this.id = id;
		this.groupId = groupId;
		this.companyId = companyId;
		this.userId = userId;
		this.createDate = createDate;
		this.modifiedDate = modifiedDate;
		this.folderId = folderId;
		this.treePath = treePath;
		this.name = name;
		this.fileName = fileName;
		this.extension = extension;
		this.mimeType = mimeType;
		this.title = title;
		this.description = description;
		this.typeId = typeId;
		this.version = version;
		this.size = size;
		this.smallImageId = smallImageId;
		this.largeImageId = largeImageId;
		this.custom1ImageId = custom1ImageId;
		this.custom2ImageId = custom2ImageId;
	}
	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
