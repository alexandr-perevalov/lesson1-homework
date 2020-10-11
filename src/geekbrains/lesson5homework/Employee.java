package geekbrains.lesson5homework;

public class Employee {
    public String name;
    public String position;
    public String email;
    public String phoneNum;
    public String salary;
    public int age;


    public Employee(String name, String position, String email, String phoneNum, String salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNum = phoneNum;
        this.salary = salary;
        this.age = 0;
    }


    public void info() {
        System.out.printf("Работник\n" + name + "\n" + age + "\n" + position + "\n" + email + "\n" + phoneNum + "\n" + salary);
    }
}
