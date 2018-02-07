/* *****************************************
* CSCI205 - Software Engineering and Design
* Spring 2016
* Instructor: Your instructor
* Section: List time of your lecture
*
* Name: Anushikha Sharma
* Date: 01/29/2016
*
* Lab / Assignment: Lab03
*
* Description: String Challenge
*
* *****************************************/
package lab03;

/**
 * The StringChallenge class is used to evaluate several different string
 * exercises from lab03.
 *
 * @author brk009
 */
public class StringChallenge {

    /**
     * Count the number of vowels in a string.
     *
     * @param s The string to test
     * @return The number of vowels in <code>s</code>
     */
    public static int countVowels(String s) {
	    int counter = 0;
	    for(int i = 0; i < s.length(); i++) {
		switch (s.charAt(i)) {
		case 'a': 
		case 'e': 
		case 'i': 
		case 'o': 
		case 'u':
		counter++; break;
		}
	     return counter;
	    }
	    return counter;
    }
	    

     

    /**
     * Count the number of vowels in a string. This method uses recursion
     *
     * @param s The string to test
     * @return The number of vowels in <code>s</code>
     */
    public static int countVowelsRec(String s) {
	if (s.length()== 0){
	    return 0;
	} else{
	    int index = countVowelsRec(s.substring(1));
	    switch (s.charAt(0)){
	    case 'a':
	    case 'e': 
	    case 'i':
	    case 'o':
	    case 'u':
		return index + 1;
	    default:
		return index;
	    }
	}
	}

    /**
     * check if the string is a palindrome
     *
     */
    public static boolean isPalindrome(String s) {
	if(s.length() == 0 || s.length() == 1){
            return true; 
	}
	else if (s.charAt(0) == s.charAt(s.length()-1)){
	    return false;
	}
	else {
	    return false;
	}
    }
    /**
     * swapping the first and the last letter
     *
     */
    public static String swapFirstAndLastLetter(String s) {
	int length = s.length();
	if (length <= 1) {
	    return s;
	} else {
	    return s.charAt(length - 1) + s.substring(1, length - 1) + s.charAt(0);
	}
	}

    /**
     * remove a string from a string
     *
     */
    public static String withoutString(String s, String sRemove){
	System.out.println(s.replace(sRemove, ""));
	int index = s.indexOf("(");
	System.out.println(s.substring(0, index + 1));
	return "";
    }  

/**
     * return the sum of all the numbers that appear in a string
     *
     */
    public static int sumNumbersInString(String s) {
	int sum = 0;
	for (char i : s.replaceAll("\\D", "").toCharArray()) {
	    sum += i - '0';
	}
	System.out.println(sum);
	return 0;
    }

    /**
     * Main program to test out each String processing method
     */
     public static void main(String[] args) {
//       String sTest = "Mississippi River";
//       System.out.printf("countVowels(\"%s\") = %d\n", sTest, countVowels(sTest));
//	 System.out.printf("countVowelsRec(\"%s\") = %d\n", sTest, countVowelsRec(sTest));

//       System.out.printf("isPalindrome(\"%s\") = %b\n", sTest, isPalindrome(sTest));
//       sTest = "amanapanama";
//       System.out.printf("isPalindrome(\"%s\") = %b\n", sTest, isPalindrome(sTest));

//       sTest = "Testing";
//       System.out.printf("swapFirstAndLastLetter(\"%s\") = \"%s\"\n", sTest, swapFirstAndLastLetter(sTest));
//       sTest = "Testing123";
//       System.out.printf("swapFirstAndLastLetter(\"%s\") = \"%s\"\n", sTest, swapFirstAndLastLetter(sTest));

//	 sTest = "Testing Running Walking Jumping";
//	 System.out.printf("withoutString(\"%s\",\"%s\") = \"%s\"\n", sTest, "ing", withoutString(sTest, "ing"));
//	 System.out.printf("withoutString(\"%s\",\"%s\") = \"%s\"\n", sTest, "Sleep", withoutString(sTest, "Sleep"));

//	 sTest = "a1b2c3";
//	 System.out.printf("sumNumbersInString(\"%s\") = %d\n", sTest, sumNumbersInString(sTest));
//	 sTest = "aa12bb34cc56dd78";
//	 System.out.printf("sumNumbersInString(\"%s\") = %d\n", sTest, sumNumbersInString(sTest));
     }
}