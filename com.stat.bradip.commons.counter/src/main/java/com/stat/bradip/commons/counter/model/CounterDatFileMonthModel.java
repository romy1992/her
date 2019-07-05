package com.stat.bradip.commons.counter.model;

public class CounterDatFileMonthModel {

	private Integer idCounterFile;
	private String monthRiferimer;
	private String yearRiferiment;
	private String stringDescription;
	private Long counterTotalMonth;

	public CounterDatFileMonthModel() {
	}

	public CounterDatFileMonthModel(Integer idCounterFile, String monthRiferimer, String yearRiferiment,
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

	public String getStringDescription() {
		return stringDescription;
	}

	public void setStringDescription(String stringDescription) {
		this.stringDescription = stringDescription;
	}

	public Long getCounterTotalMonth() {
		return counterTotalMonth;
	}

	public void setCounterTotalMonth(Long counterTotalMonth) {
		this.counterTotalMonth = counterTotalMonth;
	}

}
