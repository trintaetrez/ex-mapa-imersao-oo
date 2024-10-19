package com.company.application;

import entities.Carro;
import entities.Cliente;
import entities.Venda;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("\n Realizar venda do carro !");
            Venda venda = new Venda();
            venda.realizarVenda();
        }
    }
}
