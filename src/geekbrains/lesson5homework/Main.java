package geekbrains.lesson5homework;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee Employee1 = new Employee("Александр", "Стажер", "1111@mail.ru", "88005005050", "50000", 25);
        /*Employee1.name =  "Александр";
        Employee1.position = "Стажер";
        Employee1.email = "1111@mail.ru";
        Employee1.salary = "50000";
        Employee1.phoneNum = "88005005050";
        Employee1.age = 25;*/

        Employee1.info();

        Employee[] Employees = new Employee[5];
        Employees[0] = new Employee("Александр", "Стажер", "1111@mail.ru", "88005005050", "50000", 25);
        Employees[1] = new Employee("Сергей", "Стажер", "2222@mail.ru", "88005005051", "50000", 47);
        Employees[2] = new Employee("Иван", "Стажер", "3333@mail.ru", "88005005052", "50000", 32);
        Employees[3] = new Employee("Анатолий", "Стажер", "4444@mail.ru", "88005005053", "50000", 62);
        Employees[4] = new Employee("Вадим", "Стажер", "5555@mail.ru", "88005005054", "50000", 16);


        System.out.println(Arrays.toString(Employees));

    }
}
