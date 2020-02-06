package classes;

public class SingletonJavaTest {

    public static void main(String[] args) {

        SingletonJava.getNewInstance().color = "blue";
        System.out.println(SingletonJava.getNewInstance().color);

        SingletonJava.getNewInstance().color = "red";
        System.out.println(SingletonJava.getNewInstance().color);

        SingletonJava.getNewInstance().getMemoryObject();

        Photo photo = new Photo();

        photo.printAll();

        Photo.Companion.getBASE_URL();
        Photo.Companion.getBASE_URL2();
        Photo.getBASE_URL2();
    }
}
