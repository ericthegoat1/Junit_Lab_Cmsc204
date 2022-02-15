import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	
	private GradeBook GradeTest;
	
	
	@BeforeEach
	public void setUp()  {
		
		GradeTest = new GradeBook(10);
		GradeTest.addScore(81);
		GradeTest.addScore(95);
		GradeTest.addScore(75);
		GradeTest.addScore(62);
		
	}

	@AfterEach
	public void tearDown()  {
		GradeTest =null;
		
	}
	@Test
	public void addScoreTest() {
		assertTrue(GradeTest.toString().equals("81.0 95.0 75.0 62.0 "));
		assertEquals(GradeTest.getScoreSize(), 4);
	}
	@Test
	public void sumTest() {
		assertEquals(313, GradeTest.sum());
		
		
	}
	@Test
	public void minimumTest() {
		assertEquals(62.0, GradeTest.minimum());
		
		
	}
	@Test
	public void finalScoreTest() {
		assertEquals(251, GradeTest.finalScore());
		
	}
	
	
	
	
	
	
	
	
	

}