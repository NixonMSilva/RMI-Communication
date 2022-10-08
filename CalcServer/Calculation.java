/* UNIVERSIDADE FEDERAL DE ITAJUBÁ
   INSTITUTO DE MATEMÁTICA E COMPUTAÇÃO
   
   COM242 - SISTEMAS DISTRIBUIDOS

   Código Inicial: Rafael Frinhani 
   Adaptação: Nixon Silva

   08/10/2022
   
   RMI - Exemplo de implementação
   Programa que utiliza funções remotas para realizar o
   cálculo da distância entre 2 pontos num plano cartesiano.
   
   INTERFACE dos Objetos Remotos
*/

import java.rmi.Remote; 
import java.rmi.RemoteException;  

// Criação de uma interface chamada Calc, que define os contratos para acesso as funções de cada operação
public interface Calculation extends Remote 
{  
   public double Distance2Points (double x1, double y1, double x2, double y2) throws RemoteException;
}