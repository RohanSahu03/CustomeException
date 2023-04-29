
public class Aplication {

	public void verifyOtp(int otp) {
		if(otp==1234) {
			System.out.println("verified");
		}
		else {
			throw new InvalidOtpException();
		}
	}
}
