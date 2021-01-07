package mockito.demo.test;

import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import mockito.CalculatorService;
import mockito.MathApp;

@ExtendWith(MockitoExtension.class)
public class MathCalcTester {
	 
	@InjectMocks 
	   MathApp mathApplication = new MathApp();
	   @Mock
	   CalculatorService calcService;
	   
	   @Test
	   public void testAdd(){
	      when(calcService.add(10.0,20.0)).thenReturn(30.00);
	      //test the add functionality
	      Assert.assertEquals(mathApplication.add(10.0, 20.0),30.0,0);
	   }
	   
}
