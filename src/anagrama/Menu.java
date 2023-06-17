/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagrama;
import anagrama.*;
import java.util.Scanner;
import niveles.*;
/**
 *
 * @author Gerardo
 */
public class Menu {
    public void menuInicio(){
        //Menú de inicio
        //Objetos y variables útiles
        Scanner leer = new Scanner(System.in);
        Funciones fun = new Funciones();
        String nombre = "";
        String[] arrEstad = new String[15];
        int cont = 0;
        Nivel1 nv1 = new Nivel1();
        Nivel2 nv2 = new Nivel2();
        Nivel3 nv3 = new Nivel3();
        Nivel4 nv4 = new Nivel4();
        Nivel5 nv5 = new Nivel5();
        int stringPut = 0;
        //Fin Objetos útiles
        while(stringPut != 3){
            fun.limpiarPantalla();
            System.out.println(" ▓▓▓▓▓▓ ANAGRAMA / STAR WARS ▓▓▓▓▓▓");
            System.out.println("");
            System.out.println("1)Empezar Partida\n2)Estadisticas\n3)Salir");
            System.out.print(": ");
            stringPut = leer.nextInt();
            if(stringPut ==1){
                System.out.println("Digite su nombre");
                //fun.esperarEnter("");
                //fun.limpiarPantalla();
                nombre = leer.nextLine();
                nombre = leer.nextLine();
                arrEstad[cont] = nombre;
                System.out.print("Bander nombre= "+nombre);
                nv1.setNumeroVidas(7);
                nv1.iniciarnivel();
                arrEstad[cont] = arrEstad[cont]+" N1";
               int vidas = nv1.getNumeroVidas();
                if(vidas>0 & nv1.nivelCompletado){
                    arrEstad[cont] = nombre + " N2";
                    nv2.setNumeroVidas(vidas);
                    nv2.iniciarnivel();
                    vidas = nv2.getNumeroVidas();
                    if(vidas>0 & nv2.nivelCompletado){
                        arrEstad[cont] = nombre + " N3";
                        nv3.setNumeroVidas(vidas);
                        nv3.iniciarnivel();
                        vidas = nv3.getNumeroVidas();
                        if(vidas>0 & nv3.nivelCompletado){
                            arrEstad[cont] = nombre + " N4";
                            nv4.setNumeroVidas(vidas);
                            nv4.iniciarnivel();
                            vidas = nv4.getNumeroVidas();
                            if(vidas>0 & nv4.nivelCompletado){
                                arrEstad[cont] = nombre + " Final.";
                                nv5.setNumeroVidas(vidas);
                                nv5.iniciarnivel();
                            }
                            
                        }
                    }
                }
                /*vidas = nv2.getNumeroVidas();
                nv3.iniciarnivel(vidas);
                vidas = nv1.getNumeroVidas();
                nv4.iniciarnivel(vidas);
                vidas = nv1.getNumeroVidas();
                nv5.iniciarnivel(vidas);*/
                cont++;
            }else if(stringPut==2){
                for(int i =0;i<arrEstad.length;i++){
                    if(arrEstad[i] != null){
                        System.out.println(arrEstad[i]);
                    }
                }
                fun.esperarEnter("");
            }
        }
    }

    public Menu() {
    }
}
