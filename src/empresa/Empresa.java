/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import empleado.Empleado;
import java.util.Scanner;

/**
 *
 * @author 503
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int opcion;
        int contador=0;
        
        int edad=50;
        Empleado[] empleados=new Empleado[5];
        
        do{
            
            System.out.println("Bienvenidos");
            System.out.println("*****************");
            System.out.println("1. Agregar Empleado");
            System.out.println("2. Mostrar Empleado");
            System.out.println("3. Mostrar Empleados");
            System.out.println("4. salir");
            System.out.println("");
            
            System.out.print("Digite una opcion: ");
            opcion=entrada.nextInt();
            
            switch(opcion){
                
                case 1:
                    //contador=0
                    empleados[contador]=new Empleado();
                    
                    System.out.println("Digita el id: ");
                    empleados[contador].setId(entrada.nextInt());
                    System.out.println("Digita nombre");
                    empleados[contador].setNombre(entrada.next());
                    System.out.println("Digite el cargo: ");
                    empleados[contador].setCargo(entrada.next());
                    System.out.println("Digite el salario: ");
                    empleados[contador].setSalario(entrada.nextInt());
                    System.out.println("Digite el telefono: ");
                    empleados[contador].setTelefono(entrada.next());
                    System.out.println("Digite la direccion");
                    empleados[contador].setDireccion(entrada.next());
                    contador++;
                    
                    
                    break;
                case 2:
                    break;
                case 3:
                    
                    for(int i=0; i<contador; i++){
                        System.out.println(empleados[i].getNombre());
                    }
                    
                    break;
                case 4:
                    //msj
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;    
            }
            
            
        }while(opcion!=4);
        
    }
    
}
