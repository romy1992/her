package com.stat.bradip.commons.model;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class FaceFileModel {

	private Integer id;
	private Date dateInsert;
	private String anno;
	private String mese;
	private Boolean isOk;
	private String nameFile;
	private List<DateFileModel> datFileList;

	public FaceFileModel() {
	}

	

	public FaceFileModel(Integer id, Date dateInsert, String anno, String mese, Boolean isOk, String nameFile,
			List<DateFileModel> datFileList) {
		super();
		this.id = id;
		this.dateInsert = dateInsert;
		this.anno = anno;
		this.mese = mese;
		this.isOk = isOk;
		this.nameFile = nameFile;
		this.datFileList = datFileList;
	}



	public Boolean getIsOk() {
		return isOk;
	}



	public void setIsOk(Boolean isOk) {
		this.isOk = isOk;
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

	public String getDataRif() {
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, Locale.ITALY);
		return dateFormat.format(getDateInsert()).toUpperCase();
	}

	public String getNameFile() {
		return nameFile;
	}

	public void setNameFile(String nameFile) {
		this.nameFile = nameFile;
	}

	public List<DateFileModel> getDatFileList() {
		return datFileList;
	}

	public void setDatFileList(List<DateFileModel> datFileList) {
		this.datFileList = datFileList;
	}

}
