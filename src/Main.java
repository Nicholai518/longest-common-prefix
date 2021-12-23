import java.util.ArrayList;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        String[] strs = new String[]{"flower", "flow", "flight"};

	   // System.out.println("This should return 3: " + strs.length);
        System.out.println("strs includes Flower, Flow and Flight");
        System.out.println("Answer should be fl");
        System.out.println(longestCommonPrefix(strs));


        System.out.println(""); // space

//        String[] strsTwo = new String[]{"dog", "racecar", "car"};
//        System.out.println("strsTwo includes dog, racecar and car");
//        System.out.println("Answer should be empty string");
//        System.out.println(longestCommonPrefix(strsTwo));



    }

    public static String longestCommonPrefix(String[] strs){

        int stringCharacterCount = 0;

        // by default, assign the first string length
        int shortestStringLength =  strs[0].length();
        String shortestString = strs[0];

        // character to be compared
        char currentChar;

        // current word
        String currentWord="";

        // prefix to be returned, empty string by default
        StringBuilder longestCommonPrefix = new StringBuilder();

        // find out how many strings are in the array in total
        int howManyStringsInArray = strs.length;

        // find the shortest string in the array
        for(int i=0; i<howManyStringsInArray-1; i++){
            stringCharacterCount = strs[i].length();

            if (stringCharacterCount < shortestStringLength){
                // update shortestStringLength and shortestString
                shortestStringLength = stringCharacterCount;
                shortestString = strs[i];
            }

            // reset stringCharacterCount for next iteration
            stringCharacterCount = 0;
        }

        // build a new array that does NOT contain the contain the shortest word
        int remainingWords = strs.length -1;
       // String[] wordsToCompare = new String[remainingWords];
        ArrayList<String> notTheShortestWord = new ArrayList<String>();
        for(int j=0; j<remainingWords; j++){
            //strs[j].equalsIgnoreCase(shortestString)
                    //!Objects.equals(strs[j], shortestString)
            if(!(strs[j].equalsIgnoreCase(shortestString))){
                notTheShortestWord.add(strs[j]);
               // wordsToCompare[j] = strs[j];
            }
        }

        // flag
        boolean flag;
        // I need a for loop where j < shortestStringLength -1
        for(int k=0; k<shortestStringLength-1; k++){
            flag = false;

            // current char of the shortest string
            currentChar = shortestString.charAt(k);

            // need to compare to the current index of every OTHER word in new array
            for(int l=0; l< notTheShortestWord.size(); l++){

                currentWord = notTheShortestWord.get(l);

                // if the current char of the shortest word, matches the character at the same index of OTHER words, update flag
                if(currentChar == currentWord.charAt(k)){
                    flag = true;
                }
                else{
                    flag = false;
                }
            }
            // if flag is true, then all words have the same character at the given index
            if(flag){
                longestCommonPrefix.append(currentChar);
            }
        }


        // need another for loop, this will check the index character at each string in the array

        // return string
        return longestCommonPrefix.toString();
    }
}
