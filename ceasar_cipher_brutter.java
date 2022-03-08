import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ceasar_cipher_brutter {

    private static final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private static void crack(String str)
    {
        StringBuilder plain_text=new StringBuilder();
        String str_t = str.toUpperCase();

        for (int key=0;key<alphabet.length();++key)
        {
            plain_text.append(" ");
            for (int i =0;i<str_t.length();i++)
            {
                char ch = str_t.charAt(i);
                int index = alphabet.indexOf(ch);
                int encrypted_index  = Math.floorMod((index + key) , alphabet.length());
                plain_text.append(alphabet.charAt(encrypted_index));


            }

            // return plain_text.toString();
            System.out.print("[-] With key value "+key+" the decrypted text is "+plain_text);
        }

       // return "Cracked";

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));

        try {

            System.out.print("\n [-] String encrypted - ");
            String encrypted = bufferedReader.readLine();

            crack(encrypted);


        }catch (Exception ignored){};


    }


}
