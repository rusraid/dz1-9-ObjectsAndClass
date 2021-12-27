package homework1;

public class MyMain {
    public static void main(String[] args) {

        Author bulgakov = new Author("Mihail"," Bulgakov");
        Author gogol = new Author("Nikolay", " Gogol");


        Book TheMasterAndMargarita = new Book(bulgakov, "Picador", 1997);
        Book DeadSouls = new Book(gogol, "Academia", 1957);

        System.out.println(bulgakov.getAuthorName() + bulgakov.getAuthorSurname() + " " + TheMasterAndMargarita.getPublisherName() + " " + TheMasterAndMargarita.getPublishingYear());
        System.out.println(gogol.getAuthorName() + gogol.getAuthorSurname() + " " + DeadSouls.getPublisherName() + " " + DeadSouls.getPublishingYear());

        System.out.println("DeadSouls.getPublishingYear() = " + DeadSouls.getPublishingYear());

        System.out.println("Меняем год выпуска книги");
        DeadSouls.setPublishingYear(2020);
        System.out.println("DeadSouls.getPublishingYear() = " + DeadSouls.getPublishingYear());
    }
}
