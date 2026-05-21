package guiaTwo;

public class C13 {

	public static boolean matrizDiagonal(int [][] m) {
		if(m == null || m.length == 0 || m.length != m[0].length) {//verifico que no sea nula, que tenga más de un elemento y que tenga misma cantidad de filas y columnas
			return false;
		}
		
		for(int i = 0; i < m.length-1; ++i) {
			for(int j = 0; j < m[0].length-1; ++j) {
				if (i != j) {//si la fila es distinta que la columna
					if (m[i][j] != 0) {//verifica que en las posiciones donde la fila es distinta a la columna haya 0
					return false;//no es diagonal si en esas posiciones hay algo distinto de 0
					}
				}	
			}
		}
	return true; 
	}
}
