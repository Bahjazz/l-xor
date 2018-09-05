package prog2;

import java.util.Scanner;

public class uppgifter {

	public static void main(String[] args) {

		int sum = 0;

		int[] arr = {1,2,3,4,5,8,9,9};

		for (int i = 0; i < arr.length; i++) {
			
			sum = sum + arr[i];		}
		System.out.println(sum);
	}

}
