import java.lang.reflect.Array;

public class Loops {

    public int main(int[] array) {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {

            sum = sum + array[i];
        }
        return sum;
    }

}
