package com.globalsoftwaresupport;

import java.io.*;

public class App {

	public static void main(String[] args) {
		
		System.out.print("[-] Provide the text : ");
		String text = new BufferedReader(new InputStreamReader(System.in)).readLine();

		LanguageDetector detector = new LanguageDetector();
		System.out.println(detector.isEnglish(text));
	}
}
