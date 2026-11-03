public class PigLatin {
    public static void main(String[] args) {
		System.out.println(pigLatin("I love starcraft"));
	}
	
	public static String translate(String msg){
		if (msg.length()>2){
			return (msg.substring(1) + msg.charAt(0) + "ay");
		}else{
			return msg;
}
}

	public static String pigLatin(String msg){
		String result = "";
		int spaceIndex = msg.indexOf(" ");
		while (spaceIndex!=-1){
			String hi = msg.substring(0, spaceIndex);
			result+= translate(hi)+" ";
			msg= msg.substring(spaceIndex+1);
			spaceIndex = msg.indexOf(" ");
		}result+= translate(msg);
		return result;
}
}
