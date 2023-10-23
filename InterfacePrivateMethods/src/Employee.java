public class Employee implements Person{

    //Create a class EmployeeRegistry

    private String name;
    private String surname;
    private int age;

    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String name() {
        return name;
    }

    public int fibonacci(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


    @Override
    public String surname() {
        return surname;
    }

    @Override
    public int age() {
        return age;
    }
}
