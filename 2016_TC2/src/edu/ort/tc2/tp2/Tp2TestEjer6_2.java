package edu.ort.tc2.tp2;

public class Tp2TestEjer6_2 {

	public static void main(String[] args) {
		
		crearMatriz();
		
		for (int i = 0; i < crearMatriz().length; i++) 
		{
			for (int j = 0; j < crearMatriz()[i].length; j++) 
			{
				System.out.print(crearMatriz()[i][j] +"|");
			}
			System.out.println();
		}
	}
	
	public static int[][] crearMatriz()
	{
		int[][] matriz = new int [6][5];
		int num = 1;
		
		int ultimaFila = matriz.length-1;
		
		for (int i = 0; i < matriz.length-1; i++) 
		{
			int suma = 0;
			for (int j = 0; j < matriz[i].length; j++) 
			{
				matriz[i][j] = num;
				num++;
				
				suma += matriz[i][j];
				matriz[ultimaFila][j] = suma;
			}
			
		}
				
		return matriz;
	}
}
