package com.kodilla.bank.homework;

public class Application {
    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.cm1.putMoney(20);
        bank.cm2.putMoney(20);
        bank.cm3.putMoney(20);
        bank.cm1.getMoney(50);
        bank.cm1.getMoney(50);
        bank.cm3.getMoney(50);

        bank.cm3.putMoney(20);

        int getMoneyTrans = bank.AllGetMoneyTrans(); //pobiera ilosc wyplat ze wszystkich bankomatow
        System.out.println(getMoneyTrans);
        int putMoneyTrans = bank.AllPutMoneyTrans(); // pobiera ilosc wplat z bankomatow
        System.out.println(putMoneyTrans);
        int a = bank.averageGetMoney(); // pobiera srednia ilos wyplat z bankomatu
        System.out.println(a);
        int b = bank.averagePutMoney(); // pobiera srednia ilosc wplat z bankomatu
        System.out.println(b);
        int c = bank.GetSumFromAllMachines(); // pobiera sume ze wszystkich bankomatow
        System.out.println(c);

    }
}
