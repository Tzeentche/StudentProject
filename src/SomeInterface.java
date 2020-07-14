interface SomeInterface extends IOtherInterface {
    int SOME_VARIABLE = 5;
    abstract void addTwoDigits(int one, int two);
}

interface IOtherInterface {
    void someMethod();
}

interface Bancable {
    void bounce();
}

class Example implements SomeInterface {

    @Override
    public void addTwoDigits(int one, int two) {

    }

    public void someMethod() {

    }

    public void bounce() {

    }
}