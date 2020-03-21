package com.kodilla.bank.homework;

//metoda do wypłacania gotówki
// metoda do wplacania gotówki
// informacje o tym umieszczane w tablicy: dodatnio wplaty, ujemne wyplaty;
// metoda ktora zwroci liczbe wykonanych tranakcji
// metoda zwracajaca saldo bankomatu (ile w nim jest);

public class CashMachine {

    private int[] transactionArray;
    public int size;
    public int countOfGetMoney;
    public int countOfPutMoney;

    public CashMachine() {
        this.transactionArray = new int[0];
        this.size = 0;
        this.countOfGetMoney = 0;
        this.countOfPutMoney = 0;
    }

    private int[] addToArray(int value) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(this.transactionArray, 0, newTab, 0, this.transactionArray.length);
        newTab[this.size - 1] = value;
//        System.out.println(newTab[1]);
        this.transactionArray = newTab;
        return this.transactionArray;
    }

    private boolean isValueCorrect(int value) {
        return value > 0;
    }

    public void getMoney(int value) {
        if (isValueCorrect(value)) {
            int temp1 = -value;
            addToArray(temp1);
            this.countOfGetMoney++;
            System.out.println("Wyplacono " + value + "zł");

        } else {

            System.out.println("Cos poszlo nie tak");

        }
    }

    public void putMoney(int value){

        if (isValueCorrect(value)) {
            addToArray(value);
            this.countOfPutMoney++;
            System.out.println("Wplacono " + value + "zł");

        } else {
            System.out.println("Cos poszlo nie tak");

        }
    }

    public int cashMachineSaldo(){
        int sum =0;
        for(int i =0; i <this.transactionArray.length; i++ ){
            sum = sum + this.transactionArray[i];
        }
        return sum;
    }

    public int cashMachineHistory(){
        return this.transactionArray.length;
    }

    public int[] transGetter(){
        return this.transactionArray;
    }

}
