/* UNIVERSIDADE FEDERAL DE ITAJUBÁ
   INSTITUTO DE MATEMÁTICA E COMPUTAÇÃO
   
   COM242 - SISTEMAS DISTRIBUIDOS

   Código Inicial: Rafael Frinhani 
   Adaptação: Nixon Silva

   08/10/2022
   
   RMI - Exemplo de implementação
   Programa que utiliza funções remotas para realizar o
   cálculo da distância entre 2 pontos num plano cartesiano.
   
   Servidor
*/

import java.rmi.registry.Registry; 
import java.rmi.registry.LocateRegistry; 
import java.rmi.RemoteException; 
import java.rmi.server.UnicastRemoteObject; 
import java.rmi.Naming;

public class Server
{ 
    public Server () {} 

    public static void main (String args[]) 
    { 
        try 
        { 
            Registry registryRef = java.rmi.registry.LocateRegistry.createRegistry(1099);
            Naming.rebind("rmi://localhost:1099/CalculationObject", new CalculationObject());
        } 
        catch (Exception e) 
        { 
            System.out.println("ERRO no Servidor (Exception): " + e.toString()); 
            e.printStackTrace(); 
        }
    } 
}
