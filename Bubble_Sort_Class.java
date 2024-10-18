package assignment1;

import java.util.Scanner;

public class Bubble_Sort_Class {
	public static void bubbleSort(String[] names) {
		int n = names.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {

				if (names[j].compareTo(names[j + 1]) > 0) {

					String temp = names[j];
					names[j] = names[j + 1];
					names[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of names: ");
		int n = sc.nextInt();
		sc.nextLine();
		String[] name = new String[n];

		System.out.println("Enter " + n + " names:");
		for (int i = 0; i < n; i++) {
			name[i] = sc.nextLine();
		}
		System.out.println("Sorted names:");
		for (String name1 : name) {
			System.out.println(name1);
		}

	}

}
