/**
 * 
 */
package trainingcodes;

/**
 * @author Ankita Patil
 *
 */
import java.util.Arrays;
public class ArrayCode7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {10,30,25,68,40,15,90,78,144,71,54,8};
		int arr2[]= {90,78,10,30,25,144,71,54,8,68,40,15};//if 888 is added output is array not equal6

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		if(arr1.length==arr2.length) {
			for(int i=1;i<arr1.length;i++) {
				if(arr1[i]!=arr2[i]) {
					System.out.println("Arrays not rqual");
					System.exit(0);//breaking or terminating 
					}
				}
				System.out.println("Arrays are equal");
			}
		 else {
				System.out.println("Arrays are not equal");
			}
		}

	}
	


