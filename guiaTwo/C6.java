package guiaTwo;

public class C6 {
	public static int [][] rotacionAntiHoraria(int [][] m){
		int [][] r = new int [m[0].length][m.length];
	
		for(int i = 0; i < m.length; ++i) {
			for(int j = 0; j < m[0].length; ++j) {
				r[m[0].length - 1 - j][i] = m[i][j];//j rotadas será la cantidad de espacios que puede ocupar (m.legth-1) menos la posición actual (i) para quedar como filas, y las columnas serán i
			}
		}
	
		return r;
	
	}


}
