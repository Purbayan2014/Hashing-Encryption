import java.io.*;

public class Ceasarcipher {

    private static final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";


         private static String ceasar_encryption(String str,int key_va)
         {
             StringBuilder encrypted  = new StringBuilder();
             String test = str.toUpperCase();
             for (int i =0;i<=test.length();i++)
             {
                 char ch = test.charAt(i);
                 int index = alphabet.indexOf(ch);
                 int encrypted_index  = Math.floorMod((index + key_va) , alphabet.length());
                 encrypted.append(alphabet.charAt(encrypted_index));


             }

             return encrypted.toString();

         }


         private static String ceasar_decryption(String str, int key_va)
         {
             StringBuilder decryped = new StringBuilder();
             for (int i =0;i<str.length();++i)
             {
                 char ch = str.charAt(i);
                 int index =  alphabet.indexOf(ch);
                 int decryped_index  = Math.floorMod((index - key_va) , alphabet.length());
                 decryped.append(alphabet.charAt(decryped_index));

             }

             return decryped.toString();
         }


    public static void main(String[] args) throws IOException {

        BufferedReader inputStream=new BufferedReader(new InputStreamReader(System.in));

        try
        {
          System.out.print("\n [-] Key Value - ");
          int key = Integer.parseInt(inputStream.readLine());
          System.out.print("\n [-] String to be encrypted - ");
          String usr_text = inputStream.readLine();



          String mid = ceasar_encryption(usr_text,key);
          String res = ceasar_decryption(mid,key);
          System.out.print("\n [-] Encrypted text : "+ mid);

          System.out.print("\n [-] Decrypted text : "+ res);


        }catch (Exception ignored){};


    }

}
