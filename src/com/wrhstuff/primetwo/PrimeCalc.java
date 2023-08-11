package com.wrhstuff.primetwo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PrimeCalc {
	
	static ArrayList<Integer> list = new ArrayList<Integer>();
	
	public static void LoadPrimes(String file) {

		try {
			// the file to be opened for reading
			FileInputStream fis = new FileInputStream(file);
			Scanner sc = new Scanner(fis); // file to be scanned
			// returns true if there is another line to read
			while (sc.hasNextLine()) {
				Integer number = Integer.parseInt(sc.nextLine());
				System.out.println("load = " + number);
				list.add(number);
			}
			sc.close(); // closes the scanner
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoadPrimes("C:\\Users\\willi\\Documents\\million.txt");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(999997));
		System.out.println(list.get(999998));
		double x = java.lang.Math.log10(list.get(999997)) + java.lang.Math.log10(list.get(999998));
		System.out.println(Math.pow(10,x));
		System.out.println(list.get(999997) * list.get(999998));
			}

}
