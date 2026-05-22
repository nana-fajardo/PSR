package guiaTwo;

public class C5 {
	public static int [][] rotacionHoraria(int [][] m){
		int [][] r = new int [m[0].length][m.length];
	
		for(int i = 0; i < m.length; ++i) {
			for(int j = 0; j < m[0].length; ++j) {
				r[j][m.length - 1 - i] = m[i][j];//i rotadas van a corresponder a la cantidad de espacios que puede ocupar (m.legth-1) menos la posición actual (i), y las columnas (j) será las filas
			}
		}
	
		return r;
	
	}

}
