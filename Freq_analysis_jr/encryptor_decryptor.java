package Freq_analysis_jr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class encryptor_decryptor {

    public static void main(String[] args) throws IOException { 

            

        try {
            
                System.out.print("\n[-] Provide the text to be encrypted : ");
                String usr_text = new BufferedReader(new InputStreamReader(System.in)).readLine();

                System.out.print("\n[-] Provide the Key Value : ");
                int key_va = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());

                Ceasarcipher ceasar_cipher=new Ceasarcipher();

                String ctext = ceasar_cipher.ceasar_encryption(usr_text, key_va);

                System.out.print("\n[-] The encrypted text : " + ctext);

                String dtext = ceasar_cipher.ceasar_decryption(ctext, key_va);


                System.out.print(" \n[-] The decrypted text : " + dtext);





        } catch (Exception e) {
            System.out.print("\n[-] Exception has been caught !!!");
            System.out.print("\n[-] Dont Panic Just rerun the script correctly ");
        }

            

    }

}