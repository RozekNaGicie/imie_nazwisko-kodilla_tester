public class FirstClass {
    public static void main(String[] args) {

        Notebook newNotebook = new Notebook(50, 600, 1995);
        Notebook newNoteSmall = new Notebook(3000, 1200, 2020);
        Notebook newNoteXX = new Notebook(5000, 1000, 2019);


        ShowAllInfo(newNotebook, "Notebook ");

        ShowAllInfo(newNoteSmall, "Notebook small ");

        ShowAllInfo(newNoteXX, "NotebookXX ");


        //   zadanie rok przestepny
        LeapYear newYear = new LeapYear(1900);
        boolean year = newYear.isYear();
        System.out.println(year);
    }

    private static void ShowAllInfo(Notebook newNotebook, String s) {

        System.out.printf(s + newNotebook.weight + " price " + newNotebook.price + '\n');
        newNotebook.checkPrice();
        newNotebook.checkWeight();
        newNotebook.comparePriceAndYear();

    }

}
