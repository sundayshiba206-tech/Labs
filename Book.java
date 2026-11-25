//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 6.7

/*
 * A simple class to represent a book.
 */

public class Book {
    private String  title;
    private String  author;
    private String  isbn;
    private boolean available;

    public Book(String title, String author, String isbn) {
        this.title  = title;
        this.author = author;
        this.isbn   = isbn;
        this.available = true;          // a new book is on the shelf
    }

    public String  getTitle()     { return title;  }
    public String  getAuthor()    { return author; }
    public String  getIsbn()      { return isbn;   }
    public boolean isAvailable()  { return available; }

    // Guarded state changes — the only way 'available' flips.
    // A caller cannot force an already-borrowed book to be borrowed again.
    boolean checkOut() {                // package-private: only Library should call
        if (!available) return false;
        available = false;
        return true;
    }

    boolean returnBook() {
        if (available) return false;
        available = true;
        return true;
    }

    @Override
    public String toString() {
        return String.format("Book{isbn='%s', title='%s', author='%s', %s}",
                isbn, title, author, available ? "available" : "on loan");
    }
}
