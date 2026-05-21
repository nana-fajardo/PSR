package guiaTwo;

public class C9 {
	public static boolean matrizTriangularSuperior(int [][] m) {
		if(m == null || m.length == 0 || m.length != m[0].length) {//verifico que no sea nula, que tenga más de un elemento y que tenga misma cantidad de filas y columnas
			return false;
		}
		
		for(int i = 0; i < m.length-1; ++i) {
			for(int j = 0; j < m[0].length-1; ++j) {
				if (i > j) {//si la fila es mayor que la columna
					if (m[i][j] != 0) {//verifica que en las posiciones donde la fila es mayor a la columna haya 0
					return false;//no es triangular superior si en esas posiciones hay algo distinto de 0
					}
				}	
			}
		}
	return true; 
	}

}
