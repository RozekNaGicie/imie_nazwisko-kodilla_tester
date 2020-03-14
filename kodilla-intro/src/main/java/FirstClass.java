public class FirstClass {
    public static void main (String[] args){
        Notebook newNotebook = new Notebook("50g");
        Notebook newNoteSmall = new Notebook("1250g");
        Notebook newNoteXX = new Notebook("5000g");
        System.out.println(newNotebook.weight);
        System.out.println(newNoteSmall.weight);
        System.out.println(newNoteXX.weight);
    }
}
