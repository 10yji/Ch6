public class Gauss {
    public static void main(String[] args) {
		System.out.println(gauss(1.0, 5.0));
	}
	
	public static double gauss(double x, double n){
    double sum = 0.0;
    double term = 1.0;
    
    for (int i = 0; i<n; i++){
		if (i>0){
		term = term*(-x*x)/i;
} sum+=term;
    
    }return sum;
}
}
