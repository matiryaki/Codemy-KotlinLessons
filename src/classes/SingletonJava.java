package classes;

import kotlin.jvm.Synchronized;
import kotlin.jvm.Volatile;

class SingletonJava {

    @Volatile
    private static SingletonJava newInstance = null;
    public String color = "";

    private SingletonJava() {

    }

    @Synchronized
    public static SingletonJava getNewInstance() {

        if (newInstance == null) {
            newInstance = new SingletonJava();
        }

        return newInstance;
    }

    public void getMemoryObject() {
        for (int i = 0; i < 1000000; i++) {
            int number = i;
            int number2 = i + 1;
            int number3 = i + 1;
            int number4 = i + 1;
            int number5 = i + 1;
        }
    }
}
