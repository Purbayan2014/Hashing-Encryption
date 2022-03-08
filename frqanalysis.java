import java.util.Map;

public class frqanalysis {

  
    private static final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private static Map<Character, Integer> run(String str) {

        str = str.toUpperCase();

        Map<Character, Integer> frq=new HashMap<>();

        for(int i=0;i<alphabet.length();++i) {
            frq.compute(alphabet.charAt(i), 0);
        }


        for(int i = 0;i<str.length;++i) {

            char ch = str.charAt(i);

            if (alphabet.indexOf(ch) != -1)
             frq.put(ch, frq.get(ch)+1);

        }

        return frq;

    }


    private static void shw(String str) {

        Map<Character, Integer> frq= run(str);

        for (Map.Entry<Character,Integer> entry : frq.entrySet())
          System.out.format("[-] Character %s has a frq of %s%n", entry.getKey(), entry.getValue());

    }


    public static void main(String[] args) throws IOException{
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        try
        {
                System.out.print("[-] Provide the encrypted text ");
                String str = br.readLine();

                shw(str);




        } catch(Exception ignored) {};


    }
    

}