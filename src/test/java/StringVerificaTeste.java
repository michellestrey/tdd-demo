
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class StringVerificaTeste {
	
	
	@Test
	void verificaTotalCaracteres() {
		
		StringMax str = new StringMax();
		
		boolean resultado = str.senhaValida("Mic1");
		
		assertTrue(resultado);
	}

}
