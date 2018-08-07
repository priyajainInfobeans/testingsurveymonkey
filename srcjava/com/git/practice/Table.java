package com.git.practice;

public class Table {

	public void TableNumbers(int Number) {
		int i;
		int num;
		for (i = 1; i <= 10; i++) {
			num = (Number * i);
			System.out.println(num);
		}
	}

	public void fact(int number) {
		int sum = 1;
		int i;
		for (i = number; i >= 1; i--) {
			sum = i * sum;
		}
		System.out.println(sum);

	}

	public void TableNumsum(int Number) {
		int i;
		int sum = 0;
		for (i = 1; i <= 10; i++) {
			sum = sum + (Number * i);

		}
		System.out.println(sum);

	}

	public void star(int num) {
		int i, j;
		for (i = num; i > 0; i--) {
			for (j = i; j > 0; j--) {
				System.out.print("*");

			}
			System.out.println();

		}

	}

	public void palindrome(int num) {
		int revnum;
		int rev=0;
		while (num > 0) {
			revnum = (num % 10);
			num = num / 10;
			//System.out.print(revnum);
			rev=revnum+rev*10;
		}
		System.out.println(rev);
	}

}
