package com.stat.bradip.commons.counter.model;

public class SessionMonthCounterModel {

	private Integer idSession;
	private Long totalNumber;
	private String monthReference;

	public SessionMonthCounterModel() {
	}

	public SessionMonthCounterModel(Integer idSession, Long totalNumber, String monthReference) {
		super();
		this.idSession = idSession;
		this.totalNumber = totalNumber;
		this.monthReference = monthReference;
	}

	public Integer getIdSession() {
		return idSession;
	}

	public void setIdSession(Integer idSession) {
		this.idSession = idSession;
	}

	public Long getTotalNumber() {
		return totalNumber;
	}

	public void setTotalNumber(Long totalNumber) {
		this.totalNumber = totalNumber;
	}

	public String getMonthReference() {
		return monthReference;
	}

	public void setMonthReference(String monthReference) {
		this.monthReference = monthReference;
	}

}
