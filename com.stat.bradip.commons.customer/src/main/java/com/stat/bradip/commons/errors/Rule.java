package com.stat.bradip.commons.errors;

public class Rule {

	private Rule() {

	}

	public static final String ERRORS_INSERT_CUSTOMERS = "Si è verificato un errore nell'inserimento del Customer!";
	public static final String ERRORS_DELETE_CUSTOMERS = "Non è stato possibile eliminare il Customer!";
	public static final String ERRORS_GET_CUSTOMERS = "Questo Customers non è presente nel database!!!";
	public static final String ERRORS_FILE_BAD = "Il file che stai tentando di inserire non è un formato valido o i dati non hanno caratteri supportati!!";
	public static final String ERRORS_DELETE_FILE = "Non è stato possibile eliminare il file!";
	public static final String ERRORS_INSERT_FILE = "Si è verificato un errore nell'inserimento del File!";
	public static final String ERRORS_COMPARATION = "Si è verificato un errore nel momento della comparazione";
	public static final String ERRORS_COMPARATION_SIZE_ZERO = "Questo Progetto ha già tutti i file comparati!!";
}
