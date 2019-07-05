package com.stat.bradip.commons.counter.model;

import java.util.List;

public class CounterYearModel {

	private Integer idYearCounter;
	private String year;
	private String stringYear;
	List<SessionMonthCounterModel> sessionMounthList;

	public CounterYearModel() {

	}

	public CounterYearModel(Integer idYearCounter, String year, String stringYear,
			List<SessionMonthCounterModel> sessionMounthList) {
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

	public List<SessionMonthCounterModel> getSessionMounthList() {
		return sessionMounthList;
	}

	public void setSessionMounthList(List<SessionMonthCounterModel> sessionMounthList) {
		this.sessionMounthList = sessionMounthList;
	}

}
