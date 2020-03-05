package com.propertyFile;

public class ATest {
	public static void main(String[] args) {
		String username = A.getInstance().getPropertyByKey("usernamee");
		String password = A.getInstance().getPropertyByKey("password");
		System.out.println(username);
		System.out.println(password);
	}
}
