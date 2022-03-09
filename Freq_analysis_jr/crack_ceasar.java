package Freq_analysis_jr;

import java.util.Map;


public class crack_ceasar {

        // freq of each letters in the encrypted text 
        private frqanalysis frqan;

        public crack_ceasar () {

            frqan = new frqanalysis();

        }

        public void Crack_ceasar(String str) {

            // Mapping to store the character - freq pairs 
            Map<Character,Integer> lttrfrq= frqan.run(str);


            // O(N) search to find the max entry with max frq
            Map.Entry<Character,Integer> maxEntry= null;

            for (Map.Entry<Character, Integer> entry : lttrfrq.entrySet()) {

                if ( maxEntry == null || entry.getValue().compareTo(maxEntry.getValue) > 0) {

                    maxEntry = entry;
                }
            }

            char maxentry = maxEntry.getKey();

            int apt_key = constants.Alphabets.indexOf(maxentry) - constants.Alphabets.indexOf(' ');


            System.out.print("[-] The approximated key : " +  apt_key);
        }


}