/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author Byron Aurelio Panimboza Urresto
 * 
 * La Unión Europea ha decidido premiar al país que más toneladas de hortalizas 
 * exporte a lo largo del año. Se dispone de un registro de transacciones
 * comerciales en el que aparecen tres valores en cada apunte.
 * 
 * El primer valor es el indicativo del país (E: España, F: Francia y A: Alemania),
 * el segundo valor es un indicativo de la hortaliza que se ha vendido
 * en una transacción (T: Tomate, P: Patata, E: Espinaca) y el tercer valor indica
 * las toneladas que se han vendido en esa transacción. Diseñar un programa que lea
 * desde el teclado este registro, el cual termina siempre al leer un país con
 * indicativo ’@’, y que diga qué país es el que más hortalizas exporta y las
 * toneladas que exporta.
 * 
 * Por ejemplo, con la entrada
 * E T 10 E T 4 E P 1 E P 1 E E 2 F T 15 F T 6 F P 20 A E 40 @
 * El país que más vende es Francia con un total de 41 toneladas
 * 
 */
public class Hortalizas_UE {
    public static void main(String []args){
  
        char stop = ' ', hortaliza = ' ';
        int sumE = 0, sumF = 0, sumA = 0;
        String resultadoS = null;
        int resultadoI = 0;
        Scanner entrada = new Scanner(System.in);
        
         System.out.println("Introduce los valores de la siguiente forma: Letra Pais  Letra Hortaliza  Numero Toneladas");
        
         //Bucle For donde se comprobara en cada iteracion el pais y se sumaran las toneladas
        while(stop != '@'){
            stop = entrada.next().charAt(0);
            if(stop != '@') {
                if(stop == 'E' || stop == 'F' || stop == 'A') {
                    hortaliza = entrada.next().charAt(0);
                    switch(stop){
                        case 'E':
                            sumE += entrada.nextInt();
                            break;
                        case 'F':
                            sumF += entrada.nextInt();
                            break;
                        case 'A':
                            sumA += entrada.nextInt();
                            break;
                    }
                }
                else System.out.println("El formato introducido no es correcto");
                }
           
        } 
        
        //Una vez tengamos la suma total hay que comprobar cual de los tres ha acumulado mas
        if(sumE > sumF && sumE > sumA){ 
            resultadoS = "España"; 
            resultadoI = sumE;
        } else if(sumF > sumE && sumF > sumA){
            resultadoS = "Francia"; 
            resultadoI = sumF;
        } else if(sumA > sumE && sumA > sumF){
            resultadoS = "Alemania"; 
            resultadoI = sumA;
        } else {
            if (sumE == sumF) {
                resultadoS = "España y Francia"; 
                resultadoI = sumE;
            } 
            if(sumE == sumA){
                resultadoS = "España y Alemania"; 
                resultadoI = sumE;
            }
            if(sumF == sumA){
                resultadoS = "Francia y Alemania"; 
                resultadoI = sumF;
            }
            
        }
        if (resultadoI > 0)
            System.out.println("El Pais que mas vende es " + resultadoS + " con un total de " + resultadoI + " toneladas" );






    
    
    
    
    }
}
