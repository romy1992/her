package com.stat.bradip.resource.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "DATE_FILE")
public class DateFile {

	@Id
	@Column(name="ID_DAT_FILE")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idDatFile;
	@Temporal(TemporalType.DATE)
	@Column(name="DATA")
	private Date data;
	@Column(name="MESE")
	private String mese;
	@Column(name="ANNO")
	private String anno;
	@OneToMany(cascade = CascadeType.ALL)
	private List<StringSubject> stringSubjectList;

	public DateFile() {
	}

	public DateFile(Integer idDatFile, Date data, String mese, String anno, List<StringSubject> stringSubjectList) {
		super();
		this.idDatFile = idDatFile;
		this.data = data;
		this.mese = mese;
		this.anno = anno;
		this.stringSubjectList = stringSubjectList;
	}

	public String getMese() {
		return mese;
	}

	public void setMese(String mese) {
		this.mese = mese;
	}

	public String getAnno() {
		return anno;
	}

	public void setAnno(String anno) {
		this.anno = anno;
	}

	public Integer getIdDatFile() {
		return idDatFile;
	}

	public void setIdDatFile(Integer idDatFile) {
		this.idDatFile = idDatFile;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public List<StringSubject> getStringSubjectList() {
		return stringSubjectList;
	}

	public void setStringSubjectList(List<StringSubject> stringSubjectList) {
		this.stringSubjectList = stringSubjectList;
	}

}
