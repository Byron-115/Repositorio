/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author byron
 */
public class Horoscopo {
        
    public static void main(String[]args){
        int day;
        String month;
        String result;
        result = null;
        Scanner entry = new Scanner(System.in);
        
        //Solicitamos datos de entrada del dia y mes
        System.out.println("Introduce tu dia de nacimiento: ");
        day = entry.nextInt();
        System.out.println("Introduce tu mes de nacimiento: ");
        month = entry.next();
        
        //Comprobamos a que signo corresponde 
       switch(month){
           case "Enero" -> {
               if(day <= 20) result = "Capricornio";
               else result = "Acuario";
            }
           case "Febrero" -> {
               if(day <= 19) result = "Acuario";
               else result = "Piscis";
            }
           case "Marzo" -> {
               if(day <= 20) result = "Piscis";
               else result = "Aries";
            }
           case "Abril" -> {
               if(day <= 20) result = "Aries";
               else result = "Tauro";
            }
           case "Mayo" -> {
               if(day <= 21) result = "Tauro";
               else result = "Géminis";
            }
           case "Junio" -> {
               if(day <= 21) result = "Géminis";
               else result = "Cáncer";
            }
           case "Julio" -> {
               if(day <= 23) result = "Cáncer";
               else result = "Leo";
            }
           case "Agosto" -> {
               if(day <= 23) result = "Leo";
               else result = "Virgo";
            }
           case "Septiembre" -> {
               if(day <= 23) result = "Virgo";
               else result = "Libra";
            }
           case "Octubre" -> {
               if(day <= 23) result = "Libra";
               else result = "Escorpio";
            }
           case "Noviembre" -> {
               if(day <= 22) result = "Escorpio";
               else result = "Sagitario";
            }
           case "Diciembre" -> {
               if(day <= 21) result = "Sagitario";
               else result = "Capricornio";
            }
           default -> System.out.println("Mes no valido o formato incorrecto Ej: Enero");  
       }
       
       //Imprimimos por pantalla el resultado obtenido
       System.out.println("El resultado es: " + result);
       
      
        
    }
    
}
