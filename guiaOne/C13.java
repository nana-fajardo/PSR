package guiaOne;

public class C13 {

	public static int maxDigitosPares (String s, int k) {
		int cont = 0;
		int max = 0;
		
		for(int i = 0; i < k; ++i) {
			if (Character.getNumericValue(s.charAt(i)) % 2 == 0) { //tomo el caracter que corresponde a esa posicion i, y "convierto" al caracter a su valor numérico
				cont++;
			}
		}
		
		max = cont;
		
		for(int i = k; i < s.length(); ++i) {
			if (Character.getNumericValue(s.charAt(i)) % 2 == 0) {
				cont++;
			}
			
			if (Character.getNumericValue(s.charAt(i - k)) % 2 == 0) {//a la posición actual le resto los digitos que ya recorri y lo saco del contador si es que era par
				cont--;
			}
		
		max = Math.max(max, cont); //guardo en max el máximo valor que obtuvo entre los dos for
		
		}
	
	return max;
	
	}












}
//13) Escribir un método en java que, dado un arreglo string de dígitos y k, máximo dígitos PARES en ventana k.
//Ej: "1234567890", k=3 → 2 ("890")
