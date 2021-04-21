/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg1.pkgif;
import java.util.Scanner;
/**
 *
 * @author End User
 */
public class Actividad1If {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int AñoActual = 2021;
       int AñoEscrito, Pasado, Futuro;
       
       Scanner sc = new Scanner(System.in);
       System.out.print("¿Qué año desea diferenciar de su año actual? ");
       AñoEscrito = sc.nextInt();
        
      if (AñoActual > AñoEscrito){
      Pasado = AñoActual - AñoEscrito;
      System.out.print("Han pasado " + Pasado + " años");
      } else { 
          Futuro = AñoEscrito - AñoActual;
      System.out.print("Faltan " + Futuro + " años");
      }
    }
    
}
