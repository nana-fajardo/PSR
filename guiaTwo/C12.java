package guiaTwo;

public class C12 {

	public static boolean matrizIdentidad (int [][] m) {
		
		if(m == null || m.length == 0 || m.length != m[0].length) {//verifica que no sea nula, que tenga más de una celda y que tenga misma cantidad de filas y columnas 
			return false;
		}
		
		for(int i = 0; i < m.length; ++i) {
			for(int j = 0; j < m[i].length; j = 0) {
				if(i == j) {//si está en una de las posiciones de la diagonal 
					if (m[i][j]!= 1) {//si no hay un 1 en esa casilla
						return false;//no es identidad
					}
				}else {//si no es una casilla de la diagonal
					if(m[i][j] != 0) {//y tiene algo distinto de 0
						return false;//no es identidad
					}
				}
			}
		}
		
		return true; //si no se verificalos dos sub if es identidad
	}

}
