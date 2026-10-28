public class Gauss {
    public static void main(String[] args) {
		System.out.println(gauss(3, 5));
	}
	
	public static double gauss(double x, double n){
    double sum = 0.0;
    double term = 1.0;
    
    for (int i = 0; i<n; i++){
		term += term*(-x*x)/i;

    
    }return sum;
}
}
