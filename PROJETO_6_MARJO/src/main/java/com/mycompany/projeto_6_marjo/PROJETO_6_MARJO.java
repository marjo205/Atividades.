/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_6_marjo;
import java.util.Scanner;
/**
 *
 * @author m.pereira
 */
public class PROJETO_6_MARJO {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       System.out.println("Digite sua primeira nota");
       float p = ler.nextFloat();
       System.out.println("Digite sua Segunda nota");
       float s = ler.nextFloat();
       System.out.println("Digite sua Terceira nota");
       float t = ler.nextFloat();
       System.out.println("Digite sua frequencia");
       float f = ler.nextFloat();
       float media = (p + s + t) / 3;
       if(media == 7);{
        System.out.print("Você está de recuperação");
    }
       if(media < 7);{
        System.out.print("Você está reprovado ");
    }
       if(media > 7);{
        System.out.print("Você passou");
    }
       if(f < 75);{
        System.out.print("Você está reprovado");
    }
       
       
    }
}
