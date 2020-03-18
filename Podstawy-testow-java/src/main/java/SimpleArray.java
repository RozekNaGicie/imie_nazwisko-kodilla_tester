import java.lang.reflect.Array;

public class SimpleArray {

    public static void main(String[] args) {

        String newArray[] = new String[]{"Pies", "Kot", "Slon", "Jaszczomp", "Myszojelen", "Bober"};
        String newAnimal = newArray[3];

        System.out.println(newAnimal);

        //pobieranie dlugosci tablicy 2 sposoby
        int someInt = Array.getLength(newArray);
        int someInt2 = newArray.length;

        System.out.println("Moja tablica zawiera " + someInt + " elementow");

        // petle
        String names[] = new String[]{"Zygfryd", "Gwidon", "Florentyna"};

        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }

        // wywolanie klasy Loops;
        Loops arr = new Loops();

        int newTab[] = new int[]{1, 2, 3, 4, 5, 6};
        int sum = arr.main(newTab);

        System.out.println(sum);



    }

}
