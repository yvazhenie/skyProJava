package ObjectsClasses;


public class HwObjectsClasses {
    public static void main(String[] args) {
        Book warAndPeace = new Book("Война и Мир", 1867, new Author("Лев", "Толстой. "));
        System.out.println(warAndPeace);

        Book crimeAndPunishment = new Book();
        crimeAndPunishment.setName("Преступление и наказание.");
        System.out.print("Название книги: " + crimeAndPunishment.getName());
        crimeAndPunishment.setDateOfWriting(1866);
        System.out.print(" Год издания: " + crimeAndPunishment.getDateOfWriting());
        Author Fedor = new Author("Федор", "Достоевский.");
        crimeAndPunishment.setAuthor(Fedor);
        System.out.println(". Автор книги: " + crimeAndPunishment.getAuthor());


    }

}
