package io;

import java.io.RandomAccessFile;

public class ReadSalary {

	public static void main(String[] args) throws Exception {
		var raf = new RandomAccessFile("employees.dat", "r");

		int empid = 9;

		int pos = (empid - 1) * 4;
		raf.seek(pos);
		System.out.println(raf.readInt());
		raf.close();
	}

}
