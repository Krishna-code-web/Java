public class fiftyOne {
//    Create a Book class for a library system.
// • Instance variables: title, author, isbn.
// • Static variable: totalBooks, a counter for the total number of book
//    instances.
// • Instance methods: borrowBook(), returnBook().
//            • Static method: getTotalBooks(), to get the total number of books in the
//    library.
    String title;
    String author;
    int isbn;
    int totalBooks;

    fiftyOne(String title, String author, int isbn, int books){
        this.author = author;
        this.title = title;
        this.isbn = isbn;
        this.totalBooks = books;
    }
    public void borrowBook(){
        if(this.totalBooks > 0){
            System.out.println("Book borrowed!");
            this.totalBooks--;
        } else{
            System.out.println(this.title + " not available");
        }
    }

    public void returnBook(){
        System.out.println("Book returned Successfully!");
        this.totalBooks++;
    }

    public int getTotalBooks(){
        return this.totalBooks;
    }

    public static void main(String[] args) {
        fiftyOne book1 = new fiftyOne("Atomic Habit", "Don't Know", 101, 10);
        fiftyOne book2 = new fiftyOne("Learning SQL", "Mark Arther", 102, 10);
        book1.borrowBook();
        book1.borrowBook();

        System.out.println("Total Books of isbn " + book1.isbn + " is " +book1.getTotalBooks());
        book1.returnBook();
        book1.returnBook();

        book2.borrowBook();
        book2.borrowBook();

        System.out.println("Total Books of isbn " + book2.isbn + " is " +book2.getTotalBooks());
        book2.returnBook();
        book2.returnBook();

    }
}
