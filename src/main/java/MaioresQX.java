
public class MaioresQX {
	
	
	public int ehMaiorQX( int[] numeros, int x) {
	     
		int contador = 0;
		
		for(int i = 0; i < numeros.length; i ++) {
			if (numeros[i] > x) {
				contador++;
			}		
			
		}
		
		return contador;
	}

}
