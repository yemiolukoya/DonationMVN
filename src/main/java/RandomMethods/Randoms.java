package RandomMethods;

import java.util.Random;

public class Randoms {
	
	public String getSaltString() {
		String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890"; Use this if you want to include numbers
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		while (salt.length() < 4) { // length of the random string.
			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		String saltStr = salt.toString();
		return saltStr;

	}

}
