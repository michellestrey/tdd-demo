
public class MaiorNumero {
	
	public int maiorNumeroEncontrado(int [] numeros) {
		
		int maiorNumero = numeros[0];
		
		for(int i = 0; i < numeros.length ; i++) {
			 if(numeros[i] > maiorNumero) {
				 maiorNumero = numeros[i];
				 
			 }
		}
		 return maiorNumero;	
		
	}

}
