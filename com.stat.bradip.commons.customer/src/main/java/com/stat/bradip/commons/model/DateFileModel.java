package com.stat.bradip.commons.model;

import java.util.Date;
import java.util.List;

public class DateFileModel {

	private Integer idDatFile;
	private Date data;
	private String mese;
	private String anno;
	private List<StringSubjectModel> stringSubjectList;

	public DateFileModel() {
	}

	public DateFileModel(Integer idDatFile, Date data, String mese, String anno,
			List<StringSubjectModel> stringSubjectList) {
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

	public List<StringSubjectModel> getStringSubjectList() {
		return stringSubjectList;
	}

	public void setStringSubjectList(List<StringSubjectModel> stringSubjectList) {
		this.stringSubjectList = stringSubjectList;
	}

}
