import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class MenorNumeroTeste {
	
	@Test
	void menorNumeroEh() {
		
		OMenorNumero mn = new OMenorNumero();
		
		int [] lista = {-1,6,10};
		
		int resultado = mn.oMenorNumeroEh(lista);
		
		assertEquals(-1, resultado);
	}

}
