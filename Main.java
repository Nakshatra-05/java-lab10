//Main.java
//Name: Nakshatra Pal
//PRN: 2307016075
//Batch: A3

public class Main {
    public static void main(String[] args) {
        new Thread(new MyThread(1, 2, 300)).start();
        new Thread(new MyThread(100, 20, 1000)).start();
    }
}
