package co.gov.sic.prueba.security.jwt.resource;

public class AuthenticationException extends RuntimeException {
    private static final long serialVersionUID = -7923939769373482783L;

	public AuthenticationException(String message, Throwable cause) {
        super(message, cause);
    }
}
