/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagrama;
import java.util.Scanner;


/**
 *
 * @author Gerardo
 */
public class Funciones {
    public char[][] crearMatriz(){
        char[][] matriz = new char[10][10];
        for(int fila= 0;fila<10;fila++){
            for(int colum = 0;colum<10;colum++){
                matriz[fila][colum] = '.';
            }
        }
        return matriz;
    }
    public void imprimirMatriz(char[][] matriz,int opcion){
        if(opcion >=1 && opcion < 8){
            System.out.println(" ▓▓▓▓▓▓ NIVEL "+opcion+" ▓▓▓▓▓▓");
            System.out.println("");
        }else{
            //No pasará nada
        }
        for(int fila= 0;fila<10;fila++){
            for(int colum = 0;colum<10;colum++){
                System.out.print(" "+matriz[fila][colum]+" ");
            }
            System.out.println(" ");
        }
    }
    public void agregaHorizontal(char[][] matriz,String palabra,int x,int y){
        //agregaHorizontal permite insertar una palabra de manera horizontal.
        int contador = y;
        int contador2 = x;
        int tamañoPalabra= palabra.length();
        for(int i = 0;i<tamañoPalabra;i++){
          matriz[x][contador] = palabra.charAt(i);
          contador++;
          //contador2++;
        }
        //palabra.charAt();
    }
    public void agregaVertical(char[][] matriz,String palabra,int y,int x){
        //agregaVertical permite insertar una palabra de manera vertical
        int contador = y;
        int contador2 = x;
        int tamañoPalabra= palabra.length();
        for(int i = 0;i<tamañoPalabra;i++){
          matriz[contador][x] = palabra.charAt(i);
          contador++;
        }
    
    }
    public void limpiarPantalla() {
     for(int i =0;i <10;i++){
         System.out.println(" \n");
     }
    }
    public void imprimirVidas(int cantidadVidas){
        System.out.print("Vidas: ");
        for(int i =0;i<cantidadVidas;i++){
            System.out.print("");
            
        }
        System.out.println("");
        
        
    }
    public void imprimirPistas(String[] pistas,int cantidadPalabras,int cantidadPistas){
        Scanner scan = new Scanner(System.in);
        String entr = "";
        if(cantidadPistas > 0){
            Scanner leerFun = new Scanner(System.in);
            System.out.println("");
            System.out.print("Ingrese número de palabra: ");
                int intPut = leerFun.nextInt();
                if(intPut > 0 && intPut <= cantidadPalabras){
                System.out.println("");
                System.out.println(pistas[intPut-1]);
                cantidadPistas = cantidadPistas-1;
                
            }
            System.out.println("");
            System.out.println("Enter para continuar.");
            do{
                entr = scan.nextLine();
                System.out.println(entr);
            }while(!entr.equals(""));
        }else{
            System.out.println("No tiene más pistas: ");
            System.out.println("");
            System.out.println("Enter para continuar.");
            do{
                entr = scan.nextLine();
                System.out.println(entr);
            }while(!entr.equals(""));
        }
    }
    public void esperarEnter(String entr){
        Scanner scan = new Scanner(System.in);
        do{
                entr = scan.nextLine();
                System.out.println(entr);
            }while(!entr.equals(""));
        }
    public Boolean verificarCompletado(int[] correctas){
        Boolean varBoolean = true;
        for(int i = 0;i< correctas.length;i++){
            if(correctas[i] == 0){
                //System.out.println("Seteando valor de completado a False");
                varBoolean = false;
                break;
            }
        }
        
        return varBoolean;
    }
    public Funciones(){
    }
}