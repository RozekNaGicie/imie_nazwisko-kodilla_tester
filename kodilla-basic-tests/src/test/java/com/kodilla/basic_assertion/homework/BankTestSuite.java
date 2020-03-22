package com.kodilla.basic_assertion.homework;

import com.kodilla.bank.homework.Bank;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankTestSuite {


    private Bank bank = new Bank();

    public Bank getBank() {
        return bank;
    }

    //Asercje bilansu z bankomatow
    @Test
    public void shouldReturnZeroIfNoOperations() {
        assertEquals(0, bank.GetSumFromAllMachines());
    }

    @Test
    public void shouldReturnPositiveValueFromOneMachine() {
        bank.cm1.putMoney(20);
        bank.cm1.putMoney(30);
        assertEquals(50, bank.GetSumFromAllMachines());
    }

    @Test
    public void shouldReturnPositiveValueFromFewMachines() {
        bank.cm1.putMoney(20);
        bank.cm1.putMoney(30);
        bank.cm2.putMoney(100);
        bank.cm3.putMoney(200);
        assertEquals(350, bank.GetSumFromAllMachines());
    }

    @Test
    public void shouldReturnNegativeValueFromOneMachine() {
        bank.cm1.getMoney(20);
        bank.cm1.getMoney(30);
        assertEquals(-50, bank.GetSumFromAllMachines());
    }

    @Test
    public void shouldReturnNegtiveValueFromFewMachines() {
        bank.cm1.getMoney(20);
        bank.cm1.getMoney(30);
        bank.cm2.getMoney(100);
        bank.cm3.getMoney(200);
        assertEquals(-350, bank.GetSumFromAllMachines());
    }

    @Test
    public void shouldReturnZeroValueFromFewMachinesIfWrongOperations() {
        bank.cm1.getMoney(-20);
        bank.cm1.getMoney(0);
        bank.cm2.getMoney(-100);
        bank.cm3.getMoney(0);
        assertEquals(0, bank.GetSumFromAllMachines());
    }

    //Asercje liczby transakcji zwiazanych z wyplata
    @Test
    public void shouldReturnZeroIfNoGetTrans() {
        bank.cm1.putMoney(20);
        bank.cm1.putMoney(20);
        assertEquals(0, bank.AllGetMoneyTrans());
    }

    @Test
    public void shouldReturnZeroIfNoTrans() {
        assertEquals(0, bank.AllGetMoneyTrans());
    }

    @Test
    public void shouldReturnNumberOfGetTransWhenOneMachineActive() {
        bank.cm1.getMoney(20);
        bank.cm1.getMoney(20);
        assertEquals(2, bank.AllGetMoneyTrans());
    }

    @Test
    public void shouldReturnNumberOfGetTransFromFewMachines() {
        bank.cm1.getMoney(20);
        bank.cm1.getMoney(20);
        bank.cm2.getMoney(20);
        bank.cm3.getMoney(20);
        assertEquals(4, bank.AllGetMoneyTrans());
    }

    @Test
    public void shouldReturnNumberOfGetTransIfDiffrentTrans() {
        bank.cm1.getMoney(20);
        bank.cm1.getMoney(20);
        bank.cm2.getMoney(20);
        bank.cm3.getMoney(20);
        bank.cm3.putMoney(20);
        bank.cm2.putMoney(20);
        assertEquals(4, bank.AllGetMoneyTrans());
    }

    //Asercje metody zwiazanych z wplata
    @Test
    public void shouldReturnZeroIfNoPutTrans() {
        bank.cm1.getMoney(20);
        bank.cm1.getMoney(20);
        assertEquals(0, bank.AllPutMoneyTrans());
    }

    @Test
    public void shouldReturnZeroIfNoTransaction() {
        assertEquals(0, bank.AllPutMoneyTrans());
    }

    @Test
    public void shouldReturnNumberOfPutTransWhenOneMachineActive() {
        bank.cm1.putMoney(20);
        bank.cm1.putMoney(20);
        assertEquals(2, bank.AllPutMoneyTrans());
    }

    @Test
    public void shouldReturnNumberOfPutTransFromFewMachines() {
        bank.cm1.putMoney(20);
        bank.cm1.putMoney(20);
        bank.cm2.putMoney(20);
        bank.cm3.putMoney(20);
        assertEquals(4, bank.AllPutMoneyTrans());
    }

    @Test
    public void shouldReturnNumberOfPutTransIfDiffrentTrans() {
        bank.cm1.putMoney(20);
        bank.cm1.putMoney(20);
        bank.cm2.putMoney(20);
        bank.cm3.putMoney(20);
        bank.cm3.getMoney(20);
        bank.cm2.getMoney(20);
        assertEquals(4, bank.AllPutMoneyTrans());
    }

    //asercje metody sredniej wartosci wyplaty
    @Test
    public void shouldReturnZeroAvrIfNoGetTrans() {
        bank.cm1.putMoney(20);
        bank.cm1.putMoney(20);
        assertEquals(0, bank.averageGetMoney());
    }

    @Test
    public void shouldReturnZeroAvrIfNoTrans() {
        assertEquals(0, bank.averageGetMoney());
    }

    @Test
    public void shouldReturnPositiveAvrIfGetTrans() {
        bank.cm1.getMoney(20);
        bank.cm1.getMoney(20);
        assertEquals(20, bank.averageGetMoney());
    }

    @Test
    public void shouldReturnPositiveAvrIfOneGetTrans() {
        bank.cm1.getMoney(20);
        assertEquals(20, bank.averageGetMoney());
    }

    @Test
    public void shouldReturnPositiveAvrIfDiffrentMethods() {
        bank.cm1.getMoney(20);
        bank.cm1.getMoney(50);
        bank.cm1.putMoney(30);
        bank.cm1.putMoney(20);
        assertEquals(35, bank.averageGetMoney());
    }

    //asercje metody sredniej wartosci wplaty
    @Test
    public void shouldReturnZeroAvrIfNoPutTrans() {
        bank.cm1.getMoney(20);
        bank.cm1.getMoney(20);
        assertEquals(0, bank.averagePutMoney());
    }

    @Test
    public void shouldReturnZeroAvrIfNoTransact() {
        assertEquals(0, bank.averagePutMoney());
    }

    @Test
    public void shouldReturnPositiveAvrIfPutTrans() {
        bank.cm1.putMoney(20);
        bank.cm1.putMoney(20);
        assertEquals(20, bank.averagePutMoney());
    }

    @Test
    public void shouldReturnPositiveAvrIfOnePutTrans() {
        bank.cm1.putMoney(20);
        assertEquals(20, bank.averagePutMoney());
    }

    @Test
    public void shouldReturnPositiveAvrIfDiffrentMeth() {
        bank.cm1.putMoney(20);
        bank.cm1.putMoney(50);
        bank.cm1.getMoney(30);
        bank.cm1.getMoney(20);
        assertEquals(35, bank.averagePutMoney());
    }
}
