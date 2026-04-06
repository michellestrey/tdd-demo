
public class SegundoMaior {
	
	public int segundoM(int [] osegm) { //8
		
		int segundoM = osegm[0];
		
		int primeiroM = osegm[0];
		
		
		for(int i = 0; i < osegm.length; i++) {
			
			if(osegm[i] > primeiroM) {
				segundoM = primeiroM;
				primeiroM = osegm[i];	
			} else if (osegm[i] > segundoM && osegm[i] != primeiroM) {
				segundoM = osegm[i];
			}
			
		}
		
		return segundoM;
		
		
		
	}

}
