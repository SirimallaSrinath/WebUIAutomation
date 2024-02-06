package com.sampleprac;

public class ExceptionClass {

	public static void main(String[] args) {
		
		System.out.println("START");
		
		int[] intdata = new int[3];
		
		try {
		Thread.sleep(1000);
		intdata[0] = 1;
		System.out.println(intdata[0]);
		System.out.println(intdata[4]);
		}
		
		catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println(exception.toString());
		}
		catch(InterruptedException exception1) {
			System.out.println(exception1.toString());
		}
		finally {
			System.out.println("END");
		}
		
	}

}
