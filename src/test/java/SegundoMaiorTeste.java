


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SegundoMaiorTeste {

	
	@Test 
	void segundoMaiorEh() {
		
		SegundoMaior sm = new SegundoMaior();
		
		
		int [] osm = {2,6,7,2,8,9};
		
		
		int resultado = sm.segundoM(osm);
				
		assertEquals(8, resultado);
	}
}
