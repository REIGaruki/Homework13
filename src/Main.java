public class Main {
    public static void main(String[] args) {
        Author tolstoyLN = new Author("Лев", "Толстой");
        Author pushkinAS = new Author("Александр", "Пушкин");
        Book warAndPeace = new Book("Война и мир", tolstoyLN, 2020);
        Book evgeniyOnegin = new Book("Евгений Онегин", pushkinAS);
        Book onegin = new Book("Евгений Онегин", pushkinAS, 1850);
        evgeniyOnegin.setPublishYear(2300);
        warAndPeace.setPublishYear(2300);
        System.out.println(warAndPeace);
        System.out.println(evgeniyOnegin);
        System.out.println(onegin.hashCode() == evgeniyOnegin.hashCode());
    }
}