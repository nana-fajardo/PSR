package guiaTwo;

public class C1 {
	public static int [][] rotacionDerecha(int [][] m){
		 int [][] r = new int [m.length][m[0].length];
	
		 for(int i = 0; i < m.length; ++i) {
			 for (int j = 0; j < m[0].length; ++j) {
				 if(m[i][j] != m[i][m[0].length] ) {//si me queda espacio a la derecha 
					 r[i][j + 1] = m[i][j];//guardo el elemento actual en el espacio de la derecha de la matriz rotada
				 }else {//si no me queda espacio
					 r[i + 1][j] = m[i][j];//bajo lo actual a la fila siguiente 
				 }
				 if(m[i][j] == m[m.length][m[0].length]) {//si estoy en el último elemento
					 r[0][0] = m[i][j];//lo guardo en la primera posición de la matriz rotada 
				 }
				 
			 }
		 }
	
	return r;
		 
	}
}
