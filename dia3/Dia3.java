package dia3;

import java.util.Scanner;

public class Dia3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        int opcion;
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Números Naturales Anverso");
            System.out.println("2. Números Naturales Reverso");
            System.out.println("3. Tablas de Multiplicar");
            System.out.println("4. Tablas de Multiplicar Inverso");
            System.out.println("5. Alfabeto");
            System.out.println("6. Números Pares e Impares");
            System.out.println("7. Suma de Números Naturales");
            System.out.println("8. Suma de Números Pares");
            System.out.println("9. Suma de Números Impares");
            System.out.println("10. Valores ASCII");
            System.out.println("11. Factorial");
            System.out.println("12. Exponente");
            System.out.println("13. Invertir Dígitos");
            System.out.println("14. Sumar Dígitos");
            System.out.println("15. Verificar Número Primo");
            System.out.println("16. MCD (Máximo Común Divisor)");
            System.out.println("17. Contar Positivos, Negativos y Ceros");
            System.out.println("18. Número Mayor y Menor");
            System.out.println("18. Suma de números entre 100 y 200 divisibles entre 9");
            System.out.println("0. Salir");

            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> nAnverso();
                case 2 -> nReverso();
                case 3 -> tablasMultiplicar();
                case 4 -> tablasMultiplicarInverso();
                case 5 -> alfabeto();
                case 6 -> parImpar();
                case 7 -> sumaNatural();
                case 8 -> sumaPar();
                case 9 -> sumaImpar();
                case 10 -> ascii();
                case 11 -> factorial();
                case 12 -> exponente();
                case 13 -> invertirDigito();
                case 14 -> sumarDigito();
                case 15 -> nPrimo();
                case 16 -> mcd();
                case 17 -> numerosInfinitos();
                case 18 -> lowerN();
                case 19 -> divisible9();
                case 0 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida. Intenta de nuevo.");
            }

        } while (opcion != 0);
    }
    
    static void nAnverso() {
        // Escribe un programa para imprimir todos los números naturales del 1 al n.
        System.out.print("Ingresa un número entero: ");
        int n;
        n = sc.nextInt();
        
        for(int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
    
    static void nReverso() {
        // Escribe un programa para imprimir todos los números naturales en orden inverso.
        System.out.print("Ingresa un número entero: ");
        int n;
        n = sc.nextInt();
        
        for(int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
    
    static void tablasMultiplicar() {
        // Escribe un programa para imprimir tablas de multiplicar.
        System.out.println("Tablas de multiplicar");
        System.out.println("----------------------");
        
        for(int i = 1; i <= 10; i++) {
            
            System.out.println("\nTabla del " + i);
            System.out.println("-------------");
            for(int a = 1; a <= 10; a++) {
                int result;
                result = i*a;

                System.out.println(i + " x " + a + " = " + result);
            }
        }
    }
    
    static void tablasMultiplicarInverso() {
        // Escribe un programa para imprimir tablas de multiplicar en orden inverso.
        System.out.println("Tablas de multiplicar");
        System.out.println("----------------------");
        
        for(int i = 10; i >= 1; i--) {
            
            System.out.println("\nTabla del " + i);
            System.out.println("-------------");
            for(int a = 10; a >= 1; a--) {
                int result;
                result = i*a;

                System.out.println(i + " x " + a + " = " + result);
            }
        }
    }
    
    static void alfabeto() {
        // Escribe un programa para imprimir todas las letras del alfabeto de la 'a' a la 'z'. 
        System.out.println("ALFABETO");
        for(char letra ='a'; letra<='z'; letra++) {
            System.out.print(letra + " ");
        }
        System.out.println("\n----------------------------------------------------------");
        for(char letra ='Z'; letra>='A'; letra--) {
            System.out.print(letra + " ");
        }
    }
    
    static void parImpar() {
        // Escribe un programa para imprimir todos los números pares entre 1 y 100.
        
        System.out.println("Numeros Pares");
        for(int i = 1; i < 101; i++) {
            if(i %2 == 0) {
                System.out.print(i + " ");
            }
        }
        
        System.out.println(" \n");
        
        System.out.println("Numeros Impares");
        for(int i = 1; i < 101; i++) {
            if(i %2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
    
    static void sumaNatural() {
        // Escribe un programa para encontrar la suma de todos los números naturales entre 1 y n.
        System.out.print("Ingresa un número entero: ");
        int n;
        n = sc.nextInt();
        int suma = 0;
        for(int i = 1; i <= n; i++) {
            suma += i;
            System.out.println(suma);
        }
    }
    
    static void sumaPar() {
        // Escribe un programa para encontrar la suma de todos los números pares entre 1 y n.
        System.out.print("Ingresa un número entero: ");
        int n;
        n = sc.nextInt();
        int suma = 0;
        for(int i = 0; i <= n; i++) {
            if(i %2 == 0) {
                suma += i;
                System.out.println(suma);
            }  
        }
    }
    
    static void sumaImpar() {
        // Escribe un programa para encontrar la suma de todos los números pares entre 1 y n.
        System.out.print("Ingresa un número entero: ");
        int n;
        n = sc.nextInt();
        int suma = 0;
        for(int i = 0; i <= n; i++) {
            if(i %2 != 0) {
                suma += i;
                System.out.println(suma);
            }  
        }
    }
    
    static void ascii() {
        // Escribe un programa para imprimir los valores ASCII.
        System.out.println("Caracteres ASCII del 0 al 255:");
        
        for (int i = 0; i <= 255; i++) {
            System.out.println("ASCII " + i + " = " + (char) i);
        }
    }
    
    static void factorial() {
        // Escribe un programa para encontrar el factorial de cualquier número.
        System.out.print("Ingresa un número entero: ");
        
        int n;
        n = sc.nextInt();
        int multiplicacion;
        multiplicacion = 1;
        
       for(int i = n; i >= 1; i--) {
           multiplicacion *= i;
           
       } 
        System.out.println("El factorial de " + n + " = " + multiplicacion);
    }
    
    static void exponente() {
        // Escribe un programa para calcular el valor de un número elevado a la potencia de otro.
        System.out.print("Ingrese un número entero como base: ");
        int b;
        b = sc.nextInt();
        
        System.out.print("Ingrese un número entero como exponente: ");
        int e;
        e = sc.nextInt();
        
        int result;
        result = 1;
        
        for(int i = 0; i < e; i++) {
            result *= b;
        }
        
        System.out.println(b + " con exponente " + e + " = " + result);
    }
    
    static void invertirDigito() {
        // Escribe un programa para invertir los dígitos de un número dado.
        System.out.print("Ingresa un número entero: ");
        int n;
        n = sc.nextInt();
        
        int nReverso;
        nReverso = 0;
        
        while(n != 0) {
            nReverso = nReverso * 10 + n % 10;
            n /= 10;
        }
        System.out.print("Dígitos invertidos: " + nReverso);
    }
    
    static void sumarDigito() {
       
        System.out.print("Ingresa un número entero: ");
        int n;
        n = sc.nextInt();
        
        int suma = 0;
        
        while(n != 0) {
            int digito = n % 10;
            suma += digito;
            n /= 10;
        }
        
        System.out.println("La suma de los dígitos es = " + suma);
    }
    
    static void nPrimo() {
        // Escribe un programa para verificar si un número dado es primo o no.
        System.out.print("Ingresa un número entero: ");
        int n;
        n = sc.nextInt();
        
        boolean esPrimo = true;

        if (n <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo) {
            System.out.println(n + " es un número primo.");
        } else {
            System.out.println(n + " no es un número primo.");
        }
    }
    
    static void mcd() {
        // Escribe un programa para calcular el MCD (Máximo Común Divisor) de dos números dados.
        System.out.print("Ingresa un número entero: ");
        int n1;
        n1 = sc.nextInt();
        
        System.out.print("Ingresa un número entero: ");
        int n2;
        n2 = sc.nextInt();
        
        while(n2 != 0) {
            int residuo = n1 % n2;
            n1 = n2;
            n2 = residuo;
            
        }
        System.out.println("Su MCD es = " + n1);
    }
    
    static void numerosInfinitos() {
        // Escribe un programa que permita ingresar números hasta que el usuario lo desee y, al final, muestre la
        // cantidad de números positivos, negativos y ceros ingresados.
        
        int negativos = 0;
        int positivos = 0;
        int cero = 0;
        
        char continuar;
        
        do {
            System.out.print("Ingresa un número: ");
            int n = sc.nextInt();
            
            if(n > 0) {
                positivos ++;
            } else if(n < 0) {
                negativos++;
            } else {
                cero++;
            }
            
            System.out.println("Deseas ingresar otro número(s/n): ");
            continuar = sc.next().charAt(0);
        }   while (continuar == 's' || continuar == 'S');
            System.out.println("Cantidad de números positivos: " + positivos);
            System.out.println("Cantidad de números negativos: " + negativos);
            System.out.println("Cantidad de ceros: " + cero);
    }
    
    static void lowerN() {
        // Escribe un programa que permita ingresar números hasta que el usuario lo desee y, al final, muestre el
        // número más grande y el más pequeño ingresado.
        
        char continuar;

        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        do {
            System.out.print("Ingresa un número: ");
            int n = sc.nextInt();
            
            if (n > maxi) {
                maxi = n;
            }
            if (n < mini) {
                mini = n;
            }
            
            System.out.println("Deseas ingresar otro número(s/n): ");
            continuar = sc.next().charAt(0);
        }   while (continuar == 's' || continuar == 'S');
            System.out.println("El número más grande es: " + maxi);
            System.out.println("El número más pequeño es: " + mini);
            
    }

    static void divisible9() {
        // Escribe un programa para encontrar los números y la suma de todos los enteros entre 100 y 200 que sean
        // divisibles por 9.
        int suma = 0;

        for(int i = 100; i <= 200; i++) {
            if(i % 9 == 0) {
                System.out.print(i + " + ");
                suma += i;
            }
        }

        System.out.print("El resultado es: " + suma);
    }
}
