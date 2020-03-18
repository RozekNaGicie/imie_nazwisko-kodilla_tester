public class User {

    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void main() {

        //tworzenie tablicy obiektow
        User arr[] = new User[5];

        arr[0] = new User("adam", 54);
        arr[1] = new User("Mateusz", 55);
        arr[2] = new User("Tomek", 25);
        arr[3] = new User("Czarek", 32);
        arr[4] = new User("Maciek", 15);

        //wykonanie dzialan
        int sumOfAge = 0;
        for (int i = 0; i < arr.length; i++) {

            sumOfAge = sumOfAge + arr[i].age;

        }
        int average = sumOfAge / arr.length;

        for (int i = 0; i < arr.length; i++) {

            if (average > arr[i].age) {

                System.out.println(arr[i].name + " " + arr[i].age);

            }

        }

    }

}
