package eserciziday8_2;

import java.util.Random;

public class MultiThreads {

	public static void main(String[] args) throws InterruptedException {
		int[] array = generateRandomArray(3000);
		int[] sommaParziale = new int[3];
		Thread[] threads = Thread[3];
		
		for (int i=0; i < 3; i++)  {
			int startIndex = i*1000;
			int endIndex = startIndex + 999;
		}

	}

}
