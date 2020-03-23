package com.zadania_tablice;

public class ZadaniaTablice {

    public int[] zadanie1(){
        int[] tab = new int[10];
        return tab;
    }
    public int[] zadanie2() {
        int[] tab = new int[10];
        int max = 1;
        int min = 0;
        int range = max - min + 1;
        for(int i = 0; i<tab.length; i ++){
            tab[i] = (int)(Math.random()*range)+ min;
//            System.out.println(tab[i]);
        }
        return tab;
    }
    public void zadanie3(int[] tab){
        int zero = 0 ;
        int one = 0 ;
        int[] tabs = new int[2];
        for(int i = 0; i < tab.length; i++){
//            if (tab[i] > 0) {
////                System.out.println(tab[i]);
//                 one++;
////                System.out.println(one);
//            } else  {
//                 zero++;
//            }
            int msg = (tab[i] > 0)? one++ : zero++;
        }
        tabs[0] = zero;
        tabs[1] = one;
        System.out.print(tabs[0]+ " i " + tabs[1]);
    }

    public void zadanie4(){
        int[] tab = {1,0,0,0,2,0,0,0,3};
        for(int i = tab.length -1; i >= 0; i--){
         System.out.print(tab[i] + " ");
            if(i == 3 || i == 6){
                System.out.print('\n');
            }
        }
    }
}
