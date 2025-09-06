/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico2;

import java.util.Scanner;

/**
 *
 * @author Agustin
 */
public class Ejercicios {
    
    private static final double DESCUENTO_ESPECIAL = 0.10;
    
    public static void ejercicio1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un año: ");
        int anio = sc.nextInt();

        boolean bisiesto = (anio % 400 == 0) || (anio % 4 == 0 && anio % 100 != 0);

        if (bisiesto) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }
        sc.close();
    }
    
    public static void ejercicio2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = sc.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int c = sc.nextInt();

        int mayor = a;
        if (b > mayor) mayor = b;
        if (c > mayor) mayor = c;

        System.out.println("El mayor es: " + mayor);
        sc.close();
    }
    
    public static void ejercicio3(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        String categoria;
        if (edad < 12) {
            categoria = "Niño";
        } else if (edad <= 17) {
            categoria = "Adolescente";
        } else if (edad <= 59) {
            categoria = "Adulto";
        } else {
            categoria = "Adulto mayor";
        }

        System.out.println("Eres un " + categoria + ".");
        sc.close();
    }
    
    
    public static void ejercicio4(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();

        System.out.print("Ingrese la categoría (A, B o C): ");
        char cat = sc.next().trim().toUpperCase().charAt(0);

        double porcentaje;
        switch (cat) {
            case 'A': porcentaje = 0.10; break;
            case 'B': porcentaje = 0.15; break;
            case 'C': porcentaje = 0.20; break;
            default:
                System.out.println("Categoría inválida.");
                sc.close();
                return;
        }

        double descuento = precio * porcentaje;
        double finalConDesc = precio - descuento;

        System.out.println("Descuento aplicado: " + (porcentaje * 100) + "%");
        System.out.println("Precio final: " + finalConDesc);
        sc.close();
    }

    public static void ejercicio5(){
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        while (true) {
            System.out.print("Ingrese un número (0 para terminar): ");
            int n = sc.nextInt();
            if (n == 0) break;
            if (n % 2 == 0) suma += n;
        }
        System.out.println("La suma de los números pares es: " + suma);
        sc.close();
    }
    
    public static void ejercicio6(){
        Scanner sc = new Scanner(System.in);
        int pos = 0, neg = 0, ceros = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int n = sc.nextInt();
            if (n > 0) pos++;
            else if (n < 0) neg++;
            else ceros++;
        }

        System.out.println("Resultados:");
        System.out.println("Positivos: " + pos);
        System.out.println("Negativos: " + neg);
        System.out.println("Ceros: " + ceros);
        sc.close();
    }
    
    public static void ejercicio7(){
        Scanner sc = new Scanner(System.in);
        int nota;
        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = sc.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("Nota guardada correctamente.");
        sc.close();
    }
    
    public static void ejercicio8(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio base del producto: ");
        double pb = sc.nextDouble();
        System.out.print("Ingrese el impuesto en porcentaje (Ej: 10 para 10%): ");
        double imp = sc.nextDouble();
        System.out.print("Ingrese el descuento en porcentaje (Ej: 5 para 5%): ");
        double desc = sc.nextDouble();

        double total = calcularPrecioFinal(pb, imp, desc);
        System.out.println("El precio final del producto es: " + total);
        sc.close();
    }

    public static double calcularPrecioFinal(double precioBase, double impuestoPorc, double descuentoPorc) {
        double imp = impuestoPorc / 100.0;
        double desc = descuentoPorc / 100.0;
        return precioBase + (precioBase * imp) - (precioBase * desc);
    }
   
    
    public static void ejercicio9() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = sc.nextDouble();
        sc.nextLine(); // limpiar salto
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = sc.nextLine();

        double envio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precio, envio);

        System.out.println("El costo de envío es: " + envio);
        System.out.println("El total a pagar es: " + total);
        sc.close();
    }
    
    public static double calcularCostoEnvio(double pesoKg, String zona) {
        zona = zona.trim().toLowerCase();
        double tarifaPorKg;
        if (zona.equals("nacional")) tarifaPorKg = 5.0;
        else if (zona.equals("internacional")) tarifaPorKg = 10.0;
        else throw new IllegalArgumentException("Zona inválida");

        return pesoKg * tarifaPorKg;
    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    public static void ejercicio10() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el stock actual del producto: ");
        int stock = sc.nextInt();
        System.out.print("Ingrese la cantidad vendida: ");
        int vendida = sc.nextInt();
        System.out.print("Ingrese la cantidad recibida: ");
        int recibida = sc.nextInt();

        int nuevo = actualizarStock(stock, vendida, recibida);
        System.out.println("El nuevo stock del producto es: " + nuevo);
        sc.close();
    }
    
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }
    
    
    public static void ejercicio11() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        calcularDescuentoEspecial(precio);
        sc.close();
    }
    
    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL; // variable local
        double finalConDesc = precio - descuentoAplicado;

        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + finalConDesc);
    }
    
    public static void ejercicio12(){
        double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};

        System.out.println("Precios originales:");
        for (double p : precios) {
            System.out.println("Precio: $" + p);
        }

        // Modificar el tercer elemento (índice 2) como en el ejemplo
        precios[2] = 129.99;

        System.out.println("\nPrecios modificados:");
        for (double p : precios) {
            System.out.println("Precio: $" + p);
        }
    }
    
    
    public static void ejercicio13() {
        double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};

        System.out.println("Precios originales:");
        imprimirRecursivo(precios, 0);

        // Modificación (ej: índice 2)
        precios[2] = 129.99;

        System.out.println("\nPrecios modificados:");
        imprimirRecursivo(precios, 0);
    }
    
    public static void imprimirRecursivo(double[] arr, int i) {
        if (i == arr.length) return;             // caso base
        System.out.println("Precio: $" + arr[i]);
        imprimirRecursivo(arr, i + 1);           // paso recursivo
    }

    
}
