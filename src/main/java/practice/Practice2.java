package practice;

public class Practice2 {

    public static void main(String[] args) {
        String k = "Kurt";
        Person kurt = new Person(k, 17);
        Person joe = kurt;
        joe.setName("Joe");
        kurt.setAge(33);
    }

}
