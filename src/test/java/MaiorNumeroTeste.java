import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.Test;

public class MaiorNumeroTeste {

	
	@Test
	void encontraMaiorNumero() {
		
		MaiorNumero maiorN = new MaiorNumero();
		
		int [] numero = {1,3,10};
		
		int resultado = maiorN.maiorNumeroEncontrado(numero);
		
		assertEquals(10, resultado);
	}
}
