package guiaOne;

public class C5 {

	public static void main(String[] args) {

	}

	public static int maxConsonantes(String s, int k) {
		int max = 0; 
		int noVocales = 0;
		String vocales = "aeiouAEIOU";
	
		for (int i = 0; i < k && i < s.length(); ++i) {
			if(vocales.indexOf(s.charAt(i)) == -1 ) { //veo la letra de la posicion i en s, y veo si está en vocales
				noVocales++;
			}
		}
		
		max = noVocales;
		
		for(int i = k; i < s.length(); ++i) {
			if(vocales.indexOf(s.charAt(i)) == -1 ) { 
				noVocales++;
			}
			
			if(vocales.indexOf(s.charAt(i-k)) == -1) {//a la posición actual le resto la "subcadena" evito valores viejo
				noVocales--;
			}		
			
			max = Math.max(max, noVocales); //guarda en max el número mayor entre max y vocales
		}		
		return max;
	}
}