interface Displayable {
    void displayInfo();
}

class Person implements Displayable {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void displayInfo() {
        System.out.println("Person: Name - " + name + ", Age - " + age);
    }
}
