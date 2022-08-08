public class Person {
    private static String name = "Joey";
    public static void main(String[] args) {
    getName();
//    setName("Katara");
    sayHello();

    }

    public static String getName(){
//TODO: return the person's name

//        System.out.println( Person.name);
       return Person.name;
    }

    public static void setName(String name){
//TODO: change the name field to the passed value
        Person.name = name;
//        System.out.println(name);
    }
    public static void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hi " + getName());
    }

}
