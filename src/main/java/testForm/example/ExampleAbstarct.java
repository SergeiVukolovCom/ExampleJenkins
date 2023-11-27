package testForm.example;

public abstract class ExampleAbstarct {
    String name;
    int age;

    public void sleep() {
        System.out.println("Go to sleep");
    }

    private void secretWork() {
        System.out.println("I work for a secret company");
    }

    public abstract void findJob();

    public int sumValues(int a, int b) {
        return a + b;
    }

    public String sumValues(String a, String b, String c) {
        return a + b + c;
    }
    

}
