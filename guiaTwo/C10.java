package guiaTwo;

public class C10 {
	public static int sumaDiagonal(int [][] a) {
		int suma = 0;
		int i = 0;
		
		if (a == null || a.length%2 != 0) {
			return -1;
		}
		
		while (i < a.length ) {//recorro la matriz mientras sea cuadrada 
			suma += a[i][i]; //sumo lo que está contenido el las posiciones que son iguales 
			i++;//incremento i para ir a la siguiente posión dpnde son iguales 
		}
		
		return suma;
		
	}


}
