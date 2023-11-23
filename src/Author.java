class Author extends Person {
    int booksWritten;
    int pages;

    Author(String name, int age, int booksWritten) {
        super(name, age);
        this.booksWritten = booksWritten;

    }

    @Override
    public void displayInfo() {
        System.out.println("Author: Name - " + name + ", Age - " + age + ", Books Written - " + booksWritten);
    }
}
