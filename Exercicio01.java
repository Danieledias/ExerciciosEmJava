/*Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser um triângulo.
Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno. o Dicas: o Três lados formam
um triângulo quando a soma de quaisquer dois lados for maior que o terceiro; o Triângulo Equilátero: três lados iguais;
o Triângulo Isósceles: quaisquer dois lados iguais; o Triângulo Escaleno: três lados diferentes.
 */

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do lado1: ");
        int lado1 = scan.nextInt();

        System.out.println("Digite o valor do lado2: ");
        int lado2 = scan.nextInt();

        System.out.println("Digite o valor do lado3: ");
        int lado3 = scan.nextInt();

        if (((lado1 + lado2) > lado3) || ((lado1 + lado3 > lado2)) || ((lado2 + lado3 > lado1))){

            if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
                System.out.println("Triângulo Equilátero");

            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
                System.out.println("Triângulo Isósceles");

            } else if (lado1 != lado2 && lado1 != lado3 && lado2 !=lado3){
                System.out.println("Triângulo Escaleno");
            }

        } else {
            System.out.println("Não é Triângulo");
        }

    }
}