package com.arrays;

public class DiagonalSum_Cw {

	public static void main(String[] args) {

		System.out.println("Main method started");
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int pSum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j) {
					pSum = pSum + arr[i][j];

				}
			}

		}
		System.out.println("Primary Diagonal Sum:" + pSum);

		int Ssum = 0;
		int i = 0;
		int j = arr[i].length - 1; // 0-row 1-col row lenght =3 (1,2,3) arr[i] indicates=rowlength-1
		while (i < arr.length && j >= 0) {
// i(0) it increases < 3(arr.length)  && 2>=0  it decreases
			if (i != j) {
				Ssum = Ssum + arr[i][j]; //1 1 
			}
			i++;
			j--;
		}

		int totSum = Ssum + pSum;
		System.out.println("Secondary Diagonal Sum:" + Ssum);
		System.out.println("Total sum:" + totSum);

	}

}
