package com.stat.bradip.resource.counter.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "COUNTER_YEAR")
public class CounterYear {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_YEAR_COUNTER")
	private Integer idYearCounter;
	@Column(name = "YEAR")
	private String year;
	@Column(name = "STRING_YEAR")
	private String stringYear;
	@OneToMany(cascade = CascadeType.ALL)
	List<SessionMonthCounter> sessionMounthList;

	public CounterYear() {
	}

	public CounterYear(Integer idYearCounter, String year, String stringYear,
			List<SessionMonthCounter> sessionMounthList) {
		super();
		this.idYearCounter = idYearCounter;
		this.year = year;
		this.stringYear = stringYear;
		this.sessionMounthList = sessionMounthList;
	}

	public Integer getIdYearCounter() {
		return idYearCounter;
	}

	public void setIdYearCounter(Integer idYearCounter) {
		this.idYearCounter = idYearCounter;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getStringYear() {
		return stringYear;
	}

	public void setStringYear(String stringYear) {
		this.stringYear = stringYear;
	}

	public List<SessionMonthCounter> getSessionMounthList() {
		return sessionMounthList;
	}

	public void setSessionMounthList(List<SessionMonthCounter> sessionMounthList) {
		this.sessionMounthList = sessionMounthList;
	}

}
