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
public class Nivel4 extends Nivel{
    public Boolean iniciarnivel(){
       //Objetos necesarios para el método
       Funciones fun = new Funciones();
       Scanner leer = new Scanner(System.in);
       //Fin Objetos
       //Algunas variables y arreglos necesarias
       //int numeroVidas = vidas;
       cantidadPalabras = 9;
       nivelCompletado = false;
       int cantidadPistas = 1;
       char[][] matrizLevel4 = fun.crearMatriz();
       char[][] matrizLevel4_2 = fun.crearMatriz();
       String[] pistas = {"Conocida también en español como La guerra de las galaxias.",
       "Compañia que adquirió a Lucasfilm en octubre del 2012.",
       "Fue uno de los señores del crimen hutt más conocidos\nen la galaxia, que gobernó un gran imperio criminal localizado en los Territorios\ndel Borde Exterior desde su palacio del desierto en Tatooine.",
       "Era una colección masiva de estrellas, sistemas estelares,\nplanetas, lunas, asteroides, cometas, nebulosas, cúmulos de estrellas,\nagujeros negros y otros cuerpos celestes que residían en el universo. ",
       "Esta era el arma formal de un Caballero Jedi. No tan torpe o azaroso\ncomo un bláster. Se requería más habilidad que sólo la vista para usarlo.\nUn arma elegante.",
       "Toda persona procedente del planeta Corellia es conocido como tal.",
       "Tipo de música muy popular en la galaxia, principalmente en las regiones marginales del Anillo Exterior.",
       "Por definición Imperial, todos aquellos que se opongan al Nuevo Orden. Debido a esto deben ser exterminados.",
       "El proceso que sigue una nave para salir de hyperespacio."};
       
       //Fin variables
       //Repetir este código hasta que el nivel se considere
       //completado o el jugador se quede sin vidas.
           String[] pH ={"STARWARS","DISNEY","JABBA","GALAXIA","SABLE"};String[] pV = {"CORELLIANO","JIZZ","REBELDES","REVERSIÓN"};
           String[] pHd ={"➊raarstsw","➋yisend","➌bajba","➍xaligaa","➎selba"};String[] pVd = {"loercliaon","➐zizj","➑debelers","rovensire➒"};
           fun.agregaHorizontal(matrizLevel4, pHd[0], 0, 0);
           fun.agregaHorizontal(matrizLevel4, pHd[1], 5, 1);
           fun.agregaVertical(matrizLevel4,"➏", 9, 9);//NUMERO6
           fun.agregaHorizontal(matrizLevel4_2, pHd[2], 7, 4);
           fun.agregaHorizontal(matrizLevel4_2, pHd[3], 6, 0);
           fun.agregaHorizontal(matrizLevel4_2, pHd[4], 9, 2);
           fun.agregaVertical(matrizLevel4_2, pVd[0], 0, 9);
           fun.agregaVertical(matrizLevel4, pVd[1], 3, 3);
           fun.agregaVertical(matrizLevel4_2, pVd[2], 1, 3);
           fun.agregaVertical(matrizLevel4, pVd[3], 0, 4);
           int[] correctas = new int[cantidadPalabras];
           nivelCompletado=fun.verificarCompletado(correctas);
           fun.limpiarPantalla();
       while(numeroVidas > 0 & nivelCompletado==false){
           fun.imprimirMatriz(matrizLevel4,4);
           fun.imprimirMatriz(matrizLevel4_2,0);
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
                    fun.agregaHorizontal(matrizLevel4, "➊"+pH[0], 0, 0);
                    fun.esperarEnter(stringPut);
               }else{
                    numeroVidas--;
                    System.out.println("INCORRECTO");
                    fun.esperarEnter(stringPut);
                }
               }else{
                   System.out.println("Ya adivinó esta palabra");
                   fun.esperarEnter("");
               }
           }else if(stringPut.equals("2")){
               if(correctas[1]==0){
                   System.out.println("Escriba su respuesta:");
                   stringPut = leer.nextLine();
                   if(stringPut.toUpperCase().equals(pH[1])){
                       correctas[1] = 1;
                       fun.agregaHorizontal(matrizLevel4,"➋"+pH[1], 5, 1);
                       System.out.println("CORRECTO");
                       fun.esperarEnter(stringPut);
                   }else{
                       numeroVidas--;
                       System.out.println("INCORRECTO");
                       fun.esperarEnter(stringPut);
                   }
               }else{
                   System.out.println("Ya adivinó esta palabra");
                   fun.esperarEnter("");
               }
           }else if(stringPut.equals("3")){
               if(correctas[2]==0){
                   System.out.println("Escriba su respuesta:");
                   stringPut = leer.nextLine();
                   if(stringPut.toUpperCase().equals(pH[2])){
                       correctas[2] = 1;
                       fun.agregaHorizontal(matrizLevel4_2, "➌"+pH[2], 7, 4);
                       System.out.println("CORRECTO");
                       fun.esperarEnter(stringPut);
                   }else{
                       numeroVidas--;
                       System.out.println("INCORRECTO");
                       fun.esperarEnter(stringPut);
                   }
               }else {
                   System.out.println("Ya adivinó esta palabra");
                   fun.esperarEnter("");
               }
           }else if(stringPut.equals("4")){
               System.out.println("Escriba su respuesta:");
               if(correctas[3]==0){
                stringPut = leer.nextLine();
                if(stringPut.toUpperCase().equals(pH[3])){
                    correctas[3] = 1;
                    fun.agregaHorizontal(matrizLevel4_2, "➍"+pH[3], 6, 0);
                    System.out.println("CORRECTO");
                    fun.esperarEnter(stringPut);
                }else{
                    numeroVidas--;
                    System.out.println("INCORRECTO");
                    fun.esperarEnter(stringPut);
                }
            }else {
               System.out.println("Ya adivinó esta palabra");
               fun.esperarEnter("");
               }
           }else if(stringPut.equals("5")){
               if(correctas[4]==0){
                   System.out.println("Escriba su respuesta:");
                stringPut = leer.nextLine();
                if(stringPut.toUpperCase().equals(pH[4])){
                    correctas[4] = 1;
                    fun.agregaHorizontal(matrizLevel4_2,"➎"+pH[4], 9, 2);
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
                if(stringPut.toUpperCase().equals(pV[0])){
                    correctas[5] = 1;
                    fun.agregaVertical(matrizLevel4_2,pV[0], 0, 9);
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
           }else if(stringPut.equals("7")){
               if(correctas[6]==0){
                   System.out.println("Escriba su respuesta:");
                stringPut = leer.nextLine();
                if(stringPut.toUpperCase().equals(pV[1])){
                    correctas[6] = 1;
                    fun.agregaVertical(matrizLevel4,"➐"+pV[1], 3, 3);
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
           }else if(stringPut.equals("8")){
               if(correctas[7]==0){
                   System.out.println("Escriba su respuesta:");
                stringPut = leer.nextLine();
                if(stringPut.toUpperCase().equals(pV[2])){
                    correctas[7] = 1;
                    fun.agregaVertical(matrizLevel4_2,"➑"+pV[2], 1, 3);
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
           }else if(stringPut.equals("9")){
               if(correctas[8]==0){
                   System.out.println("Escriba su respuesta:");
                stringPut = leer.nextLine();
                if(stringPut.toUpperCase().equals("REVERSIÓN")||stringPut.toUpperCase().equals("REVERSION")){
                    correctas[8] = 1;
                    fun.agregaVertical(matrizLevel4,"➒"+pV[3], 0, 4);
                    System.out.println("CORRECTO");
                    fun.esperarEnter(stringPut);
                }else{
                    numeroVidas--;
                    System.out.println("INCORRECTO");
                    fun.esperarEnter(stringPut);
                    System.out.println("Bandera"+stringPut);
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
               fun.imprimirMatriz(matrizLevel4,4);
               fun.imprimirMatriz(matrizLevel4_2,0);
               fun.esperarEnter(stringPut);
               nivelCompletado = fun.verificarCompletado(correctas);
               break;
           }else{
               continue;
           }           
   }
       return fun.verificarCompletado(correctas);
   }
    public Nivel4(){
    }
    
}
