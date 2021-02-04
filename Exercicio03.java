// Faça um Programa que verifique se uma letra digitada é "F" ou "M"

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com uma letra (F ou M)");
        String input = scan.next();

        if (input.equalsIgnoreCase("F")){
            System.out.println("F - Feminino");
        } else if ( input.equalsIgnoreCase("M")){
            System.out.println("M - Masculino");
        } else{
            System.out.println("Sexo inválido");
        }

    }
}