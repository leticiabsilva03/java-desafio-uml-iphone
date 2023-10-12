package main.java.br.com.dio.bootcamp.santander;

import main.java.br.com.dio.bootcamp.santander.usecase.impl.IphoneUseCaseImpl;

public class Main {
    public static void main(String[] args) {

        IphoneUseCaseImpl iphone = new IphoneUseCaseImpl();

        System.out.println("------------------------------------");
        System.out.println("REPRODUZINDO MÚSICAS:");

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();

        System.out.println("------------------------------------");
        System.out.println("APARELHO TELEFONICO:");

        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorrerioVoz();


        System.out.println("------------------------------------");
        System.out.println("NAVEGADONDO NA INTERNET:");

        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        System.out.println("------------------------------------");

    }
}
