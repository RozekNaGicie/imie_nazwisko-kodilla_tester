package com.zadania_tablice;

public class CwiczeniaXIV {

    public void square(int x, int o){
        //argument x opisuje z ilu znakow sklada sie bok
        // argument y od jakiego znaku rozpoczac
        char xMark = 'x';
        char oMark = 'o';

        char[][] tab = new char[x][x];

        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j <tab[i].length; j++){
                if(j == x-4){
                    System.out.print('\n');
                }
                if(o == 'o'){
                    System.out.print(oMark + " ");
                }else{
                    System.out.print(xMark + " ");
                }
            }
        }

    }

}
