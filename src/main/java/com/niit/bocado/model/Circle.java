package com.niit.bocado.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Component
public class Circle implements Serializable {

	
	public Circle(int circleId, int circleName, String createdBy, boolean status, Date creationDate) {
		
		this.circleId = circleId;
		this.circleName = circleName;
		this.createdBy = createdBy;
		this.status = status;
		this.creationDate = creationDate;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int circleId;
	@Column(name="circleName")
	private int circleName;
	@Column(name="createdBy")
	private String createdBy;
	private boolean status;
	@Column(name="creationDate")
	@JsonFormat(pattern="dd-mm-yyyy hh:mm:ss")
	private Date creationDate;
    
	public Circle() {
		
		// TODO Auto-generated constructor stub
	}
	public int getCircleId() {
		return circleId;
	}
	public void setCircleId(int circleId) {
		this.circleId = circleId;
	}
	public int getCircleName() {
		return circleName;
	}
	public void setCircleName(int circleName) {
		this.circleName = circleName;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	@Override
	public String toString() {
		return "Circle [circleId=" + circleId + ", circleName=" + circleName + ", createdBy=" + createdBy + ", status="
				+ status + ", creationDate=" + creationDate + "]";
	}
}
