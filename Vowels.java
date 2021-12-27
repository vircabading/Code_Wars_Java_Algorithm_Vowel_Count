///////////////////////////////////////////////////////////
//  VOWELS CLASS
///////////////////////////////////////////////////////////

public class Vowels {

    public static int getCount(String str) {
        int vowelsCount = 0;
        for (int idx=0; idx < str.length(); idx++) {
            if (    Character.toString(str.charAt(idx)).equals("a") ||
                    Character.toString(str.charAt(idx)).equals("e") ||
                    Character.toString(str.charAt(idx)).equals("i") ||
                    Character.toString(str.charAt(idx)).equals("o") ||
                    Character.toString(str.charAt(idx)).equals("u") ) {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }  
}