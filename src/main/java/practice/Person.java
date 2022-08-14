package practice;

public class Person {
    private static int peopleCount = 0;
    private String name;
    private int age;


    public Person(String name, int age) { //
        Person.peopleCount++;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
