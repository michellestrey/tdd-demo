
public class VerificandoPar {
	
	
	public int somouPares(int [] pares) {
		
		int contouPares = 0;
		
		for(int i = 0; i < pares.length; i++ ) {
			if(pares[i] %2 == 0) {
				contouPares ++;
			}
		}	
		return contouPares;
	}

}
