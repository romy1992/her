package com.stat.bradip.commons.counter.model;

import java.util.List;

public class DifferenceCounterModel {

	private Integer idDifference;
	private String description;
	private Integer idCustomer;
	private List<SpecificDifferenceModel> specificDifferenceList;

	public DifferenceCounterModel() {

	}

	public DifferenceCounterModel(Integer idDifference, String description, Integer idCustomer,
			List<SpecificDifferenceModel> specificDifferenceList) {
		super();
		this.idDifference = idDifference;
		this.description = description;
		this.idCustomer = idCustomer;
		this.specificDifferenceList = specificDifferenceList;
	}

	public Integer getIdDifference() {
		return idDifference;
	}

	public void setIdDifference(Integer idDifference) {
		this.idDifference = idDifference;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<SpecificDifferenceModel> getSpecificDifferenceList() {
		return specificDifferenceList;
	}

	public void setSpecificDifferenceList(List<SpecificDifferenceModel> specificDifferenceList) {
		this.specificDifferenceList = specificDifferenceList;
	}

	public Integer getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(Integer idCustomer) {
		this.idCustomer = idCustomer;
	}

}
