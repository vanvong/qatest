package com.twobulls.qatest.assessment;

public class Task8 {
	public static final int[] TEST_DATA = {2, 5, 10, 100};
	
	public static final int TARGET = 10;
	
	public static void main(String[] args) {
		for(int i = 0; i < TEST_DATA.length; i++) {
			if(TEST_DATA[i] == TARGET) {
				System.out.println("TEST_DATA[" + i + "] = " + TEST_DATA[i] + " -> Equals to 10");
			} else {
				System.out.println("TEST_DATA[" + i + "] = " + TEST_DATA[i] + " -> Doesn't equal to 10");
			}
		}
	}
}
