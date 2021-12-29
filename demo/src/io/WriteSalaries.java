package io;

import java.io.RandomAccessFile;

public class WriteSalaries {

	public static void main(String[] args) throws Exception {
		 var raf = new RandomAccessFile("employees.dat","rw");
		 
		 for(int i = 1; i <= 10; i ++) {
			 var salary = (int) Math.round(Math.random() * 500000) + 500000;
		     raf.writeInt(salary);
		 } // for 

		 raf.close();
	}

}
