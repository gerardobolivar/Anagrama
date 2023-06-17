/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niveles;
import anagrama.*;
import java.util.Scanner;
/**
 *
 * @author Gerardo
 */
public class Nivel1 extends Nivel{
   public Boolean iniciarnivel(){
       //Objetos necesarios para el método
       Funciones fun = new Funciones();
       Scanner leer = new Scanner(System.in);
       //Fin Objetos
       //Algunas variables y arreglos necesarias
       //int numeroVidas = 7;
       cantidadPalabras = 2;
       nivelCompletado = false;
       int cantidadPistas = 1;
       char[][] matrizLevel1 = fun.crearMatriz();
       String[] pistas = {"Un niño, o en algunos casos"
               + " un adulto, que comienza "
               + "un serio\nentrenamiento por parte de un"
               + " Caballero o un Maestro.","Era un individuo sensible a la Fuerza, "
               + "y usaba las energías\nmísticas de la misma, usualmente el lado "
               + "luminoso de la Fuerza"};
       //Fin variables
       //Repetir este código hasta que el nivel se considere
       //completado o el jugador se quede sin vidas.
           String[] pH ={"PADAWAN"};String[] pV = {"JEDI"};
           String[] pHd ={"➊apdnawa"};String[] pVd = {"➋iedj"};
           fun.agregaHorizontal(matrizLevel1, pHd[0], 3, 0);
           fun.agregaVertical(matrizLevel1, pVd[0], 0, 3);
           int[] correctas = new int[cantidadPalabras];
           nivelCompletado=fun.verificarCompletado(correctas);
           fun.limpiarPantalla();
           System.out.println("Se le recuerda que puede presionar 'S' para salir\nen el momento que lo desee");
           fun.esperarEnter("");
       while(numeroVidas > 0 & nivelCompletado==false){
           fun.imprimirMatriz(matrizLevel1,1);
           System.out.println();
           fun.imprimirVidas(numeroVidas);
           System.out.println();
           if(cantidadPistas>0){
               System.out.print("Numero de palabra o 'P' para pista:");
           }else{
               System.out.print("Numero de palabra: ");
           }
           String stringPut = leer.nextLine();
           if(stringPut.toUpperCase().equals("P")){
               fun.imprimirPistas(pistas, pistas.length,cantidadPistas);
               cantidadPistas--;
           }else if(stringPut.toUpperCase().equals("S")){
               numeroVidas =0;
           }else if(stringPut.equals("1")){
               if(correctas[0] == 0){
                   System.out.println("Escriba su respuesta:");
                   stringPut = leer.nextLine();
                if(stringPut.toUpperCase().equals(pH[0])){
                    correctas[0] = 1;
                    System.out.println("CORRECTO");
                    fun.agregaHorizontal(matrizLevel1, "➊"+pH[0], 3, 0);
                    fun.esperarEnter(stringPut);
               }else{
                    numeroVidas--;
                    System.out.println("INCORRECTO");
                    fun.esperarEnter(stringPut);
                }
               }else{
                   System.out.println("Ya adivinó esta palabra");
                   System.out.println("Enter para continuar");
                   fun.esperarEnter("");
               }
           }else if(stringPut.equals("2")){
               if(correctas[1]==0){
                   System.out.println("Escriba su respuesta:");
                stringPut = leer.nextLine();
                if(stringPut.toUpperCase().equals(pV[0])){
                    correctas[1] = 1;
                    fun.agregaVertical(matrizLevel1, "➋"+pV[0], 0, 3);
                    System.out.println("CORRECTO");
                    fun.esperarEnter(stringPut);
                }else{
                    numeroVidas--;
                    System.out.println("INCORRECTO");
                    fun.esperarEnter(stringPut);
                }
            }else {
               System.out.println("Ya adivinó esta palabra");
               System.out.println("Enter para continuar");
               fun.esperarEnter("");
               }
           }
           //System.out.println("Nivel completado = "+nivelCompletado);
           if(fun.verificarCompletado(correctas) ==true){
               fun.limpiarPantalla();
               System.out.println("RESUMEN");
               fun.imprimirMatriz(matrizLevel1,1);
               //System.out.println("Nivel completado = "+fun.verificarCompletado(correctas));
               fun.esperarEnter(stringPut);
               //nivelCompletado2 = fun.verificarCompletado(correctas);
               nivelCompletado = fun.verificarCompletado(correctas);
               break;
           }else{
               continue;
           }           
   }
       return fun.verificarCompletado(correctas);
   }

    public Nivel1() {
    }
}
