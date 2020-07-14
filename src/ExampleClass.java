public class ExampleClass  {

    void method() {
        Car car = new Ferrary();
        car.Run();
        car.Stop();
    }
}

abstract class Car {
    int speed;
    abstract void Run();
    void Stop() {
        speed = 0;
    }
}

class Ferrary extends Car {

    @Override
    void Run() {
        speed = 25;
    }
}

abstract class Ball extends ExampleClass {

}

final class MyFinalClass {
    void someLogic() {

    }
}
