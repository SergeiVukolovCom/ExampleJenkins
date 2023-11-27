package testForm.example;

public class ChildExampleAbstract extends ExampleAbstarct implements InterfaceExample{

    @Override
    public void findJob() {
        System.out.println("I want to find job in IT");
    }



    public static void main(String[] args) {
        ChildExampleAbstract childExampleAbstract = new ChildExampleAbstract();
        childExampleAbstract.age = 18;
        childExampleAbstract.name = "Sergei";
        childExampleAbstract.findJob();
        childExampleAbstract.sleep();
        childExampleAbstract.goToKinderGarten();
        childExampleAbstract.goToSchool();
        childExampleAbstract.firstMethod();
        childExampleAbstract.thirdMethod();
        InterfaceExample.secondMethod();
        System.out.println(childExampleAbstract.sumValues(10, 20));
        System.out.println(childExampleAbstract.sumValues("a", "b", "c"));

    }

    @Override
    public void goToSchool() {
        System.out.println("Go to School");
    }

    @Override
    public void firstMethod() {
        System.out.println("first");
    }

    @Override
    public void thirdMethod() {
        System.out.println("Third method");
    }
}
