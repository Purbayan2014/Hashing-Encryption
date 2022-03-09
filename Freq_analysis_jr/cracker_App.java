package Freq_analysis_jr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cracker_App {

    public static void main(String[] args) {
        

      System.out.print("\n[-] Provide the cipher text to crack : ")
        
      String ciphed_text  = new BufferedReader(new InputStreamReader(System.in)).readLine();

      new crack_ceasar().Crack_ceasar(ciphed_text);

    }
}