package guiaTwo;

public class C14 {
	public static int [][] multiplicacion(int [][] m, int [][]b){
		if (m == null || b == null || m[0].length != b.length) {
			return null;
		}
		
		int [][] r = new int [m.length][b[0].length];
		
		for(int i = 0; i < m.length; ++i) {//tomo las filas de la primera matriz
			for(int j = 0; j < b[0].length; ++j) {//tomo las columnas de la segunda matriz
				for(int p = 0; p < b[0].length; ++p) {//variable auxiliar que recorre como si fuera las columnas de 1°matriz y como filas de 2°matriz
					
					r[i][j] += m[i][p] * b[p][j];//multiplico lo que el elemnto de la m y p cuando en paralelo tienen la columna y la misma fila, los sumo y los guardo en esa posición de la matriz resultado	
				}
			}
		}
	return r;	
	}


}
