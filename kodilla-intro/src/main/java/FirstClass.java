public class FirstClass {
    public static void main (String[] args){
        Notebook newNotebook = new Notebook(50, 600,1995);
        Notebook newNoteSmall = new Notebook(3000, 1200, 2020);
        Notebook newNoteXX = new Notebook(5000, 1000, 2019);
        System.out.printf("Notebook " + newNotebook.weight + " price " + newNotebook.price + '\n');
        newNotebook.checkPrice();
        newNotebook.checkWeight();
        newNotebook.comparePriceAndYear();
        System.out.printf("Notebook small " + newNoteSmall.weight + " price " + newNoteSmall.price + '\n');
        newNoteSmall.checkPrice();
        newNoteSmall.checkWeight();
        newNoteSmall.comparePriceAndYear();
        System.out.printf("NotebookXX " + newNoteXX.weight + " price " + newNoteXX.price + '\n');
        newNoteXX.checkPrice();
        newNoteXX.checkWeight();
        newNoteXX.comparePriceAndYear();

        //        zadanie rok przestepny

        LeapYear newYear = new LeapYear(1900);
        boolean year = newYear.isYear();
        System.out.println(year);
    }
}
