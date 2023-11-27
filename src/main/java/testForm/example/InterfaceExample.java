package testForm.example;

public interface InterfaceExample {
    String placeBorn = "Kherson";
    String mothersName = "Alla";

    private void relocation() {
        System.out.println("Go to Europe");
    }

    void goToSchool();

    default void goToKinderGarten() {
        System.out.println("Go to Kindergarten");
    }

    void firstMethod();

    static void secondMethod() {
        System.out.println("second method");
    }

    void thirdMethod();

}
