public class Book {
    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return this.name;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        if(!(obj instanceof Book)) {
            return false;
        }

        Book book = (Book) obj;

        return this.name.equals(book.name) && 
            this.publicationYear == book.publicationYear;
    }
}