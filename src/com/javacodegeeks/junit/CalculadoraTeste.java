package com.javacodegeeks.junit;
import java.util.Random;
import static org.junit.Assert*;
import org.junit.Test;

public class CalculadoraTeste {
	Random gerador = new Random(); 
	CalculatorEngine casio = new CalculatorEngine();
	public int x, y;
	x = gerador.nextInt(100);
	y = gerador.nextInt(100);
	
	@Test
	public void testSum(){
		casio.digit(x);
		casio.add();
		casio.digit(y);
		casio.compute();
		int test = x + y;
		System.out.println("@Test soma " + casio.display() + "=" + testSum);
		assertEquals(casio.display(),test);
	}
	
	@Test
	public void testSub(){
		casio.digit(x);
		casio.subtract();
		casio.digit(y);
		casio.compute();
		int test = x - y;
		System.out.println("@Test subtração " + casio.display() + "=" + test);
		assertEquals(casio.display(),test);
	}
		
	@Test
	public void testMult(){
		casio.digit(x);
		casio.subtract();
		casio.digit(y);
		casio.compute();
		int test = x * y;
		System.out.println("@Test multiplicação " + casio.display() + "=" + test);
		assertEquals(casio.display(),test);
	}
	
	@Test
	public void testDiv(){
		casio.digit(x);
		casio.divide();
		casio.digit(y);
		casio.compute();
		int test = x / y;
		System.out.println("@Test divisão " + casio.display() + "=" + test);
		assertEquals(casio.display(),test);
	}
	
}
