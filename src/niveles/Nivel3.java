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
public class Nivel3 extends Nivel{
        public Boolean iniciarnivel(){
       //Objetos necesarios para el método
       Funciones fun = new Funciones();
       Scanner leer = new Scanner(System.in);
       //Fin Objetos
       //Algunas variables y arreglos necesarias
       //int numeroVidas = vidas;
       cantidadPalabras = 6;
       nivelCompletado = false;
       int cantidadPistas = 1;
       char[][] matrizLevel3 = fun.crearMatriz();
       String[] pistas = {"Fue un guerrero wookiee, un contrabandista y un\nluchador de resistencia que peleó en las Guerras Clon,\nla Guerra Civil Galáctica y el Guerra fría.",
       "Campo de energía que conectaba a\ntodos los seres vivos en la galaxia.",
       "Sirvió a una multitud de maestros a lo largo de su vida.\nNunca recibió un borrado completo de memoria\nni recibió programación nueva.",
       "Fue un título dado a los Señores Oscuros de la Orden Sith.",
       "Es una sucesión de dibujos que constituye un relato, con texto o sin texto.",
       "Era un hombre Toydariano que era dueño de una tienda en Mos Espa, Tatooine."};
       //Fin variables
       //Repetir este código hasta que el nivel se considere
       //completado o el jugador se quede sin vidas.
           String[] pH ={"CHEWBACCA","FUERZA","R2D2"};String[] pV = {"DARTH","COMICS","WATTO"};
           String[] pHd ={"➊cbawhacce","➋auzref","➌22dr"};String[] pVd = {"➍dthar","cocsim➎","wtato➏"};
           fun.agregaHorizontal(matrizLevel3, pHd[0], 0, 0);
           fun.agregaHorizontal(matrizLevel3, pHd[1], 9, 0);
           fun.agregaHorizontal(matrizLevel3, pHd[2], 5, 5);
           fun.agregaVertical(matrizLevel3, pVd[0], 4, 8);
           fun.agregaVertical(matrizLevel3, pVd[1], 0, 1);
           fun.agregaVertical(matrizLevel3, pVd[2], 0, 4);
           int[] correctas = new int[cantidadPalabras];
           nivelCompletado=fun.verificarCompletado(correctas);
           fun.limpiarPantalla();
       while(numeroVidas > 0 & nivelCompletado==false){
           fun.imprimirMatriz(matrizLevel3,3);
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
                    fun.agregaHorizontal(matrizLevel3, "➊"+pH[0], 0, 0);
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
                       fun.agregaHorizontal(matrizLevel3,"➋"+pH[1], 9, 0);
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
           }else if(stringPut.equals("3")){
               if(correctas[2]==0){
                   System.out.println("Escriba su respuesta:");
                   stringPut = leer.nextLine();
                   if(stringPut.toUpperCase().equals(pH[2])){
                       correctas[2] = 1;
                       fun.agregaHorizontal(matrizLevel3, "➌"+pH[2], 5, 5);
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
           }else if(stringPut.equals("4")){
               System.out.println("Escriba su respuesta:");
               if(correctas[3]==0){
                stringPut = leer.nextLine();
                if(stringPut.toUpperCase().equals(pV[0])){
                    correctas[3] = 1;
                    fun.agregaVertical(matrizLevel3, "➍"+pV[0], 4, 8);
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
                if(stringPut.toUpperCase().equals(pV[1])){
                    correctas[4] = 1;
                    fun.agregaVertical(matrizLevel3,pV[1]+"➎", 0, 1);
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
           }else if(stringPut.equals("6")){
               if(correctas[5]==0){
                   System.out.println("Escriba su respuesta:");
                stringPut = leer.nextLine();
                if(stringPut.toUpperCase().equals(pV[2])){
                    correctas[5] = 1;
                    fun.agregaVertical(matrizLevel3,pV[2]+"➏", 0, 4);
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
           /////
           
           if(fun.verificarCompletado(correctas) ==true){
               System.out.println("RESUMEN");
               fun.imprimirMatriz(matrizLevel3,3);
               fun.esperarEnter(stringPut);
               nivelCompletado = fun.verificarCompletado(correctas);
               break;
           }else{
               continue;
           }           
   }
       return fun.verificarCompletado(correctas);
   }

    public Nivel3() {
    }
          
}
