package chainPattern;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
class UnitTestOfchainPattern {
	
	

	@Test
	void chainTest() {
		Chain chainCalc1=new AddNumbers();
		Chain chainCalc2=new SubNumbers();
		Chain chainCalc3=new MultNumbers();
		Chain chainCalc4=new DivNumbers();
		chainCalc1.setNextChain(chainCalc2);
		chainCalc2.setNextChain(chainCalc3);
		chainCalc3.setNextChain(chainCalc4);
		
		assertEquals(5.0,chainCalc1.calculate(new Numbers(3.0,2.0,"add")),"");
		assertEquals(1.5,chainCalc1.calculate(new Numbers(3.0,2.0,"div")),"");
		assertEquals(6.0,chainCalc1.calculate(new Numbers(3.0,2.0,"mult")),"");
		assertEquals(6.0,chainCalc1.calculate(new Numbers(9.0,3.0,"sub")),"");
		
	}

}
