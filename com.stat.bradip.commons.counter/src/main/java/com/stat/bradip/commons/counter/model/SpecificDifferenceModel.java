package com.stat.bradip.commons.counter.model;

public class SpecificDifferenceModel {

	private Integer idSpecifiDifference;
	private String referencePrimary;
	private String referenceSecondary;
	private Long totalDifferenceNumber;
	private Double totalDifferencePercentage;

	public SpecificDifferenceModel() {
	}

	public SpecificDifferenceModel(Integer idSpecifiDifference, String referencePrimary, String referenceSecondary,
			Long totalDifferenceNumber, Double totalDifferencePercentage) {
		super();
		this.idSpecifiDifference = idSpecifiDifference;
		this.referencePrimary = referencePrimary;
		this.referenceSecondary = referenceSecondary;
		this.totalDifferenceNumber = totalDifferenceNumber;
		this.totalDifferencePercentage = totalDifferencePercentage;
	}

	public Integer getIdSpecifiDifference() {
		return idSpecifiDifference;
	}

	public void setIdSpecifiDifference(Integer idSpecifiDifference) {
		this.idSpecifiDifference = idSpecifiDifference;
	}

	public String getReferencePrimary() {
		return referencePrimary;
	}

	public void setReferencePrimary(String referencePrimary) {
		this.referencePrimary = referencePrimary;
	}

	public String getReferenceSecondary() {
		return referenceSecondary;
	}

	public void setReferenceSecondary(String referenceSecondary) {
		this.referenceSecondary = referenceSecondary;
	}

	public Long getTotalDifferenceNumber() {
		return totalDifferenceNumber;
	}

	public void setTotalDifferenceNumber(Long totalDifferenceNumber) {
		this.totalDifferenceNumber = totalDifferenceNumber;
	}

	public Double getTotalDifferencePercentage() {
		return totalDifferencePercentage;
	}

	public void setTotalDifferencePercentage(Double totalDifferencePercentage) {
		this.totalDifferencePercentage = totalDifferencePercentage;
	}

}
