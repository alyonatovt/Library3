public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Holly Black", 51, 44);
        Author author2 = new Author("Stephen Edwin King", 75, 264);
        Author author3 = new Author("Dan Brown", 58, 8);

      Book book1 = new Book("The Cruel Prince","Holly Black",2018,416);
      Book book2 = new Book("IT","Stephen Edwin king",1986,1138);
      Book book3 = new Book("The Da Vinci Code", "Dan Brown ", 2003,320);

     Student student1 = new Student("Alyona",18,"Tovt","KN-23");
     Student student2 = new Student("Vanessa",18,"Yezerska","KN-23");
     Student student3 = new Student("Olesia",18,"Myskiv","KN-23");

//Person person = new Person("Alyona",18);
//person.displayInfo();
//
//Author author1 = new Author("Dan Brown",58,8);
//        author1.displayInfo();
//
//Student student1 = new Student("Vanessa",18,"Yezerska","KN-23");
//student1.displayInfo();
        
        author1.displayInfo();
        book1.displayInfo();
        student1.displayInfo();
    }
}
