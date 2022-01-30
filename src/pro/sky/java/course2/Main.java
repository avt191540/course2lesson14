package pro.sky.java.course2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s1 = "Hello";
        String s2 = "Igor";
        String s3 = "Chernyy";
        String s4 = "Georgievich";

        StringList list = new StringListImpl();
        System.out.println(list.add(2, "String-1"));
        System.out.println(list.add(s1));
        System.out.println(list.add(s2));
        System.out.println(list.add(s3));
        System.out.println(list.add(s4));
        System.out.println(list.getLengthArray());
        System.out.println();
        System.out.println(list.add(2, "String-1"));

    }
}
