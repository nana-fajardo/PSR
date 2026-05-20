package guiaTwo;

public class C15 {
	public static int [] elementoMaxMin(int [][] a) { 
		int max = a[0][0]; //guardo el primer elemento de la matriz
		int filaMax = 0;
		int colMax = 0;
		
		int min = a[0][0];//guardo el primer elemento de la matriz
		int filaMin = 0;
		int colMin = 0;
		
		for(int i = 0; i < a.length; ++i) {
			for(int j = 0; j < a[i].length; ++j) {
				if(max < a[i][j]) {//recorro filas/columnas y comparo si el elemento inicial es menor al de la posicion actual es menor al inicial
					max = a[i][j];//si es menor lo guardo como el nuevo máximo para comparar en otra vuelta
					filaMax = i;
					colMax = j;
				}
				if(min > a[i][j]) {//comparo si el elemento inicial es mayor al actual 
					min = a[i][j];//lo guardo para comparar
					filaMin = i;
					colMin = j;
				}
			}
		}
		
		int [] res = {max, filaMax, colMax, min, filaMin, colMin}; //guardo en un arreglo todos los resultados para mostrarlos
		
		return res;
	}


}
