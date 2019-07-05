package com.stat.bradip.resource.counter.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SESSION_MONTH_COUNTER")
public class SessionMonthCounter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_SESSION")
	private Integer idSession;
	@Column(name = "TOTAL_NUMBER")
	private Long totalNumber;
	@Column(name = "MONTH_REFERENCE")
	private String monthReference;

	public SessionMonthCounter() {
	}

	public SessionMonthCounter(Integer idSession, Long totalNumber, String monthReference) {
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
