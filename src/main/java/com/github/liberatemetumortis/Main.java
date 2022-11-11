package com.github.liberatemetumortis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /*
        String yazı = "MetuMortis";
        long uzunTamSayı = 1L;
        int tamSayı = 1;
        short kısaTamSayı = 1;
        byte bayt = 1;
        double ondalıkSayı = 1.0;
        boolean mantıksalDeğer = false;
        char karakter = 'a';

        Person kişi = new Person(1, "MetuMortis");
        System.out.println(kişi.getAge());
        kişi.setAge(2);
        System.out.println(kişi.getAge());
        kişi.setAge(-1);

         */

        /*
        Programmer programcı = new Programmer(1, "MetuMortis", "Java");
        System.out.println(programcı.getAge());
        System.out.println(programcı.toString());

        programcı.describeYourSelf();

        kill(programcı);

        System.out.println(programcı instanceof Programmer);
        System.out.println(programcı instanceof Person);
         */

        Scanner scanner = new Scanner(System.in);
        /*
        String girdi = scanner.nextLine();
        System.out.println(girdi);
         */

        /*
        try{
            int sayı = scanner.nextInt();
            System.out.println(sayı);
        }catch (Exception e){
            System.out.println("Hata oluştu!");
        }

         */

        //String[] dizi = { "Selam", "Merhaba", "Nasılsın" };
        ArrayList<String> dizi =
                new ArrayList<>(Arrays.asList("Selam", "Merhaba", "Nasılsın"));
        System.out.println(dizi);

        dizi = dizi.stream().map(el -> el + " MetuMortis").collect(Collectors.toCollection(ArrayList::new));

        System.out.println(dizi);

        dizi.forEach(System.out::println);

        for(String el : dizi){
            System.out.println(el);
        }


        String str = "Selam MetuMortis";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.replace("MetuMortis", "Java"));
        System.out.println(str);
        System.out.println(str.split(" ")[0]);

        String asd = null;
        System.out.println(asd.toUpperCase());
    }
    public static void kill(Person kişi) {
        System.out.println(kişi.getName() + " maalesef öldü.");
    }
}