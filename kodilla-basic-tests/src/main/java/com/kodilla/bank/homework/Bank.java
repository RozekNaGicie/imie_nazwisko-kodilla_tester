package com.kodilla.bank.homework;

public class Bank {

    CashMachine[] arrayOfCM;
    CashMachine cm1;
    CashMachine cm2;
    CashMachine cm3;

    public Bank() {
        this.arrayOfCM = new CashMachine[]{cm1 = new CashMachine(), cm2 = new CashMachine(), cm3 = new CashMachine()};
    }

    public int GetSumFromAllMachines() {
        int sum = 0;
        for (int i = 0; i < this.arrayOfCM.length; i++) {
            sum = sum + this.arrayOfCM[i].cashMachineSaldo();
        }
        return sum;
    }

    public int AllGetMoneyTrans() {
        int sum = 0;
        for (int i = 0; i < this.arrayOfCM.length; i++) {
            sum = sum + this.arrayOfCM[i].countOfGetMoney;
        }
        return sum;
    }

    public int AllPutMoneyTrans() {
        int sum = 0;
        for (int i = 0; i < this.arrayOfCM.length; i++) {
            sum = sum + this.arrayOfCM[i].countOfPutMoney;
        }
        return sum;
    }

    public int averageGetMoney() {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < this.arrayOfCM.length; i++) {
            int[] transArray = this.arrayOfCM[i].transGetter();
            for (int j = 0; j < transArray.length; j++) {
                if (transArray[j] < 0) {
                    sum = sum + transArray[j];
                    count++;
                }
            }
        }
        return -(sum / count);
    }

    public int averagePutMoney() {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < this.arrayOfCM.length; i++) {
            int[] transArray = this.arrayOfCM[i].transGetter();
            for (int j = 0; j < transArray.length; j++) {
                if (transArray[j] > 0) {
                    sum = sum + transArray[j];
                    count++;
                }
            }
        }
        return sum / count;
    }


}
