



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class VerificaPares {
	
	
	@Test
	void verificarPares() {
		
		VerificandoPar ver = new VerificandoPar();
		
		int [] par = {2,4,5,6,8,10};
		
		int resultado = ver.somouPares(par);
		
		assertEquals(5, resultado);
	}

}
