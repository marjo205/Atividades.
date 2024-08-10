/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_8_marjo;
import java.util.Scanner;
/**
 *
 * @author m.pereira
 */
public class PROJETO_8_MARJO {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu pais");
        float i = ler.nextInt();
        System.out.println("Digite quantas medalhas de ouro o pais ganhou");
        float o = ler.nextInt();
        System.out.println("Digite quantas medalhas de prata o pais ganhou");
        float p = ler.nextInt();
        System.out.println("Digite quantas medalhas de bronze o pais ganhou");
        float b = ler.nextInt();
        if(o > 10);{
            System.out.print("Otimo desepenho");
    }
        if((o >= 5)&&(o <= 10));{
            System.out.print("Bom desenpenho");
    }
        if((o < 5)&&(p + b > 20));{
            System.out.print("Desenpenho regular");
    }   
        if(o + p + b < 20);{
            System.out.print("Desenpenho fraco");
    }
        if((o > 5)&&(o + p + b > 30));{
            System.out.print("Desenpenho Extrairdínario!");
    }
    }
}
