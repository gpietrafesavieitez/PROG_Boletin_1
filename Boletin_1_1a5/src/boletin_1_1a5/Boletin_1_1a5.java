package boletin_1_1a5;
import java.util.Scanner;

public class Boletin_1_1a5 {
    
    public static Scanner leer = new Scanner(System.in);
    
    //Area triángulo
    public static void ejer1(){ 
        int base = 4, alt = 3;
        System.out.println("- El área del triángulo es de " + (base * alt) / 2 + " unidades.");
    }
    
    //Área cuadrado
    public static void ejer2(){
        int lado = 3;
        System.out.println("- El área del cuadrado es de " + (lado * lado) + " unidades.");
    }
    
    //Conversión euros a dólares
    public static void ejer3(){
        float euros, cambio;
        
        do{ //Validación
            System.out.print("Introduce la cantidad en euros: "); euros = leer.nextFloat();
            System.out.print("Introduce el cambio: "); cambio = leer.nextFloat();
            
        }while(euros < 0 || cambio < 0); //No puede ser negativo
        
        System.out.println("- " + euros + " euros son aproximadamente " + (euros * cambio) + " dólares.");
    }
    
    //Calculín
    public static void ejer4(){
 
        System.out.print("Introduce número 1: "); float num1 = leer.nextInt();
        System.out.print("Introduce número 2: "); float num2 = leer.nextInt();
        System.out.println("- Suma = " + (num1 + num2) + "\n- Resta = " + (num1 - num2) + "\n- Producto = " + (num1 * num2) + "\n- División = " + (num1 / num2));
    }
    
    //Conversión millas a metros
    public static void ejer5(){

        System.out.print("Introduce la cantidad en millas marinas: "); float millas = leer.nextInt();
        System.out.println("- " + millas + " millas marinas son aproximadamente " + (millas * 1852) + " metros.");
    }

    public static void main(String[] args) {
        int key;
        
        do{
            System.out.println("\n[1] Ejercicio 1\n[2] Ejercicio 2\n[3] Ejercicio 3\n[4] Ejercicio 4\n[5] Ejercicio 5\n[0] Salir\n"); key = leer.nextInt();
            
            switch(key){
                case 0: System.out.print("Hasta luego!"); break;
                case 1: ejer1(); break;
                case 2: ejer2(); break;
                case 3: ejer3(); break;
                case 4: ejer4(); break;
                case 5: ejer5(); break;
                default: System.out.print("Selecciona una opción válida!"); break;
                
               }
            
        }while(key != 0);
    }
}