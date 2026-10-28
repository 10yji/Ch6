public class Scrabble {
    public static void main(String[] args) {
		System.out.println(canSpell("hello", "helomaggie"));
    }
    
    public static boolean canSpell(String word, String tiles){
		int n = 0;
		for (int i = 0; i<word.length(); i++){
			if (howManyLetters(word, word.charAt(i)) <= howManyLetters(tiles, word.charAt(i))){
				n++;
			
		} 
	} return n==word.length();
}
	
	public static int howManyLetters(String str, char c){
		int result = 0;
		for (int i = 0; i<str.length(); i++){
				if (str.charAt(i) == c){
					result++;
				}
	}return result;
	}
}
