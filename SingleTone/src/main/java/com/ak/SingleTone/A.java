package com.ak.SingleTone;

import java.io.File;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class A {
	static A a;
	static Sheet sh;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return "cloning does not supported.";
	}

	private A() {
		try {
			Workbook wk = WorkbookFactory.create(new File("C:\\Users\\jitu\\Desktop\\datatypeinjava.xlsx"));
			sh = wk.getSheetAt(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static A getInstance() {
		if (a == null) {
			a = new A();
			return a;
		}
		return a;
	}

	public static Row getRowForMe(int rowNum) {
		if (sh != null) {
			return sh.getRow(rowNum);
		} else {
			return null;
		}

	}

}
