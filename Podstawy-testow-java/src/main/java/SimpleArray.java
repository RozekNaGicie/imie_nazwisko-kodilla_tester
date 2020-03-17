import java.lang.reflect.Array;

public class SimpleArray {

    public static void main (String[] args){

        String newArray[] = new String[] {"Pies","Kot", "Slon","Jaszczomp", "Myszojelen","Bober"};

        String newAnimal = newArray[3];
        System.out.println(newAnimal);

        //pobieranie dlugosci tablicy 2 sposoby
        int someInt = Array.getLength(newArray);
        int someInt2 = newArray.length;
        System.out.println("Moja tablica zawiera " + someInt + " elementow");

    }

}
