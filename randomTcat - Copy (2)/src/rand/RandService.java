package rand;

import javax.jws.WebService;
import javax.jws.WebMethod;
import java.util.Random;

@WebService
public class RandService {
    private static final int maxRands = 1;
	
	public static String[] array = {"Always recycle", "Eat more vegetables and less meat from large animals", "Conserve water", "Use renewable energy", "Use public transportation", "Walk instead of using a car when possible", "Plant trees", "Use less paper", "Don't litter"}; 
	
	
	//String[] array1 = new String[1];
	String[] array2 = new String[9]; 
	String b;

	
	
	
    @WebMethod
	public String next1(){
	//public void next1() {
	
	//Random rand = new Random();
	//int  n = rand.nextInt(26) + 1;
	//array1[1] = array[rand.nextInt(26) + 1];
	//b = array[1];
	//System.out.println("Hello");
	
	Random rand = new Random();
	
	String a = array[rand.nextInt(9) + 1];
	return a;
		
	}
 /*
 //public int next1() { 
		public String next1() { 
	//return new Random().nextInt(2); 
	//Random rand = new Random();
	//int  n = rand.nextInt(26) + 1;
	Random rand = new Random();
	int  n = rand.nextInt(26) + 1;
	return array[rand.nextInt(26) + 1];
	}
*/


    @WebMethod
    //public int[ ] nextN(final int n) {
	
	public String[] nextN() {
	//final int k = (n > maxRands) ? maxRands : Math.abs(n);
	//int[ ] rands = new int[k];

	//Random r = new Random();
	//for (int i = 0; i < k; i++) rands[i] = r.nextInt(2);
	
	//Random rand = new Random();
	//int  n = rand.nextInt(9) + 1;
	
	for (int i = 0; i < array2.length; i++) {
		
		array2[i] = array[i];
		
	}
	
	
	return array2;
    }
}

