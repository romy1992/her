package com.stat.bradip.commons.model;

import java.util.Date;
import java.util.List;

public class CustomerModel {

	private Integer id;
	private String name;
	private List<FaceFileModel> faceList;
	private Date codDateInsert;

	public CustomerModel() {
	}

	public CustomerModel(Integer id, String name, List<FaceFileModel> faceList, Date codDateInsert) {

		this.id = id;
		this.name = name;
		this.faceList = faceList;
		this.codDateInsert = codDateInsert;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<FaceFileModel> getFaceList() {
		return faceList;
	}

	public void setFaceList(List<FaceFileModel> faceList) {
		this.faceList = faceList;
	}

	public Date getCodDateInsert() {
		return codDateInsert;
	}

	public void setCodDateInsert(Date codDateInsert) {
		this.codDateInsert = codDateInsert;
	}

//	public String getDataRif() {
//		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, Locale.ITALY);
//		return dateFormat.format(getCodDateInsert()).toUpperCase();
//	}
}
