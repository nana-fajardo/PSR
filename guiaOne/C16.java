package guiaOne;

public class C16 {

	public static int indiceSumaExacta (String s, int k, int target) {
		
		int suma = 0;
		
		if(s == null || s.length() < k) {
			return -1;
		}
		
		for(int i = 0; i < k; ++i) {//recorro hasta los k digitos que tengo que sumar
			suma += Character.getNumericValue(s.charAt(i)); //sumo el caracter actual después de haber obtenido su valor numérico
			if (suma == target) { //si la suma es igual a mi objetivo (target)
				return 0; //devuelvo el indice, y como solo estoy trabajando con los primeros su indice va a ser 0
			}
		}
	
		for(int i = k; i < s.length(); ++i) {
			suma += Character.getNumericValue(s.charAt(i));//sumo la posición siguiente a los k digitos 
			suma -= Character.getNumericValue(s.charAt(i - k));//resto el digito de k repetido del ciclo anterior
			if (suma == target) {
				return i - k + 1;//devuelvo la posicion del grupo actual restando las k posiciones mas uno para que me el inicio del grupo
			}
		}
	
	return -1; //ninguna suma de los ciclos llegó al target
	
	}

}
