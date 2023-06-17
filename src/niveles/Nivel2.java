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
public class Nivel2 extends Nivel{
       public Boolean iniciarnivel(){
       //Objetos necesarios para el método
       Funciones fun = new Funciones();
       Scanner leer = new Scanner(System.in);
       //Fin Objetos
       //Algunas variables y arreglos necesarias
       //int numeroVidas =;
       cantidadPalabras = 5;
       nivelCompletado = false;
       int cantidadPistas = 1;
       char[][] matrizLevel2 = fun.crearMatriz();
       String[] pistas = {"Clase de buque utilizado por las fuerzas militares,\ngeneralmente como un transporte de tropas",
       "Hijo del Caballero Jedi Anakin Skywalker y de\nla Senadora Padmé Amidala de Naboo",
       "Era famoso dentro de la Orden por su sabiduría,\npoderes de la Fuerza y combate con sables de luz, y vivió durante casi 900 años",
       "División de las fuerzas de guerra que\nestaba compuesta por varias naves estelares.",
       "Una mujer humana sensible a la Fuerza,\nfue una Jedi que luchó por la Resistencia contra la Primera Orden durante la Era de la Nueva República"};
       //Fin variables
       //Repetir este código hasta que el nivel se considere
       //completado o el jugador se quede sin vidas.
           String[] pH ={"CAÑONERA","LUKE"};String[] pV = {"YODA","ARMADA","REY"};
           String[] pHd ={"➊careñona","➋ukle"};String[] pVd = {"➌doya","➍radama","➎yer"};
           fun.agregaHorizontal(matrizLevel2, pHd[0], 4, 0);
           fun.agregaHorizontal(matrizLevel2, pHd[1], 8, 1);
           fun.agregaVertical(matrizLevel2, pVd[0], 0, 2);
           fun.agregaVertical(matrizLevel2, pVd[1], 0, 8);
           fun.agregaVertical(matrizLevel2, pVd[2], 6, 5);
           int[] correctas = new int[cantidadPalabras];
           nivelCompletado=fun.verificarCompletado(correctas);
           fun.limpiarPantalla();
       while(numeroVidas > 0 & nivelCompletado==false){
           fun.imprimirMatriz(matrizLevel2,2);
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
                if(stringPut.toUpperCase().equals(pH[0])|| stringPut.toUpperCase().equals("CA�ONERA")){
                    correctas[0] = 1;
                    System.out.println("CORRECTO");
                    fun.agregaHorizontal(matrizLevel2, "➊"+pH[0], 4, 0);
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
                   if(stringPut.toUpperCase().equals(pH[1])){
                       correctas[1] = 1;
                       fun.agregaHorizontal(matrizLevel2,"➋"+pH[1], 8, 1);
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
           }else if(stringPut.equals("3")){
               if(correctas[2]==0){
                   System.out.println("Escriba su respuesta:");
                   stringPut = leer.nextLine();
                   if(stringPut.toUpperCase().equals(pV[0])){
                       correctas[2] = 1;
                       fun.agregaVertical(matrizLevel2, "➌"+pV[0], 0, 2);
                       System.out.println("CORRECTO");
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
           }else if(stringPut.equals("4")){
               if(correctas[3]==0){
                   System.out.println("Escriba su respuesta:");
                   stringPut = leer.nextLine();
                   if(stringPut.toUpperCase().equals(pV[1])){
                       correctas[3] = 1;
                       fun.agregaVertical(matrizLevel2, "➍"+pV[1], 0, 8);
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
           }else if(stringPut.equals("5")){
               if(correctas[4]==0){
                   System.out.println("Escriba su respuesta:");
                   stringPut = leer.nextLine();
                   if(stringPut.toUpperCase().equals(pV[2])){
                       correctas[4] = 1;
                       fun.agregaVertical(matrizLevel2, "➎"+pV[2], 6, 5);
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
           }/////
           if(fun.verificarCompletado(correctas) ==true){
               System.out.println("RESUMEN");
               fun.imprimirMatriz(matrizLevel2,2);
               fun.esperarEnter(stringPut);
               nivelCompletado = fun.verificarCompletado(correctas);
               break;
           }else{
               continue;
           }           
   }
       return fun.verificarCompletado(correctas);
   }

    public Nivel2() {
    }
       
    
}
