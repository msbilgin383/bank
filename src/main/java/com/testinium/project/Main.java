package com.testinium.project;

import com.testinium.project.BireyselMusteri;
import com.testinium.project.KurumsalMusteri;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Musteri metin = new BireyselMusteri("10", "Metin Tekin", 150, "Karacabey/Bursa");
        Musteri ali = new BireyselMusteri("11", "Ali Gültiken", 160, "Beşiktaş/İstanbul");
        Musteri feyyaz = new BireyselMusteri("12","Feyyaz Uçar", 170, "Tepebaşı/Eskişehir");
        Musteri ucuzalsat = new KurumsalMusteri("13", "Ucuza Alım Satım", 250, "ucuzalsat");
        Musteri akasya = new KurumsalMusteri("14", "AVM", 300, "Akasya");

        HashMap<String, Musteri> hashMap = new HashMap<String, Musteri>();
        hashMap.put("1", metin);
        hashMap.put("2", ali);
        hashMap.put("3", feyyaz);
        hashMap.put("4", ucuzalsat);
        hashMap.put("5", akasya);
        Set<String> keys = hashMap.keySet();

        System.out.println("Sistemde kayıtlı müşteriler:\n ");
        /*for(String musteri:keys){
            System.out.println(hashMap.get(musteri));
        } */

        Iterator iter = hashMap.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry mEntry = (Map.Entry) iter.next();
            System.out.println(mEntry.getKey() + ":"  + mEntry.getValue());
        }

        ParaTransferi paraTransferi = new ParaTransferi();
        Scanner input = new Scanner(System.in);
        System.out.println("\nSorgulamak istediğiniz müşteri numarasını giriniz.(1-2-3-4-5)");
        String customerNumber = input.nextLine();
        System.out.println(hashMap.get(customerNumber));
        Scanner inputNew = new Scanner(System.in);
        System.out.println("Para Yatırmak için 1, Para Çekmek için 2 giriniz: ");
        String operationNumber = inputNew.nextLine();
        Scanner inputAmount = new Scanner(System.in);
        System.out.println("Miktarı giriniz. ");
        Double amount = Double.valueOf(inputAmount.nextLine());


        if(operationNumber.equals("1")){
            paraTransferi.ParaYatir(hashMap.get(customerNumber),amount);
            System.out.println("Yeni bakiye:" + hashMap.get(customerNumber).getBalance());
        }
        else if(operationNumber.equals("2")){
            paraTransferi.ParaCekme(hashMap.get(customerNumber), amount);
            System.out.println("Yeni bakiye:" + hashMap.get(customerNumber).getBalance());
        }
        else
            System.out.println("Geçersiz değer girişi.");

        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry mEntry = (Map.Entry) it.next();
            System.out.println(mEntry.getKey() + ":"  + mEntry.getValue());
        }

    }
}
