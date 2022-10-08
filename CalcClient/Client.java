/* UNIVERSIDADE FEDERAL DE ITAJUBÁ
   INSTITUTO DE MATEMÁTICA E COMPUTAÇÃO
   
   COM242 - SISTEMAS DISTRIBUIDOS

   Código Inicial: Rafael Frinhani 
   Adaptação: Nixon Silva

   08/10/2022
   
   RMI - Exemplo de implementação
   Programa que utiliza funções remotas para realizar o
   cálculo da distância entre 2 pontos num plano cartesiano.
   
   Cliente
*/

import java.rmi.registry.LocateRegistry; 
import java.rmi.registry.Registry;  
import java.rmi.*;
import java.util.Scanner;

public class Client 
{  
	private Client () {}
	
	public static void main (String[] args) 
	{  
		Scanner keyboard = new Scanner(System.in);

		// Standard input on data
		System.out.println("Entre com valores x1 e y1 separados por espaço:");
		double x1 = keyboard.nextDouble();
		double y1 = keyboard.nextDouble();
		System.out.println("");
		System.out.println("Entre com valores x2 e y2 separados por espaço:");
		double x2 = keyboard.nextDouble();
		double y2 = keyboard.nextDouble();
	
		try 
		{  
			// Procur o registro do objeto remoto implementado no servidor 
			Calculation stub = (Calculation) Naming.lookup("rmi://localhost:1099/CalculationObject"); 
			// Chamada ao Método Remoto usando o objeto criado
			System.out.println("Enviando dados...");
			// Chamando a função e obtendo a resposta
			double resposta = stub.Distance2Points(x1, y1, x2, y2);
			System.out.println("Recebendo resposta...");
			System.out.println("Resposta: " + resposta);
		} 
		catch (Exception e) 
		{
			System.err.println("ERRO no Cliente (Exception): " + e.toString()); 
			e.printStackTrace(); 
		} 
	} 
}