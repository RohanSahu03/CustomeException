import java.sql.SQLException;

public class InvalidOtpException extends NullPointerException {

	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "mismatch otp";
	}
	
	
}
