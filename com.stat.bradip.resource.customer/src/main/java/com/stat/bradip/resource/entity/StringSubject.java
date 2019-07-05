package com.stat.bradip.resource.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STRINGSUBJECT")
public class StringSubject {

	@Id
	@Column(name = "ID_STRING")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idString;
	@Column(name = "DESCRIPTION")
	private String stringDescription;
	@Column(name = "NUMBER")
	private Integer number;

	public StringSubject() {
	}

	public StringSubject(Integer idString, String stringDescription, Integer number) {
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
