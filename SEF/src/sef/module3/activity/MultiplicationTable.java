/**
 *
 */
package sef.module3.activity;

/**
 * @author
 *
 */
public class MultiplicationTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		int x = 1;
		int y = 20;
		while ( x < y) {
			System.out.println ( "The value of x is:=" + x++ );
		}




// Table from 1 to 10
		for (int i = 1; i <= 10; i++) {
            System.out.println("*** Table of " + i + " ***");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "X" + j + " = " + i * j);
            }
        }
		// complete code. write for loop for int i

			// complete code. write nested for loop for int j
        for (int i = 1; i <= 10; i++) {
            System.out.println("*** Table of "+i + " ***");
            for (int j = 10; j <= 20; j++) {
                System.out.println(i + "X" + j +" = " + i*j);
            }
        }

		}


	}


