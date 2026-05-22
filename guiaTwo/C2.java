package guiaTwo;

public class C2 {
	public static int [][] rotacionIzquierda(int [][] m){
		 int [][] r = new int [m.length][m[0].length];
	
		 for(int i = 0; i < m.length; ++i) {
			 for (int j = 0; j < m[0].length; ++j) {
				 
				 if(j > 0) {//si la columna es mayor a 0
					 
					 r[i][j - 1] = m[i][j];//guardo el elemento actual en el espacio de la izquierda de la matriz rotada

				 }else if(i > 0){//si la fila actual no es la primera y la columna no es mayor 0 
					 
					 r[i - 1][m[0].length-1] = m[i][j];//subo lo actual a la fila anterior 
				 
				 }
				 
				 else {//si estoy en el último elemento
				
					 r[m.length-1][m[0].length-1] = m[i][j];//lo guardo en la ultima posición de la matriz rotada 
				 
				 }
				 
			 }
		 }
	
	return r;
		 
	}
}
