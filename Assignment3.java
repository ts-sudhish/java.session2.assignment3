/**
 * 
 */
package sdh.java.session2;

/**
 * @author sudhi
 * 
 */
public class Assignment3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int row, column;
		for (row = 1; row <= 5; row++) {
			for (column = 1; column <= row; column++) {
				System.out.print(column);
			}
			System.out.println("");
		}
		for (row = 0; row < 4; row++) {
			for (column = 1; column <= 4 - row; column++) {
				System.out.print(column);
			}
			System.out.println("");
		}
	}

}
