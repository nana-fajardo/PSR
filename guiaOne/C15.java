package guiaOne;

public class C15 {

	public static int [] arrayPrestamos (int [] a) {
									
		for(int i = a.length-1; i >= 0; --i) {
			if(a[i] > 0) {//si la posicion actual (num final del arreglo) es mayor a cero resto uno a la posición actual
				a[i]--;
					return a;
			}
			
			a[i] = 9; //si la posicion actual es cero, el actual se vuelve nueve, y continua comparando con las anterior 
			
		}
	
	if (a[0] == 0) {
		int [] resta = new int [a.length-1]; //nuevo arreglo con un digito restado, si hay cero a la izq ej {0,9,9}
	
		for(int i = 0; i < resta.length; ++i) {
			resta [i] = a[i + 1];//guardo en cada posición del arreglo resta, los numeros siguientes a ese 0 inicial
		}
		return resta;
		
	}
		
	return a;
	
	}
}
