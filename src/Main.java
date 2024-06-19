public class Main {

    public static void main(String[] args) {
        //Создаем авторов
        Author author1 = new Author("Vladimir", "Starygin");
        Author author2 = new Author("Elizaveta", "Malova");

        //Создаем книги
        Book book1 = new Book("Tutorial on building a bathhouse", author1, 2013);
        Book book2 = new Book("Banking", author2, 2020);

        //Изменим год публикации банного самоучителя
        book1.setPublicationYear(2017);
    }
}
