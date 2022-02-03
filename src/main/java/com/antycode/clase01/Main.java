/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.antycode.clase01;

import java.util.Scanner;

/**
 *
 * @author anton
 */
public class Main {

    public static void main(String[] args) {
        //SHIFT+ALT+f=====>formatear codigo
        //System.out.println("Hola mundo!");
        /*String nombre = "Carlos";
        Integer edad = 25;
        Integer followersInstagram = 1250;
        Integer followersTiktok = 2563;
        String frase = "Hola, mi nombre es " + nombre + ", tengo " + edad + " años y " + (followersInstagram + followersTiktok) + " seguidores.";

        System.out.println(frase);*/

 /*Integer edad = 20;

        if (edad > 5) {
            edad = 17;
            if (edad >= 18) {
                System.out.println("Es mayor de edad");
            } else {
                System.out.println("Es menor de edad");
            }
        } else if (edad == 3) {
            System.out.println("Es un niño");
        } else {
            System.out.println("Es un bebe");
        }*/
 /*String valor;
        Integer numero = 12;
        
        valor = numero==2?"El numero es dos":"El numero es diferente de dos";
        System.out.println(valor);*/
        //OPERADORES LOGICOS
        /*NOT*/
        //boolean valor1 = true;
        //boolean resultadoNegado = !valor1;
        //System.out.println(resultadoNegado);
        /*AND y OR*/
 /*boolean valor1 = false;
        boolean valor2 = true;
        
        boolean resultadoAND = valor1 && valor2;
        boolean resultadoOR = valor1 || valor2;
        
        System.out.println("El resultado de AND es: "+resultadoAND);
        System.out.println("El resultado de OR es: "+resultadoOR);*/
 /*PIDIENDO VALORES DESDE CONSOLA*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Que edad tienes?");
        //Integer edad = scanner.nextInt();
        Integer edad = Integer.valueOf(scanner.nextLine());

        System.out.println("¿Cual es tu nombre?");

        String nombre = scanner.nextLine();

        System.out.println("Soy " + nombre + " y mi edad es " + edad);

    }
}
