package guiaOne;

public class C20 {

	public static int maxVocales (String s, int k) {
		String vocales = "aeiouAEIOU";
		int max = 0;
		int actual = 0;
		
		for(int i = 0; i < k && i < s.length(); ++i) {//recorro s mientras no supere la subcadena ni la longitud de s
			if(vocales.indexOf(s.charAt(i)) == 1) {//saco el caracter en la posicion i y lo busco con lo que hay en vocales
				actual++;//incremento si i era una vocal
			}
		}
		
		max = actual;
		
		for(int i = k; i < s.length(); ++i) {
			if(vocales.indexOf(s.charAt(i)) == 1) {
				max++;
			}
			
			if(vocales.indexOf(s.charAt(i - k)) == 1) {//resto la subcadena a la posición actual para sacar del contador max la vocal anterior al grupo actual
				max--;
			}
		max = Math.max(max, actual);//saco el valor mayor entre los dos contadores
	
		}
		
		return max;
	
	}

}
