public class Palindrome {
    public static void main(String[] args) {
		System.out.println(isPalindrome("Amy, must I jujitsu my ma?"));
    }
    
    public static boolean isPalindrome(String str){
		str = removeNonLetter(str);
		String reverseStr = "";
		for (int i = 0; i<str.length(); i++){
			reverseStr += str.charAt(str.length()-1-i);
		}
		return reverseStr.equals(str);
	}
	
	public static String removeNonLetter(String a){
		String hi = "";
		String nonLetters = ",.:;()[]{}!?@#$%^&* ";
		for (int i = 0; i<a.length(); i++){
			if (nonLetters.indexOf(a.charAt(i))==(-1)){
				hi+=a.charAt(i);
			}
		}return hi.toLowerCase();
	}
}
