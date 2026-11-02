public class Binary {
    public static void main(String[] args) {
		System.out.println(convertToBinary(12));
	}
	
	public static String convertToBinary (int num){
		String hi = "";
		int i = num;
		while (i>0){
			int p = i%2;
			hi=String.valueOf(p)+hi;
			i=i/2;
		}return hi;
}
}
