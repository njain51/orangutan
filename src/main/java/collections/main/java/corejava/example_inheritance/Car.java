package collections.main.java.corejava.example_inheritance;

public class Car extends Machine {


    @Override
    public void start() {
        System.out.println("Car Started");

    }

    @Override
    public void stop(){
        System.out.println("Car stopped");
    }
}
