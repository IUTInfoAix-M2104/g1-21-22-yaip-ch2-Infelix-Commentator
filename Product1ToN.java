public class Product1ToN{
	public static void main(String[] args) {
		long product = 1;      // The accumulated product, init to 1
    	final int LOWERBOUND = 1;
    	final int UPPERBOUND = 20;

    	for (long number = LOWERBOUND; number <= UPPERBOUND ; ++number ) {
    		product = product*number;
    	}

    	System.out.println(product);
	}
}