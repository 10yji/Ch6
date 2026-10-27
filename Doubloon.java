public class Doubloon {
    public static void main(String[] args) {
		boolean result = isDoubloon("aapbb");
		System.out.println(result);
	}
	
	public static boolean isDoubloon(String str){
		str.toLowerCase();
		for (int i = 0; i<str.length(); i++){
			char c = str.charAt(i);
			int count = countLetter(str, c);
			if (count!=2){
				return false;
			}	
	}return true;
	}
	public static int countLetter(String str, char c){
		str.toLowerCase();
		int num = 0;
		for (int i = 0; i<str.length(); i++){
			 if (str.charAt(i) == c){
			 num++;
		 }
	}return num;
}
}
