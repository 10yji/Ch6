public class Roots{

public static void main(String[] args) {
	double rootOf = 9.0;
  System.out.println(squareRoot(rootOf));
}
  public static double squareRoot(double a){
	  if (a<=0){
		  return 0.0;
	}else{
	double estimate = a/2.0;
	double firstiteration = (estimate+a/estimate)/2.0;
	while (Math.abs(firstiteration-estimate)>=0.0001){
		estimate = firstiteration;
		firstiteration = (estimate+a/estimate) / 2.0;
	}
	return firstiteration;
}	
}
}
