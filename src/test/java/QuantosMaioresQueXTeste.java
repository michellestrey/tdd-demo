import static org.junit.Assert.assertEquals;



import org.junit.jupiter.api.Test;

public class QuantosMaioresQueXTeste {
	
	
	@Test
	void nMaioresQueX() {
		
		MaioresQX mx = new MaioresQX();
		
		int [] num = {3,8,18};
		
		int resultado = mx.ehMaiorQX(num, 1);
		
		assertEquals(3, resultado);
	}

}
