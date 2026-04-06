import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class SomaTudoTeste {
	
	
	@Test
	void somando() {
		
		SomarTudo st = new SomarTudo();
		
		
		int [] somaT = {1,2,3};
		
		int resultado = st.vaiSomando(somaT);
		
		
		assertEquals(6, resultado);
		
	}

}
