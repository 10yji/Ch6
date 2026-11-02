public class PPAP {
    public static void main(String[] args) {
		String result = PPAP("I have a study, I have a go");
		System.out.println(result);
	}
	
	public static String PPAP(String a){
		int n = a.indexOf(",");
		String object1 = a.substring(8, n);
		String object2 = a.substring(19+object1.length());
		String capital = object2.toUpperCase();
		String hi = capital.substring(0,1)+object2.substring(1);
		String res = ("Uh! " + hi + object1 + ".");
		return res;
		
}
}
