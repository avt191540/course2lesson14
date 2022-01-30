package pro.sky.java.course2;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s = "Hello";

        StringList list = new StringListImpl(10);
        System.out.println(list.add(2, "String-1"));
        System.out.println(list.add(s));
        System.out.println(list.add(2, "String-1"));

    }
}
