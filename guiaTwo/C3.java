package guiaTwo;

public class C3 {
	public static double [][] Inversa( int [][] m){
		Integer det = C11.determinante(m);//aplico el método de determinante (de mi clase del ejercicio 11) a la matriz
		
		if (m.length != m[0].length || m.length > 3|| det == null || det == 0) {//me aseguro de que la matriz sea cuadrada, que no sea mas de 3x3 (no definí det para matrices más grandes)
			return null;//no se puede sacar su inversa si el det es 0
		}
	
	double [][] inv = new double [m.length][m.length];
		
		if(m.length == 2) {//si la matriz es 2x2
			inv[0][0] = m[1][1]/(double)det;//(double)-->conierte en decimal al det entero
			inv[1][1] = m[0][0]/(double)det;
			//tomo los elementos de la diagonal principal (de la matriz original) los divido por el determinante y quedan en posicion opuesta en la matriz inversa
			
			inv[0][1] = -m[0][1]/(double)det;
			inv[1][0] = -m[1][0]/(double)det;
			//tomo los elementos de la matriz secundaria (esquina inferior izq hacia arriba) se vuelven negativos y se dividen por el determinante
		
		return inv;
		}
	
		//cada posicion de las filas le saco su determinante, creando matrices 2x2, omitiendo todos los elementos que se encuentran sobre esa fila y columna
		inv[0][0] = m[1][1] * m[2][2] - m[1][2] * m[2][1];
		//ignoro todos los elementos de la fila 0 y de la columna 0, y saco el determinante de la matriz 2x2 resultante
		inv[0][1] = -(m[1][0] * m[2][2] - m[2][0] * m[1][2]);
		inv[0][2] = m[1][0] * m[2][1] - m[2][0] * m[1][1];
				
		inv[1][0] = -(m[0][1] * m[2][2] - m[2][1] * m[0][2]);
		inv[1][1] = m[0][0] * m[2][2] - m[1][0] * m[0][2];
		inv[1][2] = -(m[0][0] * m[1][1] - m[1][0] * m[0][1]);
		
		inv[2][0] = m[0][1] * m[1][2] - m[1][1] * m[0][2];
		inv[2][1] = -(m[0][0] * m[1][2] - m[1][0] * m[0][2]);
		inv[2][2] = m[0][0] * m[1][1] - m[1][0] * m[0][1];
		
		inv = C3.matrizTranspuesta(inv);//aplico el metodo de matrizTranspuesta (de mi clase del ejercicio 3) a inv
		
		for(int i = 0; i < inv.length; ++i) {//recorro la inv transpuesta 
			for(int j = 0; j < inv.length; ++j) {
				inv[i][j] = inv[i][j]/(double)det; //divido cada elemento de inv por su det
			}
		}
		
		return inv;
	}
	
}
