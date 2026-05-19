package guiaOne;

public class C18 {

	public static int [] arrayIncremento (int [] a) {
		
		for(int i = a.length - 1; i>= 0; --i) {
			if(a[i] < 9) { //si la ultima posicion es menor a 9 le sumo uno al actual y a los anteriores a este
				a[i]++;
					return a;
			}
		a[i] = 0; //si es nueve, se vuelve 0 e incremento el anterior a este en uno
		}
		
		if (a[0] == 0) {//si la primera posicion del arreglo es cero, quiere decir que llevo uno
			int [] suma = new int [a.length + 1];//creo otro arreglo con una posicionextra al original
				suma[0] = 1;//agrego el uno que me llevé a esa posicion extra
					return suma;
		
		}
		
	return a;
		
	}

}
