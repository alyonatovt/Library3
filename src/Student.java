class Student extends Person {
    String surname;
    String group;

    Student(String name, int age, String surname, String group) {
        super(name, age);
        this.surname = surname;
        this.group = group;
    }

    @Override
    public void displayInfo() {
        System.out.println("Student: Name - " + name + ", Age - " + age +
                ", Surname - " + surname + ", Group - " + group);
    }
}
