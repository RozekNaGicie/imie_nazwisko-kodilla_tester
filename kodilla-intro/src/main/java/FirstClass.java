public class FirstClass {
    public static void main (String[] args){
        Notebook newNotebook = new Notebook("50g", 100);
        Notebook newNoteSmall = new Notebook("1250g", 200);
        Notebook newNoteXX = new Notebook("5000g", 1000);
        System.out.printf("Notebook " + newNotebook.weight + " price " + newNotebook.price + '\n');
        newNotebook.checkPrice();
        System.out.printf("Notebook small " + newNoteSmall.weight + " price " + newNoteSmall.price + '\n');
        newNoteSmall.checkPrice();
        System.out.printf("NotebookXX " + newNoteXX.weight + " price " + newNoteXX.price + '\n');
        newNoteXX.checkPrice();
    }
}
