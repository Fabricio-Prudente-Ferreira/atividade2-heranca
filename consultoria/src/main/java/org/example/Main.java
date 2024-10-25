package org.example;

public class Main {
    public static void main(String[] args) {
        Dev dev1 = new Dev("Dev1", 15, 50.4);
        Dev dev2 = new Dev("Dev2", 25, 23.7);
        Dev dev3 = new Dev("Dev3", 35, 34.2);
        DevMobile dev4 = new DevMobile("Dev4", 47, 25.6, 27, 13.8);
        DevMobile dev5 = new DevMobile("Dev5", 38, 16.7, 41, 37.2);

        Consultoria c1 = new Consultoria("consultoria1", 3);
        Consultoria c2 = new Consultoria("consultoria2", 2);

        c1.contratar(dev1);
        c1.contratar(dev2);
        c1.contratar(dev3);

        c2.contratar(dev4);
        c2.contratar(dev5);

        System.out.println("Qtd devs c1: " + c1.getQuantidadeDevs());
        System.out.println("Qtd devs c2: " + c2.getQuantidadeDevs());

        System.out.println("------------------------------------");

        System.out.println("Qtd devsMobile c1: " + c1.getQuantidadeDevsMobile());
        System.out.println("Qtd devsMobile c2: " + c2.getQuantidadeDevsMobile());

        System.out.println("------------------------------------");

        System.out.println("Salário total c1: R$ " + c1.getTotalSalarios());
        System.out.println("Salário total c2: R$ " + c2.getTotalSalarios());

        System.out.println("------------------------------------");

        String nome = "Dev4";
        System.out.println("Existe dev de nome " + nome + " (c1)?: " + (c1.existePorNome(nome)? "Sim" : "Não"));
        System.out.println("Existe dev de nome " + nome + " (c2)?: " + (c2.existePorNome(nome)? "Sim" : "Não"));

        System.out.println("------------------------------------");

        System.out.println("Dev de nome " + nome + " (c1): " + c1.getDevPorNome(nome));
        System.out.println("Dev de nome " + nome + " (c2): " + c2.getDevPorNome(nome));
    }
}