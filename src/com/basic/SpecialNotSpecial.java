package com.basic;

import java.util.Scanner;

public class SpecialNotSpecial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		String split[] = word.split(" ");

		int i = 0, flag = 0, j = 0, count = 0, m = 0;
		for (m = 0; m < split.length; m++) {
			char arr[] = split[m].toCharArray();

			for (i = 2; i < arr.length; i++) {
				if (arr.length % i == 0)
					flag = 1;

				if (flag == 0) {
					if (m % 2 == 1 && Character.isUpperCase(arr[0]))
						count++;
				} else
					count = 0;
			}
		}
		if (count >= 1)
			System.out.println("Special");
		else
			System.out.println("Not Special");
	}
}
