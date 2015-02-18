package Helper;



public class Help {
	
//	private static WebDriver driver;
	
	public static String randomEmail(int min, int max) {

		String allowedChars = "abcdefghiklmnopqrstuvwxyz";
		String randommail = "";
		int num = (int) (Math.floor(Math.random() * (max - min)) + min);

		for (int i = 0; i < num; i++) {
			int rnum = (int) Math.floor(Math.random() * allowedChars.length());
			randommail = randommail + allowedChars.subSequence(rnum, rnum + 1);
		}

		randommail += "@gmail.com";
		// System.out.println(randomstring);
		return randommail;

	}

	public static String randomLogin(int min, int max) {

		String randomstring = "";
		String allowedChars1 = "bcdfghklmnpqrstvwxz";
		String allowedChars2 = "aeiouy";
		int num = (int) (Math.floor(Math.random() * (max - min)) + min);

		for (int i = 0; i < num; i++) {
			if (i % 2 == 0) {
				int rnum2 = (int) Math.floor(Math.random()
						* allowedChars1.length());
				randomstring += allowedChars1.substring(rnum2, rnum2 + 1);
			}

			else {
				int rnum = (int) Math.floor(Math.random()
						* allowedChars2.length());
				randomstring += allowedChars2.substring(rnum, rnum + 1);
			}
		}
		randomstring = randomstring.toUpperCase().substring(0, 1)
				+ randomstring.substring(1);

		return randomstring;
	}

}
