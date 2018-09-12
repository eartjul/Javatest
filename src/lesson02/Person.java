package lesson02;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Person {
    String firstName;
    String secondName;
    int age;
    private static int count = 0;

    public Person(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
        count++;
    }

    public Person(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;

        count++;
    }

    void doSomething () {
        System.out.println(count + "makes smth.");

    }
    static void doSomethingElse () {
        System.out.println("Class was initialized.");
    }
    static {
        System.out.println("Class was initialized");
    }
    {
        System.out.println(count + "Person was created.");
    }

    private void println(String out){
        System.out.println(out);
    }
}

