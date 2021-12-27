///////////////////////////////////////////////////////////
//  VOWELS CLASS
///////////////////////////////////////////////////////////

public class Vowels {

    public static int getCount(String str) {
        int vowelsCount = 0;
        
        for (int idx=0; idx < str.length(); idx++) {
            if ( isVowel(str[idx]) ) {
                vowelsCount++;
            }
        }

        return vowelsCount;
    }

    public static boolean isVowel(String char) {
        if ( (char.equals("a") || (char.equals("e") || (char.equals("i") || (char.equals("o") || (char.equals("u") ) {
            return true;
        }
        return false;
    }
  
}