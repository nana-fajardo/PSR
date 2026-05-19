package guiaOne;

public class C9 {

	public static int [] elementosMayores (int [] nums) {
		
		int [] count = new int [nums.length];//creo el arreglo contador del tamaño del arreglo a comparar
		
		for (int i = 0; i < nums.length; ++i) {
			int aux = 0;//inicio el contador de mayores
				
			for(int j = 0; j < i; ++j) {//creo otra variable que reccora una posicion anterior a la actual
				if(nums[j] > nums [i]) {//si la anterior es mayor a la actual lo incremento
					aux++;
				}
			
			count[i] = aux;//guardo los mayores contados con respecto a la posicion actual
				
			}
		}
	
	return count;
	
	}

}
