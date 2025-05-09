/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio1semana3;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author User
 */
public class Alejandra_Garrido_Estructura {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduzca cantidad de palabras: ");
        int opcion = 0;
        
        
        while (opcion != 5){
            System.out.println("****Menú Principal****");
            System.out.println("1. Palabra al revés");
            System.out.println("2. Número perfcto");
            System.out.println("3. Primos");
            System.out.println("4. Votaciones");
            System.out.println("5. Salir");
            System.out.println("Seleccione una opción: ");
           opcion = scanner.nextInt();
           
           switch (opcion){
               case 1 :
                   char letra;
                   String alreves ="", palabraLarga = "";
                   int cantidadltr= 0;
                   
                   System.out.println("Ingrese cantidad de palabra: ");
                   int cantidadPlb = scanner.nextInt();                   
                                
                    for (int i=1; i<cantidadPlb;i++){
                        System.out.println("");
                        System.out.println("Ingrese la palabra"+i+":");
                        String palabra = scanner.next();
                        
                        int size=palabra.length(), resta=size-1;
                        alreves="";
                        
                    for (int j=0; j<=resta; j++){
                        letra=palabra.charAt(resta-j);
                        alreves += letra;
                    }
                        System.out.println("Palabra"+i+":"+palabra);
                        System.out.println("Al reves: "+alreves);
                        
                        if (palabra.length() > cantidadltr){
                            cantidadltr = palabra.length();
                            palabraLarga = palabra;
                        }
                    }
                    
                    System.out.println("Palabra más larga: "+palabraLarga);
                    String invert = "";
                    
                    for (int j = palabraLarga.length()-1; j >=0;j--){
                        invert += palabraLarga.charAt(j);
                    }
        //Número Perfecto
             case 2 :
                    opcion++; //con esto incrementamos el contador de la opcion 2
                    int sumaDivisores = 0;
                    System.out.print("Ingrese un número: ");
                    int numero = scanner.nextInt();
                    for (int i = 1; i < numero; i++) {
                        if (numero % i == 0) {
                            sumaDivisores += i;
                        }
                    }
                    if (sumaDivisores == numero) {
                        System.out.println(numero + " es un numero perfecto.");
                    } else {
                        System.out.println(numero + " no es un numero perfecto.");
                    }
                    
        //Número Primos
             case 3 :
                    opcion++; 
                    Random random = new Random ();
                    int divisor = 0;
                    System.out.print("Ingrese un numero para comprobar si es perfecto: ");
                    int numx = random.nextInt(1,100);
                                                     
                    System.out.println("El número es: " +numx);
                    System.out.println("Sus divisores: ");
                    
                    for (int i = 1; i < numx; i++) {
                        if (numx % i == 0) {
                            System.out.println(i+"");
                            divisor++;
                        }
                    }
                    if (divisor == 2) {
                        System.out.println("Es un número primo");
                    } else {
                        System.out.println("No es un número primo");
                    }
                    break;
            //Votaciones
              case 4 :
                  System.out.println("Cuántos votantes hay en el país?: ");
                    int cantVotos = scanner.nextInt();
                    int azul = 0, rojo = 0, negro = 0, amarillo = 0, nulo = 0;
                    
                    for (int contadores = 1; contadores <= cantVotos; contadores++) {
                        System.out.println("Elija la planilla: ");
                        System.out.println("Votante #: " + contadores);
                        System.out.println("1. Azul");
                        System.out.println("2. Rojo");
                        System.out.println("3. Negro");
                        System.out.println("4. Amarillo");
                        int planilla = scanner.nextInt(); 
                        
                        switch (planilla) {
                            case 1:
                                azul++;
                                break;
                            case 2:
                                rojo++;
                                break;
                            case 3:
                                negro++;
                                break;
                            case 4:
                                amarillo++;
                                break;
                            default:
                                nulo++;
                                System.out.println("Voto Nulo");
                                break;
                        }
                    }
                    
                    int votosValidos = azul + rojo + negro + amarillo;
                    double porcentaje = (votosValidos * 100.0) / cantVotos;
                    
                    // Mostrar los resultados
                    System.out.println("--- Resultados de la votación ---");
                    System.out.println("Votos AZUL: " + azul);
                    System.out.println("Votos ROJO: " + rojo);
                    System.out.println("Votos NEGRO: " + negro);
                    System.out.println("Votos AMARILLO: " + amarillo);
                    System.out.println("Votos NULOS: " + nulo);
                    
                    if (porcentaje < 60) {
                        System.out.println("VOTACIÓN FALLIDA - El porcentaje de votos válidos es menor que el 60%.");
                    } else {
                        String ganador = " ";
                        int mayor = 0;

                        // Determina el ganador según los votos
                        if (azul > mayor) {
                            ganador = "AZUL";
                            mayor = azul;
                        }
                        if (rojo > mayor) {
                            ganador = "ROJO";
                            mayor = rojo;
                        }
                        if (negro > mayor) {
                            ganador = "NEGRO";
                            mayor = negro;
                        }
                        if (amarillo > mayor) {
                            ganador = "AMARILLO";
                            mayor = amarillo;
                        }

                        // Mostrará el ganador
                        System.out.println("La planilla ganadora es: " + ganador + " con " + mayor + " votos");
     }
           }                     

                }

            }
}   
