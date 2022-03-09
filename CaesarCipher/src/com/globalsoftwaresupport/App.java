package com.globalsoftwaresupport;

import java.io.*;

public class App {

	public static void main(String[] args) throws IOException {
		

		try {
			
	
				System.out.print("[-] Provide the text : ");
				String text = new BufferedReader(new InputStreamReader(System.in)).readLine();

				System.out.print("[-] Provide the key value : ");
				int key = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());

			CaesarCipher cipher = new CaesarCipher();
		
			String cipherText = cipher.encrypt(text, key);
			System.out.println(cipherText);
			
			System.out.println(cipher.decrypt(cipherText, key));

		} catch (Exception e) {
			System.out.println("[-] Exception has been caught !!!")
		}
		

	}
}
