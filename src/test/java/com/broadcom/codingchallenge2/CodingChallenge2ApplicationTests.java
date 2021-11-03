package com.broadcom.codingchallenge2;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class CodingChallenge2ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testme() {
		MaxProductFinder finder = new MaxProductFinder( );	
		int maxNum = finder.getMaxProduct( 8 ) ;
		assertEquals(18, maxNum );		

	}

}
