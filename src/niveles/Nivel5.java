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
public class Nivel5 extends Nivel{
    public Boolean iniciarnivel(){
       //Objetos necesarios para el método
       Funciones fun = new Funciones();
       Scanner leer = new Scanner(System.in);
       //Fin Objetos
       //Algunas variables y arreglos necesarias
       //int numeroVidas = vidas;
       cantidadPalabras = 12;
       nivelCompletado = false;
       int cantidadPistas = 1;
       char[][] matrizLevel5 = fun.crearMatriz();
       char[][] matrizLevel5_2 = fun.crearMatriz();
       String[] pistas = {"Fue una antigua orden de portadores de\nla Fuerza dedicados al lado oscuro de la Fuerza. ",
       "El nombre-código de la operación rebelde responsable\ndel robo de los planos de la Estrella de la Muerte.",
       "Durante su juventud en Tatooine,\nLuke Skywalker era llamado así por sus amigos",
       "Este es uno de los tantos idiomas que\nse habla en el planeta Tatooine.",
       "Especie menuda y peluda que habita en\nprimera instancia la luna de Endor.",
       "Bola de gas gigante que pese\nal popular nombre, no aporta mucho.",
       "Especie de gorila cornudo de\nlas nieves oriundo de Hoth.",
       "Son oriundos del planeta Dathomir, donde las Brujas de\nDathomir podían domarlos y usarlos como bestias de monta.",
       "Sustancia gruesa y gelatinosa con propiedades\ncurativas aparentemente mágicas",
       "Son una especie con grandes orejas y con rostro y piel semejante a la de los anfibios.\n Estos habitan en enormes ciudades submarinas en lagos del planeta Naboo",
       "Eran una gran especie inteligente con forma\nde babosa que eran nativos del planeta Nal Hutta.",
       "Especie inteligente de humanoides de un metro de alto nativos\ndel mundo desértico del Borde Exterior de Tatooine."};
       
       //Fin variables
       //Repetir este código hasta que el nivel se considere
       //completado o el jugador se quede sin vidas.
           String[] pH ={"SITH","SKYHOOK","WORMIE","BOCCE","EWOK","YAVIN","WAMPA"};String[] pV = {"RANCOR","BACTA","GUNGAN","HUTT","JAWA"};
           String[] pHd ={"➊tish","➋kkyhoos","➌eirmow","➍eoccb","➎owek","➏vaniy","➐pamwa",};String[] pVd = {"rnacor➑","➒tacba","➓ggnuan","htut⓫","⓬aawj"};
           fun.agregaHorizontal(matrizLevel5_2, pHd[0], 0, 5);
           fun.agregaHorizontal(matrizLevel5, pHd[1], 4, 1);
           //fun.agregaVertical(matrizLevel5,"➏", 9, 9);//NUMERO6
           fun.agregaHorizontal(matrizLevel5, pHd[2], 0, 3);
           fun.agregaHorizontal(matrizLevel5, pHd[3], 3, 3);
           fun.agregaHorizontal(matrizLevel5, pHd[4], 8, 0);
           fun.agregaHorizontal(matrizLevel5_2, pHd[5], 9, 0);
           fun.agregaHorizontal(matrizLevel5_2, pHd[6], 6, 0);
           fun.agregaVertical(matrizLevel5, pVd[0], 0, 6);
           fun.agregaVertical(matrizLevel5_2, pVd[1], 4, 2);
           fun.agregaVertical(matrizLevel5_2, pVd[2], 1, 5);
           fun.agregaVertical(matrizLevel5_2, pVd[3], 0, 9);
           fun.agregaVertical(matrizLevel5, pVd[4], 5, 2);
           int[] correctas = new int[cantidadPalabras];
           nivelCompletado=fun.verificarCompletado(correctas);
           fun.limpiarPantalla();
       while(numeroVidas > 0 & nivelCompletado==false){
           fun.imprimirMatriz(matrizLevel5,5);
           fun.imprimirMatriz(matrizLevel5_2,0);
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
                    fun.agregaHorizontal(matrizLevel5_2, "➊"+pH[0], 0, 5);
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
                       fun.agregaHorizontal(matrizLevel5,"➋"+pH[1], 4, 1);
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
                       fun.agregaHorizontal(matrizLevel5, "➌"+pH[2], 0, 3);
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
                if(stringPut.toUpperCase().equals(pH[3])){
                    correctas[3] = 1;
                    fun.agregaHorizontal(matrizLevel5, "➍"+pH[3], 3, 3);
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
                if(stringPut.toUpperCase().equals(pH[4])){
                    correctas[4] = 1;
                    fun.agregaHorizontal(matrizLevel5,"➎"+pH[4], 8, 0);
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
                if(stringPut.toUpperCase().equals(pH[5])){
                    correctas[5] = 1;
                    fun.agregaHorizontal(matrizLevel5_2,"➏"+pH[5], 9, 0);
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
                if(stringPut.toUpperCase().equals(pH[6])){
                    correctas[6] = 1;
                    fun.agregaHorizontal(matrizLevel5_2,"➐"+pH[6], 6, 0);
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
                if(stringPut.toUpperCase().equals(pV[0])){
                    correctas[7] = 1;
                    fun.agregaVertical(matrizLevel5,pV[0]+"➑", 0, 6);
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
                if(stringPut.toUpperCase().equals(pV[1])){
                    correctas[8] = 1;
                    fun.agregaVertical(matrizLevel5_2,"➒"+pV[1], 4, 2);
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
           }else if(stringPut.equals("10")){
               if(correctas[9]==0){
                   System.out.println("Escriba su respuesta:");
                stringPut = leer.nextLine();
                if(stringPut.toUpperCase().equals(pV[2])){
                    correctas[9] = 1;
                    fun.agregaVertical(matrizLevel5_2,"➓"+pV[2], 1, 5);
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
           }else if(stringPut.equals("11")){
               if(correctas[10]==0){
                   System.out.println("Escriba su respuesta:");
                stringPut = leer.nextLine();
                if(stringPut.toUpperCase().equals(pV[3])){
                    correctas[10] = 1;
                    fun.agregaVertical(matrizLevel5_2,pV[3]+"⓫", 0, 9);
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
           }else if(stringPut.equals("12")){
               if(correctas[11]==0){
                   System.out.println("Escriba su respuesta:");
                stringPut = leer.nextLine();
                if(stringPut.toUpperCase().equals(pV[4])){
                    correctas[11] = 1;
                    fun.agregaVertical(matrizLevel5,"⓬"+pV[4], 5, 2);
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
               fun.imprimirMatriz(matrizLevel5,5);
               fun.imprimirMatriz(matrizLevel5_2,0);
               fun.esperarEnter(stringPut);
               nivelCompletado = fun.verificarCompletado(correctas);
               break;
           }else{
               continue;
           }           
   }
       return fun.verificarCompletado(correctas);
   }
}
