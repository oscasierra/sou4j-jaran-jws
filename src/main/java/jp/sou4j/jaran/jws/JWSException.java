package jp.sou4j.jaran.jws;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JWSException extends Exception {

	private static final long serialVersionUID = 1L;

	private int statusCode;

	@JsonProperty("Message")
	private String message;

	public JWSException() {
		super();
	}

	public JWSException(String message) {
		super(message);
	}

	public JWSException(String message, Throwable cause) {
		super(message, cause);
	}

	public JWSException(Throwable cause) {
		super(cause);
	}

	public String getMessage() {
		return message + " (code:" + this.statusCode + ")";
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

}
