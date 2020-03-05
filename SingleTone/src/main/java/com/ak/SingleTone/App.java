package com.ak.SingleTone;

import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		A a = A.getInstance();
		A a1 = A.getInstance();
		
		// System.out.println(a);
		// System.out.println(a1);
		System.out.println("Enter row number:");
		Scanner sc = new Scanner(System.in);
		int rowNum = sc.nextInt();
		Row rx = a.getRowForMe(rowNum);
		
		Row ry = a.getInstance().getRowForMe(rowNum);
		
		// Create a DataFormatter to format and get each cell's value as String
		DataFormatter dataFormatter = new DataFormatter();
		System.out.println("DATA from EXCEL FILE ");
		for (Cell cell : rx) 
		{
			String cellValue = dataFormatter.formatCellValue(cell);
			System.out.print(cellValue + "\t");
		}
		System.out.println();
		
		
		

	}
}
