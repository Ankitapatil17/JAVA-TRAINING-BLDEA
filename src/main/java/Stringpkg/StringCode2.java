
/**
 * 
 */
package Stringpkg;

/**
 * @author Ankita Patil
 *
 */
public class StringCode2 {

	/**
	 * @param args
	 */
	
			public static void main(String[] args) {
				
				String str="RajaRamMohanRoy";
				System.out.println(str.length());
				System.out.println(str.toUpperCase());
				System.out.println(str.toLowerCase());
				System.out.println(str.charAt(1));
				//system.out.println(str.charAt(120));
				int a=10+str.charAt(1);
				System.out.println(a);
				System.out.println(str.indexOf('R'));
				System.out.println(str.indexOf('Z'));
				System.out.println(str.startsWith("Raja"));
				System.out.println(str.startsWith("Roja"));
				System.out.println(str.endsWith("Roy"));
				System.out.println(str.endsWith("Boy"));	
				System.out.println(str.contains("Mohan"));
				System.out.println(str.contains("Rohan"));
				System.out.println(str.contains("mohan"));


			}

		}