package com.example.primeiroprograma;

import java.util.Scanner;

public class TestaPrograma {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(  System.in);
        System.out.println("Escreva seu nome");
        String entrada = scanner.next();
        System.out.println("Meu nome é: " + entrada);
    }
}
