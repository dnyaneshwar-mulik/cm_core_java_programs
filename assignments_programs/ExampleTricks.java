package assignments_programs;

import java.util.Scanner;

public class ExampleTricks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int [3];
		String [] strr = new String[3];
 		System.out.println("enter roll numbers & names");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			strr[i]=sc.next();
		}
		System.out.println("entered details are");
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]+" "+strr[i]);
		}
	}
}
