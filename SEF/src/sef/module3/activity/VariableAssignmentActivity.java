/**
 * 
 */
package sef.module3.activity;

/**
 * @author 
 *
 */
public class VariableAssignmentActivity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// 1- Declare a variable of type int and assign it default value.
		// 2- Update the value 
		// 3- Print updated value to the console
		int a = 1;
		double b = a;
		double c = 1.5;
		int d;
		d=(int)c;
		do {
			++d;
			System.out.println(d);
		} while (d<10 || d>0);
		System.out.println(d);
	}

}
