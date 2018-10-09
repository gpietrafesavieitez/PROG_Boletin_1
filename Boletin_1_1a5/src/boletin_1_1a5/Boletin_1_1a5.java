package boletin_1_1a5;
import java.util.Scanner;

public class Boletin_1_1a5 { //Comentario de prueba 1
    
    //Area triángulo
    public static void ejer1(){ 
        int base = 3,alt = 4;
        System.out.println("[-] El área del triángulo es " + (base * alt) + " unidades.");
    }
    
    //Área cuadrado
    public static void ejer2(){
        int lado = 3;
        System.out.println("[-] El área del rectángulo es "+ (lado * lado) + " unidades.");
    }
    
    //Conversión euros a dólares
    public static void ejer3(){
        float euros,cambio;
        Scanner leer = new Scanner(System.in);
        
        do{ //Validación
            System.out.print("[-] Introduce la cantidad en euros:");
            euros = leer.nextFloat();
            System.out.print("[-] Introduce la cantidad el cambio:");
            cambio = leer.nextFloat();
        }while(euros < 0 || cambio < 0); //No puede ser negativo
        System.out.println("[-] " + euros + " euros son aproximadamente " + (euros * cambio) + " dólares.\n");
    }
    
    //Calculín
    public static void ejer4(){
        Scanner leer = new Scanner(System.in);
 
        System.out.println("[-] Introduce número 1:");
        float num1 = leer.nextInt();
        System.out.println("[-] Introduce número 2:");
        float num2 = leer.nextInt();
        System.out.println("Suma = " + (num1 + num2) + "\nResta = " + (num1 - num2) + "\nProducto = " + (num1 * num2) + "\nDivisión = " + (num1 / num2));
    }
    
    //Conversión millas a metros
    public static void ejer5(){
        Scanner leer = new Scanner(System.in);

        System.out.println("[-] Introduce la cantidad en millas:");
        float millas = leer.nextInt();
        System.out.println("[-] " + millas + " millas son aproximadamente " + (millas * 1852) + " metros.");
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int key;
        
        do{
            System.out.println("[1] Ejercicio 1\n[2] Ejercicio 2\n[3] Ejercicio 3\n[4] Ejercicio 4\n[5] Ejercicio 5\n[0] Salir");
            
            key = leer.nextInt();
            
            switch(key){
                case 0: System.out.println("¡Hasta luego!"); break;
                case 1: ejer1(); break;
                case 2: ejer2(); break;
                case 3: ejer3(); break;
                case 4: ejer4(); break;
                case 5: ejer5(); break;
                default: System.out.println("Selecciona una opción válida"); break;
               }
        }while(key != 0);
    }
}