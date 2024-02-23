
package colas;

import java.util.Scanner;


public class Colas {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int opc =0 , dato;
        Cola cola = new Cola ();
        
        do {   
            
            try {
                
                System.out.println("1. Insertar Elemento en la cola.\n");
                System.out.println("2.Quitar elemento de la cola.\n");
                System.out.println("3. Salir");
                opc  = entrada.nextInt();
                
                switch (opc) {
                    case 1:
                        
                        System.out.println("Digite el numero a , Insertar: ");
                        dato = entrada.nextInt();
                        
                        cola.Insertar(dato);
                        
                        break;
                        
                    case 2: 
                        
                        if(!cola.estaVacia()){
                            System.out.println("El elemento eliminado es: "+cola.quitar());
                        }
                        
                    case 3: 
                        System.out.println("Fin del programa");
                        break;
                    default:
                        System.out.println("Opcion no valida");
                }
                
            } catch (Exception e) {
                System.out.println(e);
            }
            
        } while (opc !=3);
    }
    
}
