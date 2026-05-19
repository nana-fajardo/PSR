package guiaOne;

public class C10 {

	public static int elementosConsecutivos (int [] a) {
		int i = 0;
		int repActual = 0; 
		int max = 0;
		
		
		while(i < a.length) {
			int rep = 1;//inicio en uno por la aparición actual
			
			while(i + rep < a.length && a[i] == a[i + rep]) {//salto a la siguiente posicion y verifico que la anterior (a[i]) sea igual a la actual (a[i + rep])
				rep++;//si lo son sumo uno a la repetición
			}
			
			if (rep == 2) {
				
				repActual += 2;//guardo la repeticion de los numeros que aparecioeron consecutivamente
				
				max = Math.max(max, repActual);//averiguo y guardo las máximas apariciones consecutivas
			
			}else {
				
				repActual = 0;//si aparece uno o más de dos veces no se incrementa
			}
		
			i += rep;//incremento el indice para llegar al néro proximo numero distinto al actual 
		
		}
	
	return max;
		
	}

}
