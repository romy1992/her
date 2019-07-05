package com.stat.bradip.resource.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name ="FACEFILE")
public class FaceFile {

	@Id
	@Column(name="ID_FILE")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Temporal(TemporalType.DATE)
	@Column(name="DATE_FILE_INSERT")
	private Date dateInsert;
	@Column(name="isOk")
	private Boolean isOk;
	@Column(name="YEAR")
	private String anno;
	@Column(name="MONTH")
	private String mese;
	@Column(name="NAME_FILE")
	private String nameFile;
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;
	@OneToMany(cascade = CascadeType.ALL)
	private List<DateFile> datFileList;

	public FaceFile() {
	}


	public FaceFile(Integer id, Date dateInsert, Boolean isOk, String anno, String mese, String nameFile,
			Customer customer, List<DateFile> datFileList) {
		super();
		this.id = id;
		this.dateInsert = dateInsert;
		this.isOk = isOk;
		this.anno = anno;
		this.mese = mese;
		this.nameFile = nameFile;
		this.customer = customer;
		this.datFileList = datFileList;
	}

	public Boolean getIsOk() {
		return isOk;
	}


	public void setIsOk(Boolean isOk) {
		this.isOk = isOk;
	}


	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getAnno() {
		return anno;
	}

	public void setAnno(String anno) {
		this.anno = anno;
	}

	public String getMese() {
		return mese;
	}

	public void setMese(String mese) {
		this.mese = mese;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDateInsert() {
		return dateInsert;
	}

	public void setDateInsert(Date dateInsert) {
		this.dateInsert = dateInsert;
	}

	public String getNameFile() {
		return nameFile;
	}

	public void setNameFile(String nameFile) {
		this.nameFile = nameFile;
	}

	public List<DateFile> getDatFileList() {
		return datFileList;
	}

	public void setDatFileList(List<DateFile> datFileList) {
		this.datFileList = datFileList;
	}

}
