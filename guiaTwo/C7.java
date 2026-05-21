package guiaTwo;

public class C7 {
	public static boolean matrizSimetrica(int [][] m) {
		if(m == null || m.length == 0 || m.length != m[0].length) {//verifico que no sea nula, que tenga más de un elemento y que tenga misma cantidad de filas y columnas
		return false;
		}	
		
		for(int i = 0; i < m.length; ++i) {
			for(int j = i + 1; j < m.length; ++j) {//empieza en una posición siguiente a i para tomar solo los valores del lado derecho 
				if(m[i][j] != m[j][i]) {//chequeo si la posicion inversa al lado derecho no es igual a lo que contiene la actual
					return false;//no es simétrica si ocurre
				}
			}
		}
	
		return true;
	}
}
