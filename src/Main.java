public class Main {

    public static void main(String[] args) {
        String[] strs = new String[]{"flower", "flow", "flight"};

	    System.out.println("This should return 3: " + strs.length);

       String str= longestCommonPrefix(strs);

    }

    public static String longestCommonPrefix(String[] strs){

        int stringCharacterCount = 0;
        // by default, assign the first string length
        int shortestStringLength =  strs[0].length();

        // find out how many strings are in the array in total
        int howManyStringsInArray = strs.length;

        // find the shortest string in the array
        for(int i=0; i<howManyStringsInArray-1; i++){
            stringCharacterCount = strs[i].length();

            if (stringCharacterCount < shortestStringLength){
                shortestStringLength = stringCharacterCount;
            }

            // reset stringCharacterCount for next iteration
            stringCharacterCount = 0;
        }

        // I need a for loop where j < shortestStringLength -1

        // I need a String to hold all common characters, string should be instiated with ""

        // need another for loop, this will check the index character at each string in the array

        // return string
        return null;
    }
}
