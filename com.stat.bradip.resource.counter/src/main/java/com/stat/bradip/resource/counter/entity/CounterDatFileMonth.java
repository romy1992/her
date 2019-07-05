package com.stat.bradip.resource.counter.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COUNTERDATFILE")
public class CounterDatFileMonth {
	@Id
	@Column(name = "ID_COUNTERFILE")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCounterFile;
	@Column(name = "MONTH_RIFERIMENT")
	private String monthRiferimer;
	@Column(name = "YEAR_RIFERIMENT")
	private String yearRiferiment;
	@Column(name = "STRING_DESCRIPTION")
	private String stringDescription;
	@Column(name = "COUNTER_TOTAL_MONTH")
	private Long counterTotalMonth;

	public CounterDatFileMonth() {

	}

	public CounterDatFileMonth(Integer idCounterFile, String monthRiferimer, String yearRiferiment,
			String stringDescription, Long counterTotalMonth) {
		super();
		this.idCounterFile = idCounterFile;
		this.monthRiferimer = monthRiferimer;
		this.yearRiferiment = yearRiferiment;
		this.stringDescription = stringDescription;
		this.counterTotalMonth = counterTotalMonth;
	}

	public Integer getIdCounterFile() {
		return idCounterFile;
	}

	public void setIdCounterFile(Integer idCounterFile) {
		this.idCounterFile = idCounterFile;
	}

	public String getStringDescription() {
		return stringDescription;
	}

	public void setStringDescription(String stringDescription) {
		this.stringDescription = stringDescription;
	}

	public String getMonthRiferimer() {
		return monthRiferimer;
	}

	public void setMonthRiferimer(String monthRiferimer) {
		this.monthRiferimer = monthRiferimer;
	}

	public String getYearRiferiment() {
		return yearRiferiment;
	}

	public void setYearRiferiment(String yearRiferiment) {
		this.yearRiferiment = yearRiferiment;
	}

	public Long getCounterTotalMonth() {
		return counterTotalMonth;
	}

	public void setCounterTotalMonth(Long counterTotalMonth) {
		this.counterTotalMonth = counterTotalMonth;
	}

}
