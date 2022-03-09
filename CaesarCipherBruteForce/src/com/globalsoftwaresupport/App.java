package com.globalsoftwaresupport;

import java.io.*;

public class App {

	public static void main(String[] args) {
		
		CaesarCipherBruteForce cracker = new CaesarCipherBruteForce();

		System.out.print("[-] Provide the text : ");
				String text = new BufferedReader(new InputStreamReader(System.in)).readLine();

		cracker.crack(text);
	}
}
