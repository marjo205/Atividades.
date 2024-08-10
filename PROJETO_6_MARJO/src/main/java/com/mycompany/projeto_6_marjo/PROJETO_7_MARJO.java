/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_6_marjo;
import java.util.Scanner;
/**
 *
 * @author m.pereira
 */
public class PROJETO_7_MARJO {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu peso em Quilogramas");
        float q = ler.nextInt();
        System.out.println("Digite sua altura em metros");
        float a = ler.nextInt();
        float t;
        t = q * (a*a) ;
        if(t < 18.8);{
            System.out.print("Você está abaixo do peso");
    }
        if((t == 18.5)&&(t <= 24.9));{
            System.out.print("Você está no peso normal");
    }
        if((t >= 25.0)&&(t <= 29.9));{
            System.out.print("Excesso de peso");
    }
        if((t >= 30.0)&&(t <= 34.9));{
            System.out.print("Obessidade classe 1");
    }
        if((t >= 35.0)&&(t <= 39.9));{
            System.out.print("Obessidade classe 2");
    }
        if(t >= 40);{
            System.out.print("Obessidade classe 3");
    }
        
        
    }
}
