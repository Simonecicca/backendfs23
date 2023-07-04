package eserizioday6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ProgrammaArray {
	 public static void main(String[] args) {
		int[] numArray = createArr(); 
		 
	 }
 public static int[] createArr() {
	 
	 int[] arr = new int[5];
	 Random random = new Random();
	 
	 
	 for (int i=0; i < arr.length; i++) {
		 arr[i] = random.nextInt(10) +1;
	 }
	 System.out.println("Original arr: " + Arrays.toString(arr));
	 
	 Scanner scanner = new Scanner(System.in);
	 
	 int  numero;
	 int  position;
	}
}
