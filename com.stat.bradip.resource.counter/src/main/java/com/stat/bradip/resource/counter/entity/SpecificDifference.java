package com.stat.bradip.resource.counter.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SPECIFIC_DIFFERENCE")
public class SpecificDifference {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_SPECIFIC_DIFFERENCE")
	private Integer idSpecifiDifference;
	@Column(name = "REFERENCE_PRIMARY")
	private String referencePrimary;
	@Column(name = "REFERENCE_SECONDARY")
	private String referenceSecondary;
	@Column(name = "TOTAL_DIFFERENCE_NUMBER")
	private Long totalDifferenceNumber;
	@Column(name = "TOTAL_DIFFERENCE_PERCENTAGE")
	private Double totalDifferencePercentage;

	public SpecificDifference() {
	}

	public SpecificDifference(Integer idSpecifiDifference, String referencePrimary, String referenceSecondary,
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
