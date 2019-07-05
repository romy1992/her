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
@Table(name = "DIFFERENCE_COUNTER")
public class DifferenceCounter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_DIFFERENCE")
	private Integer idDifference;
	@Column(name = "ID_CUSTOMER")
	private Integer idCustomer;
	@Column(name = "DESCRIPTION")
	private String description;
	@OneToMany(cascade = CascadeType.ALL)
	private List<SpecificDifference> specificDifferenceList;

	public DifferenceCounter() {
	}

	public DifferenceCounter(Integer idDifference, Integer idCustomer, String description,
			List<SpecificDifference> specificDifferenceList) {
		super();
		this.idDifference = idDifference;
		this.idCustomer = idCustomer;
		this.description = description;
		this.specificDifferenceList = specificDifferenceList;
	}

	public Integer getIdDifference() {
		return idDifference;
	}

	public void setIdDifference(Integer idDifference) {
		this.idDifference = idDifference;
	}

	public Integer getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(Integer idCustomer) {
		this.idCustomer = idCustomer;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<SpecificDifference> getSpecificDifferenceList() {
		return specificDifferenceList;
	}

	public void setSpecificDifferenceList(List<SpecificDifference> specificDifferenceList) {
		this.specificDifferenceList = specificDifferenceList;
	}

}
