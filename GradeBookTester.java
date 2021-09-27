import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTester{
	
	private GradeBook sagiv;
	private GradeBook danielle;
	
	
	@Before
	public void Setup() {
		sagiv = new GradeBook(5);
		sagiv.addScore(50.5);
		sagiv.addScore(60.6);
		sagiv.addScore(70.7);
		
		danielle = new GradeBook(5);
		danielle.addScore(20.2);
		danielle.addScore(30.3);
		danielle.addScore(40.4);
			
		
	}
	
	
	@After
	public void tearDown() {
		sagiv = null;
		danielle = null;
				
	}
	
@Test
public void addScoreTest() {
	assertTrue(sagiv.toString().equals("50.5 60.6 70.7 "));
	assertTrue (danielle.toString().equals("20.2 30.3 40.4 "));
assertEquals(sagiv.getScoreSize(),3);
assertEquals(danielle.getScoreSize(),3);


}

@Test
public void sumTest() {
	
	assertEquals(181.8,sagiv.sum(),1);
	assertEquals(90.9,danielle.sum(),1);
	
	
}

@Test
public void minimumTest() {
	
	assertEquals( 50.5, sagiv.minimum(),1);
	assertEquals( 20.2, danielle.minimum(),1);
	
}

@Test
public void finalScoreTest() {
	
	assertEquals ( 131.5, sagiv.finalScore(),1);
	assertEquals ( 70.7, danielle.finalScore(),1);
	
	
}



}