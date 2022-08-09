public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Katara");
        person1.getName();
        person1.setName("Kairo");
        System.out.println(person1.getName());
        person1.sayHello();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
//TODO: print a message to the console using the person's name
        System.out.println("Hey " + getName());

    }



}
