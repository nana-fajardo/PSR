package guiaTwo;

public class C3 {
	public static int [][] matrizTranspuesta (int [][] m){
	
		int [][] t = new int [m[0].length][m.length];//creo donde voy a contener la transpuestas con filas y columna invertidas
		
		if(m == null || m.length == 0) {
			return -1;
		}
	
		for(int i = 0; i < m.length; ++i) {
			for (int j = 0; j < m.length; ++j) {
				t[j][i] = m[i][j];//guardo en las filas de lo que serian columnas y en columnas lo de filas (los elementos correspondientes a esas posiciones)  
			}
		}
	
		return t;
	
	}
	
	
}
