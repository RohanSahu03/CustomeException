
public class MainRunner {

	public static void main(String args[]) {
		
		Aplication ap = new Aplication();
		try {
			ap.verifyOtp(12134);
		}
		catch(InvalidOtpException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception de) {
			de.printStackTrace();
		}
	}
	
	
}
