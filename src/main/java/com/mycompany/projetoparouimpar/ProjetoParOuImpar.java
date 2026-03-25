/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetoparouimpar;

/**
 *
 * @author Davi Machado Pio Ferreira
 * 25/03/2026
 * Este projeto verifica se um número qualquer é par ou impar a partir da entrada
 */

import java.util.Scanner;

public class ProjetoParOuImpar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero:");
        
      if (leitor.hasNextInt()) {
        int numRecebido = leitor.nextInt();
        
        if (numRecebido % 2 == 0) {
            System.out.println("eh par");
        } else if (numRecebido % 2 == 1){
            System.out.println("eh ímpar");
        }
        } else {
        System.out.println("Isso nao eh um numero");
        }
        
        leitor.close();
    }
}