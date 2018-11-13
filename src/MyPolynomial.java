import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyPolynomial {
	
	private double[] coeffs;
	
	public MyPolynomial(double... coeffs) {
		this.coeffs = coeffs;
	}
	
	public MyPolynomial(String filename) {
		Scanner in = null;
		
		try {
			in = new Scanner(new File(filename));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int degree = in.nextInt();
		coeffs = new double[degree+1];
		for (int i=0; i<coeffs.length; ++i) {
			coeffs[i] = in.nextDouble();
		}
	}
	
	public double getDegree() {
		return coeffs.length -1;
	}
	@Override
	public String toString() {
		String s = "";
		for (int i=coeffs.length -1; i >= 1; i--) {
			if (coeffs[i] != 0.0) {
				if (i == 1) {
					s = s + coeffs[i] + "x + ";
				} else {
					s = s + coeffs[i] + "x^" + i + "+ ";
				}
			}
		}
		if (coeffs[0] != 0.0) {
			s = s + coeffs[0];
		}
		return s;
	}
	public double evaluate (double x) {
		double acc = 0;
		for (int i=0; i < coeffs.length ;i++) {
			acc += coeffs[i] * Math.pow(x, i);
		}
		return acc;
	}
	
	public double[] getCoeffs() {
		return coeffs;
	}
	public MyPolynomial add(MyPolynomial p) {
		double newDegree = Math.max(getDegree(), p.getDegree());
		double[] coeffsResult = new double[(int) (newDegree + 1)];
		double[] coeffsBiggest;
		double[] coeffsSmallest;
		
		if (getDegree() > p.getDegree()) {
			coeffsBiggest = coeffs;
			coeffsSmallest = p.getCoeffs();
		} else {
			coeffsBiggest = p.getCoeffs();
			coeffsSmallest = coeffs;
		}
		for (int i=0; i<coeffsBiggest.length; i++) {
			coeffsResult[i] = coeffsBiggest[i];
		}
		for (int i=0; i<coeffsSmallest.length; i++) {
			coeffsResult[i] = coeffsResult[i] + coeffsSmallest[i];
		}
		return new MyPolynomial(coeffsResult);
	}
	public void multiply() {
		
		
	}
	
}
