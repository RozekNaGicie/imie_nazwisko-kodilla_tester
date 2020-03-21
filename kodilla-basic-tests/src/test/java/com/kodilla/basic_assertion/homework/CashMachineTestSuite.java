package com.kodilla.basic_assertion.homework;

import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CashMachineTestSuite {

    private CashMachine cashMachineInstance = new CashMachine();
    private CashMachine anotherCashMachineInstance = new CashMachine();

    //Asercje przekazywanej tablicy operacji
    @Test
    public void shouldReturnLengthZeroIfNotTrans() {
        int[] temp1 = cashMachineInstance.transGetter();
        boolean isZero = temp1.length == 0;
        assertTrue(isZero);
    }

    @Test
    public void shouldReturnLengthIfAddTrans() {
        cashMachineInstance.putMoney(30);
        int[] temp1 = cashMachineInstance.transGetter();
        boolean isZero = temp1.length == 0;
        assertFalse(isZero);
    }

    @Test
    public void shouldReturnLengthZeroIfAddZero() {
        cashMachineInstance.putMoney(0);
        int[] temp1 = cashMachineInstance.transGetter();
        boolean isZero = temp1.length == 0;
        assertTrue(isZero);
    }

    @Test
    public void shouldReturnLengthZeroIfAddMinus() {
        cashMachineInstance.putMoney(-20);
        int[] temp1 = cashMachineInstance.transGetter();
        boolean isZero = temp1.length == 0;
        assertTrue(isZero);
    }

    @Test
    public void shouldReturnFalseFromEqualsTwoDiffrentCMArrays() {
        cashMachineInstance.putMoney(20);
        anotherCashMachineInstance.putMoney(0);
        int[] temp1 = cashMachineInstance.transGetter();
        int[] temp2 = anotherCashMachineInstance.transGetter();
        boolean isFalse = temp1.length == temp2.length;
        assertFalse(isFalse);
    }

    @Test
    public void shouldReturnTrueIfPutMoneyValueIsPositive() {
        cashMachineInstance.putMoney(20);
        int[] temp1 = cashMachineInstance.transGetter();
        boolean isPositive = temp1[0] > 0;
        assertTrue(isPositive);
    }

    @Test
    public void shouldReturnTrueIfGetMoneyValueIsMinus() {
        cashMachineInstance.getMoney(20);
        int[] temp1 = cashMachineInstance.transGetter();
        boolean isMinus = temp1[0] < 0;
        assertTrue(isMinus);
    }

    //Asercje metody salda bankomatu
    @Test
    public void shouldReturnZeroIfNoOperations() {
        assertEquals(0, cashMachineInstance.cashMachineSaldo());
    }

    @Test
    public void shouldReturnPositiveValueOfOperationIfPutMethod() {
        cashMachineInstance.putMoney(50);
        assertEquals(50, cashMachineInstance.cashMachineSaldo());
    }

    @Test
    public void shouldReturnZeroIfWrongMethodValue() {
        cashMachineInstance.getMoney(-120);
        assertEquals(0, cashMachineInstance.cashMachineSaldo());
    }

    @Test
    public void shouldReturnMinusValueOfOperationIfGetMethod() {
        cashMachineInstance.getMoney(50);
        assertEquals(-50, cashMachineInstance.cashMachineSaldo());
    }

    @Test
    public void shouldReturnPositiveValueOfFewOperationIfPutMethodHaveBiggerValue() {
        cashMachineInstance.getMoney(50);
        cashMachineInstance.putMoney(100);
        assertEquals(50, cashMachineInstance.cashMachineSaldo());
    }

    @Test
    public void shouldReturnMinusValueOfFewOperationIfGetMethodHaveBiggerValue() {
        cashMachineInstance.getMoney(200);
        cashMachineInstance.putMoney(120);
        assertEquals(-80, cashMachineInstance.cashMachineSaldo());
    }

    @Test
    public void shouldReturnZeroValueOfFewOperationIfGetAndPutMethodIsSame() {
        cashMachineInstance.getMoney(120);
        cashMachineInstance.putMoney(120);
        assertEquals(0, cashMachineInstance.cashMachineSaldo());
    }

    //Asercje liczby wykonanych operacji
    @Test
    public void shouldReturnZeroofNumberOperationsIfNoOperations() {
        assertEquals(0, cashMachineInstance.cashMachineHistory());
    }

    @Test
    public void shouldReturnOneIfItWasOneOperation() {
        cashMachineInstance.getMoney(120);
        assertEquals(1, cashMachineInstance.cashMachineHistory());
    }

    @Test
    public void shouldReturnNumberOfOperations() {
        cashMachineInstance.getMoney(120);
        cashMachineInstance.getMoney(120);
        cashMachineInstance.putMoney(120);
        assertEquals(3, cashMachineInstance.cashMachineHistory());
    }

    @Test
    public void shouldReturnZeroIfWrongValue() {
        cashMachineInstance.getMoney(-120);
        assertEquals(0, cashMachineInstance.cashMachineHistory());
    }

    @Test
    public void shouldReturnZeroIfValueZero() {
        cashMachineInstance.getMoney(0);
        assertEquals(0, cashMachineInstance.cashMachineHistory());
    }
}
