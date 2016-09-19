package edu.ort.tc2.tp2;

public class Tp2TestEjer7 {

	public static void main(String[] args) {
		
		int [][] m1={{1,2,3},{1,2,3},{1,2,3}};
		int [][] m2={{1,5,3},{1,2,3},{11,2,3}};
		
		if (cuadradoMagico(m1)) 
		{
			System.out.println("Es magico!");
		}
		if (cuadradoMagico(m2)) 
		{
			System.out.println("Es magico!");
		}

	}

	public static boolean cuadradoMagico(int [][] matriz)
	{
		int fila1 = matriz[0][0]+matriz[0][1]+matriz[0][2];
		int fila2 = matriz[1][0]+matriz[1][1]+matriz[1][2];
		int fila3 = matriz[2][0]+matriz[2][1]+matriz[2][2];
		boolean result=false;
		
		
		return result;
	}
}
