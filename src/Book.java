class Book implements Displayable {
    String title;
    String author;
    int publicationYear;
    int pages;

    public Book(String title, String author, int publicationYear, int pages) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.pages = pages;
    }

    @Override
    public void displayInfo() {
        System.out.println("Book: Title - " + title + ", Author - " + author +
                ", Year - " + publicationYear + ",Pages in book - " + pages);
    }
}
