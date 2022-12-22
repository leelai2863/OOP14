package bai1;

public class MyPolynomial {
	double[] coeffs;
	
	public MyPolynomial(double Coeffs) {
		coeffs = new double[(int) Coeffs+1];
		for(int i = 0; i < Coeffs; i++)
		{
			coeffs[(int)i] = i;
		}
	}
	public int getDegree() {
		return coeffs.length;
	}
	@Override
	public String toString() {
		String index = " ";
		if(coeffs.length > 1) {
			index = "0.0 + ";
			for(int i = 1; i < coeffs.length; i++) {
				index += coeffs[i] + "x^" + coeffs[i];
				if(i < coeffs.length - 1)
					index += " + ";
			}
		}
		else	
			index += "0.0";
		return index;
	}
	public double evaluate(double x) {
		double index = 0;	
		for(int i = 0; i < coeffs.length; i++)
			index += coeffs[i]*Math.pow(x, coeffs.length);
		return index;
	}
	public MyPolynomial add(MyPolynomial right) {
		double index = "";
	}
}
