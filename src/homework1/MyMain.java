package homework1;

public class MyMain {
    public static void main(String[] args) {

        Author bulgakov = new Author("Mihail"," Bulgakov");
        Author gogol = new Author("Nikolay", " Gogol");


        Book theMasterAndMargarita = new Book(bulgakov, "Picador", 1997);
        Book deadSouls = new Book(gogol, "Academia", 1957);
        Book deadSouls2 = new Book(gogol, "Academia", 1957);

//        System.out.println(bulgakov.getAuthorName() + bulgakov.getAuthorSurname() + " " + theMasterAndMargarita.getPublisherName() + " " + theMasterAndMargarita.getPublishingYear());
//        System.out.println(gogol.getAuthorName() + gogol.getAuthorSurname() + " " + deadSouls.getPublisherName() + " " + deadSouls.getPublishingYear());

        System.out.println(theMasterAndMargarita);
        System.out.println(deadSouls);

//        System.out.println("deadSouls.getPublishingYear() = " + deadSouls.getPublishingYear());
//        System.out.println("Меняем год выпуска книги");
//        deadSouls.setPublishingYear(2020);
//        System.out.println("deadSouls.getPublishingYear() = " + deadSouls.getPublishingYear());

        System.out.println("Сравнение копий книг через equals: " + deadSouls.equals(deadSouls2));
        System.out.println("Сравнение копий книг через hashCode: " + (deadSouls.hashCode() == deadSouls2.hashCode()));
        System.out.println("Сравнение разных книг через equals: " + deadSouls.equals(theMasterAndMargarita));
        System.out.println("Сравнение разных книг через hashCode: " + (deadSouls.hashCode() == theMasterAndMargarita.hashCode()));


    }
}
