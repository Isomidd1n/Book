import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Obtaining an object
        Book book = new Book();

        //Giving value to the author
        book.setAuthor(new String[]{"Isomiddin", "Shohrux"});

        //Naming.
        book.setName("SQL");

        //Output values to the console.
        System.out.println("Author name: " + Arrays.toString(book.getAuthor()) + "\nBook name: " + book.getName());
    }
}

