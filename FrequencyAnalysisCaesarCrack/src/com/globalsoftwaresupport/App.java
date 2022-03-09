package com.globalsoftwaresupport;

import java.io.*;

public class App {

	public static void main(String[] args) {

		System.out.print("[-] Provide the text : ");
				String text = new BufferedReader(new InputStreamReader(System.in)).readLine();
		
		// String cipher = "WHJXKWOJSBJUOESXJKXNJSJKWJKJFYAUSXQJKBJKJBYPCFKAOJOXQSXOOAJKCJKJWDVCSXKCSYXKVJMYWZKXHJKXNJWHJWKSXJSXCOAOBCBJKAOJKVQYASCRWBJKXNJWKMRSXOJVOKAXSXQ";
		CrackCaesar cracker = new CrackCaesar();
		cracker.crackCaesar(text);
	}
}
