import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTeste {
	
	@Test
	void deveSomarDoisNumeros() {
		Calculadora calc = new Calculadora();
		
		int resultado = calc.somar(2,3);
		
		assertEquals(5, resultado);
	}

}
