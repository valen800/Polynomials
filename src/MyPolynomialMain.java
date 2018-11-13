
public class MyPolynomialMain {

	public static void main(String[] args) {
		
		MyPolynomial p = new MyPolynomial(1, 2, 3, 6);
		MyPolynomial p2 = new MyPolynomial(2, 3, 2);
		System.out.println(p.toString());
		System.out.println();
		System.out.println(p.evaluate(2));
		System.out.println();
		System.out.println(p.add(p2));
		
		
	}

}
