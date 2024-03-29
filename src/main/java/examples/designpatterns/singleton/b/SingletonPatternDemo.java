package examples.designpatterns.singleton.b;

public class SingletonPatternDemo {

    public static void main(String[] args) {

        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //Get the only object available
        SingleObject object = SingleObject.getInstance();
        SingleObject object1 = SingleObject.getInstance();
        //show the message
        object.showMessage();

        // Both will print same value of object
        System.out.println(object);
        System.out.println(object1);


    }
}
