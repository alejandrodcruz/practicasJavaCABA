/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;

/**
 *
 * @author EntornoVM
 */
public class Variables {
public static void main(String[] args) {

// Variables
int numero1;
int numero2;
int suma;
int edad;
String nombre;
// Constante
final int NUMERO_3= 4;
// Ingreso los valores a la variables numero1 y numero2
numero1 = 30;
numero2 = 40;
// operación suma
suma = numero1+numero2;

// Muestro en pantalla las dos variables y el resultado de la suma
System.out.println("El resultado de la suma de " + numero1 + "+" + numero2 + " es igual a " + suma);

// Cambio los valores de numero1,numero2 y vuelvo a realizar la operación de suma
numero1=100;
numero2= 50;
//operación suma
suma= numero1+numero2;
// Muestro en pantalla las dos variables y el resultado de la suma
System.out.println("El resultado de la suma de " + numero1 + "+" + numero2 + " es igual a " + suma);

// Instancio y muestro en pantalla la variable nombre y su edad

edad= 30;
nombre= "Alejandro";
System.out.println("Mi edad es igual a " + edad);

// Muestro en pantalla la constante
System.out.println("La constante es igual a " + NUMERO_3);

}

}