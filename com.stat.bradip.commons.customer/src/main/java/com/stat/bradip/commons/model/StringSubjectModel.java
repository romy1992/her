package com.stat.bradip.commons.model;

public class StringSubjectModel {

	private Integer idString;
	private String stringDescription;
	private Integer number;

	public StringSubjectModel() {
	}

	public StringSubjectModel(Integer idString, String stringDescription, Integer number) {
		super();
		this.idString = idString;
		this.stringDescription = stringDescription;
		this.number = number;
	}

	public Integer getIdString() {
		return idString;
	}

	public void setIdString(Integer idString) {
		this.idString = idString;
	}

	public String getStringDescription() {
		return stringDescription;
	}

	public void setStringDescription(String stringDescription) {
		this.stringDescription = stringDescription;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

}
