
public class Main {

	/*
	 * @author Isac Canedo
	 */

	/*
	 * Which letters will print when this code is run? (Quais letras serão impressas
	 * quando este código for executado?)
	 * 
	 *  1 - A, C and D
	 *  2 - C and D
	 *  3 - A and D == correct
	 *  4 - A, B and D
	 *  
	 */

	public static void main(String[] args) {

		try {

			System.out.println("A");
			badMethod();

			System.out.println("B");

		} catch (Exception ex) {

			System.out.println("C");

		} finally {

			System.out.println("D");
		}

	}

	private static void badMethod() {

		throw new Error();

	}

}
