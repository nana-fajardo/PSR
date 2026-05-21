package guiaTwo;

public class C8 {
	public static boolean matrizAntiSimetrica(int [][] m) {
		if(m == null || m.length == 0 || m.length != m[0].length) {//verifico que no sea nula, que tenga más de un elemento y que tenga misma cantidad de filas y columnas
		return false;
		}	
		
		for(int p = 0; p < m.length; ++p) {//primero recorro toda la matriz con p
			if(m[p][p] != 0) {//verifico si las posiciones iguales (m[1][1]) contienen algo distinto de cero 
				return false;//diagona el distinta de cero, no es Antisimetrica
			}
		}
			
		for(int i = 0; i < m.length; ++i) {//recorro nuevamente cada elemento
			for(int j = i + 1; j < m.length; ++j) {//empieza en una posición siguiente a i para tomar solo los valores del lado derecho 
				if(m[i][j] != - m[j][i]) {//verifico si el elemento de la posición actual no es igual al elemento pero negativo en la posicion inversa
					return false;//no es Antisimétrica si ocurre
				}
			}
		}
	
		return true;
	}

}
