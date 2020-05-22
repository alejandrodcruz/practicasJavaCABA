/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_004;

/**
 *
 * @author EntornoVM
 */
public class Ejercicio_004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*Ejecicio 001*/
        int temp = 27;

        if (temp > 25) {
            System.out.println("A la playa");
        }

        /*Ejercicio 002*/
        boolean haceSol = true;

        if (haceSol) {

            System.out.println("No te olvides la sombrilla");
        }

        /*Ejercicio 003*/
        haceSol = true;
        boolean nevado = true;

        if (nevado || haceSol) {

            System.out.println("Que bien!");
        }

        /*Ejercicio 004*/
        boolean nevando = true;
        temp = 29;

        if (nevando && (temp >= 20 && temp <= 30)) {

            System.out.println("No me lo creo");
        }

        /*Ejercicio 005*/
        temp = 32;
        haceSol = true;

        if ((temp < 0 || temp > 30) && haceSol) {

            System.out.println("Mejor me quedo en casa");
        }

    }

}
