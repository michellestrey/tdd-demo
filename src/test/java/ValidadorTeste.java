import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class ValidadorTeste {
	
	
	@Test
	void deveVerificarEhPar() {
		
		Validador val = new Validador();
		
		boolean resultado = val.ehPar(6);
		
		
		assertEquals(true, resultado);
		
	}
	

	
}
