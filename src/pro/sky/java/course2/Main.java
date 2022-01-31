package pro.sky.java.course2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s1 = "Hello";
        String s2 = "Igor";
        String s3 = "Chernyy";
        String s4 = "Georgievich";
        String s5 = "My friend";
        String s6 = "Best";


        StringList list = new StringListImpl();
        System.out.println(list.add(s1));
        System.out.println(list.add(s2));
        System.out.println(list.add(s3));
        System.out.println(list.add(s4));
        System.out.println(list.add(1, s5));
        System.out.println(Arrays.toString(list.toArray()));
//        System.out.println((list.toArray().length));

        System.out.println(list.getLengthArray());
//        System.out.println();
        System.out.println(list.add(2, "String-1"));
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(list.set(2, s6));
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(list.remove(s1));
        System.out.println(Arrays.toString(list.toArray()));

    }
}
