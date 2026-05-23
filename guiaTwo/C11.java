package guiaTwo;

public class C11 {
	public static Integer determinante(int [][] m){
		if(m == null || m.length != m[0].length || m.length * m[0].length > 10) {//verifico que la matriz sea cuadrada y que no supere los 9 elementos (que llegue hasta 3x3)
			return null;
		}
		
		if(m.length == 2) {//si no ocurre ningun caso de los anterior, verifica que sea 2x2
			return m[0][0] * m[1][1] - m[0][1] * m[1][0];//multiplica las diagonales y las resta entre sí
		}
		
		int p = m[0][0] * m[1][1] * m[2][2] + m[0][1] * m[1][2] * m[2][0] + m[0][2] * m[1][0] * m[2][1];
		//multiplico la 1° diagonal principal (desde la esquina superior izq hacia abajo) la sumo con la 2° diagonal y con la 3° 
		
		int s = m[0][2] * m[1][1] * m[2][0] + m[0][0] * m[1][2] * m[2][1] + m[0][1] * m[1][0] * m[2][2];
		//multiplico la 1° diagonal secundaria (desde la esquina izq hacia arriba) la sumo con la 2° diagonal y con la 3°
		
		return p - s;
		//resto la suma de las diagonales (Regla de Sarrus) que seria el determinante		
	}


}
