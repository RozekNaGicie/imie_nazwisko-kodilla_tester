import java.util.Random;


public class RandomNumbers {

    public int randomN() {

        Random rand = new Random();

        int sum = 0;
        int max = 0;
        int min = 31; // 31 wykracza poza scope losowania liczb dzieki temu moge uzyskac liczbe min;

        for (int i = 0; ; i++) {

            int number = rand.nextInt(31);
            sum = sum + number;

            max = Math.max(number, max);
            min = Math.min(number, min);

            if (sum > 5000) {
                maxInt(max);
                minInt(min);
                return sum;
            }

        }

    }

    public int maxInt(int max) {

        System.out.println(max);
        return max;

    }

    public int minInt(int min) {

        System.out.println(min);
        return min;

    }

}
