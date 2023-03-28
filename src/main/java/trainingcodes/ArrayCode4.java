/**
 * 
 */
package trainingcodes;

/**
 * @author Ankita Patil
 *
 */
import java.util.Scanner;
public class ArrayCode4{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Enter the count of moviehouse:");
	Scanner sc =new Scanner(System.in);
	int mov =sc.nextInt();
	System.out.println("Enter the count of theatre in each movie house");
	int thr=sc.nextInt();
	System.out.println("Enter the count ofscreens in each theater:");
	int scr=sc.nextInt();
	int arr[][][]=new int[mov][thr][scr];
	for(int i=0;i<arr.length;i++) {
		System.out.println("inside the movie house:"+(i+1));
		for(int j=0;j<arr[i].length;j++) {
			System.out.println("inside the theater no:"+(j+1));
			for(int k=0;k<arr[i][j].length;k++) {
				System.out.println("Enter the capacity of screen no:"+(k+1));
				arr[i][j][k]=sc.nextInt();
			}
		}
		
	}
	System.out.println("-------------");
	for(int i=0;i<arr.length;i++) {
		System.out.println("inside the movie houde:"+(i+1));
		for(int j=0;j<arr[i].length;j++) {
			System.out.println("inside the theater no:"+(j+1));
			for(int k=0;k<arr[i][j].length;k++) {
				System.out.println("the funds collected from screen no:"+(k+1));
				int fund=arr[i][j][k]*350;
				System.out.println(fund);
			}
		}
	}
	}
}