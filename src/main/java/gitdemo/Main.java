package gitdemo;

import org.apache.commons.lang3.StringUtils;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "a12340";
		String text2 = "1234";

		boolean result1 = StringUtils.isNumeric(text1);
		boolean result2 = StringUtils.isNumeric(text2);

		System.out.println(text1 + " is a numeric? " + result1);
		System.out.println(text2 + " is a numeric? " + result2);
		System.out.println("collaborator");


	}

}
