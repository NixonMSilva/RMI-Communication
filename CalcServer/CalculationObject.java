/* UNIVERSIDADE FEDERAL DE ITAJUBÁ
   INSTITUTO DE MATEMÁTICA E COMPUTAÇÃO
   
   COM242 - SISTEMAS DISTRIBUIDOS

   Código Inicial: Rafael Frinhani 
   Adaptação: Nixon Silva

   08/10/2022
   
   RMI - Exemplo de implementação
   Programa que utiliza funções remotas para realizar o
   cálculo da distância entre 2 pontos num plano cartesiano.
   
   Implementação da interface dos Objetos Remotos
*/

import java.rmi.*;
import java.rmi.server.*;
import java.lang.Math;

// Classe no servidor que implementa os métodos remotos
public class CalculationObject extends UnicastRemoteObject implements Calculation
{ 
   public CalculationObject () throws RemoteException {}

	public double Distance2Points (double x1, double y1, double x2, double y2) throws RemoteException
	{
		double dist = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		System.out.println("Distancia entre (" + x1 + ", " + y1 + ") e (" + x2 + ", " + y2 + ") = " + dist);
		return dist;
	}
} 