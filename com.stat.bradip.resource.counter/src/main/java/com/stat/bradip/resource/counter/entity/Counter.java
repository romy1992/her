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
@Table(name = "COUNTER")
public class Counter {

	@Id
	@Column(name = "ID_COUNTER")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCounter;
	@Column(name = "ID_CUSTOMER")
	private Integer idCustomer;
	@Column(name = "ID_FILE")
	private Integer idFile;
	@OneToMany(cascade = CascadeType.ALL)
	private List<CounterDatFileMonth> counterDatFile;

	public Counter() {
	}

	public Counter(Integer idCounter, Integer idCustomer, Integer idFile, List<CounterDatFileMonth> counterDatFile) {
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

	public List<CounterDatFileMonth> getCounterDatFile() {
		return counterDatFile;
	}

	public void setCounterDatFile(List<CounterDatFileMonth> counterDatFile) {
		this.counterDatFile = counterDatFile;
	}

}
