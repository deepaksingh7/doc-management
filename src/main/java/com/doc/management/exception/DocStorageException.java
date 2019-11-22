package com.doc.management.exception;

public class DocStorageException extends RuntimeException {

	private static final long serialVersionUID = 7624059573982032409L;

	public DocStorageException(String message) {
		super(message);
	}

	public DocStorageException(String message, Throwable cause) {
		super(message, cause);
	}

}
