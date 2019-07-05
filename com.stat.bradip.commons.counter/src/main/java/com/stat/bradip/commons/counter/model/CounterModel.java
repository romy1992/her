package com.stat.bradip.commons.counter.model;

import java.util.List;

public class CounterModel {

	private Integer idCounter;
	private Integer idCustomer;
	private Integer idFile;
	private List<CounterDatFileMonthModel> counterDatFile;
	
	
	public CounterModel() {
	}
	public CounterModel(Integer idCounter, Integer idCustomer, Integer idFile,
			List<CounterDatFileMonthModel> counterDatFile) {
		super();
		this.idCounter = idCounter;
		this.idCustomer = idCustomer;
		this.idFile = idFile;
		this.counterDatFile = counterDatFile;
	}
	public Integer getIdCounter() {
		return idCounter;
	}
	public void setIdCounter(Integer idCounter) {
		this.idCounter = idCounter;
	}
	public Integer getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(Integer idCustomer) {
		this.idCustomer = idCustomer;
	}
	public Integer getIdFile() {
		return idFile;
	}
	public void setIdFile(Integer idFile) {
		this.idFile = idFile;
	}
	public List<CounterDatFileMonthModel> getCounterDatFile() {
		return counterDatFile;
	}
	public void setCounterDatFile(List<CounterDatFileMonthModel> counterDatFile) {
		this.counterDatFile = counterDatFile;
	}
	
	
}
