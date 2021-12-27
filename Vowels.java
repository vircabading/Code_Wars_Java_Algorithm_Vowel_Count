///////////////////////////////////////////////////////////
//  VOWELS CLASS
///////////////////////////////////////////////////////////

public class Vowels {

    public static int getCount(String str) {
        int vowelsCount = 0;
        
        for (int idx=0; idx < str.length(); idx++) {
            if (    str[idx].equals("a") || 
                    str[idx].equals("e") ||  
                    str[idx].equals("i") ||
                    str[idx].equals("o") ||
                    str[idx].equals("u")) {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }  
}