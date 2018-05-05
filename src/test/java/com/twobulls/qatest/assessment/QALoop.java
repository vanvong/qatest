package com.twobulls.qatest.assessment;

import org.testng.Assert;
import org.testng.annotations.Test;

public class QALoop {
	
	public static final int FROM = 4;
	
	public static final int TO = 55;
	
	public static final int EXPECTED_COUNT = 52;
	
	@Test
	public void testForCount4To55() {
		int count = 0;
		for(int i = FROM; i <= TO; i++) {
			count++;
		}
		
		Assert.assertEquals(count, EXPECTED_COUNT);
	}
	
	@Test
	public void testWhileCount4To55() {
		int count = 0;
		int i = FROM;
		while(i <= TO) {
			count++;
			i++;
		}
		
		Assert.assertEquals(count, EXPECTED_COUNT);
	}
}
