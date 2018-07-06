package com.basic;

import java.util.Arrays;
import java.util.Scanner;

public class MathFunctions {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		char ch[] = a.toCharArray();
		char charr[] = b.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(charr);
		if(ch.length == charr.length) {
		System.out.println("Anagram");
	}else
		System.out.println("not Anagram");}

}
