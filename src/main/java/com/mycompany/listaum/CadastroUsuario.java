
package com.mycompany.listaum;

import java.util.Scanner;

public class CadastroUsuario {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira o Login.");
        String leitorLogin = leitor.nextLine();
        
        System.out.println("Insira a Senha.");
        String leitorSenha = leitor.nextLine();
        
        System.out.println("Insira quantas vezes é permitido errar.");
        Integer leitorErro = leitor.nextInt();
        
        System.out.println(String.format("Seu login é %s e sua senha é %s. Você tem %d "
                + "tentativas antes de ser bloqueado.", 
                leitorLogin, leitorSenha, leitorErro));
    }
}
