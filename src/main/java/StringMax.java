
public class StringMax {


	public boolean senhaValida(String senha){
        if(senha == null) {
			return false;
		}
		if(senha.length() < 6) {
			return false;
		}
		// precisa ter ao menos um número
		for(int i = 0; i < senha.length(); i++) {

			char numero = senha.charAt(i);

			if(Character.isDigit(numero)) {
				return true;
			}	

		}
		return false;


	}


}


