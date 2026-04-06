
public class OMenorNumero {
	
	public int oMenorNumeroEh(int [] menor) {
		
		int armazenaN = menor[0];
		
		
		for(int i = 0; i < menor.length; i++) {
		   if(menor[i] < armazenaN) {
			   armazenaN = menor[i];
		   }
			
			
		}
		return armazenaN;
		
		
		
		
		
	}

}
