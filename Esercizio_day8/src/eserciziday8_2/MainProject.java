package eserciziday8_2;

import java.util.Random;
import java.util.List;

public class MainProject {

	public static void main(String[] args) {
		int[] arr = generateRandomArray(3000);
	}
	
	private static int[] generateRandomArray(int size);
	Random rand = new Random();
	int[] numArr = new int[size];
	for (int i=0; i < size; i++) {
		numArr[i] = rand.nextInt(25);
	}
	return numArr;


@Override
public void run() {
// TODO Auto-generated method stub

}
}

}
