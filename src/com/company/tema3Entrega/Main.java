package com.company.tema3Entrega;

public class Main {
    public static void main(String[] args) {

        String[] nombres = {"Santiago", "Ignacio", "Agostina", "Julieta"};

        System.out.println(getNombresConcatenados(nombres));


    }

    static String getNombresConcatenados(String[] nombres){

        String nombresConcatenados="";

        for(String nombre : nombres){

           nombresConcatenados +=nombre+", ";

        }
        return nombresConcatenados;

    }



}