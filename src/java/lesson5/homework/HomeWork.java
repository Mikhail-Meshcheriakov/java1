package lesson5.homework;

import lesson5.classwork.Array;

import java.util.ArrayList;

public class HomeWork {

    static class Person {

        private String name;
        private String position;
        private String email;
        private String phone;
        private int salary;
        private int age;

        public Person(String name, String positionJob, String email, String phone, int salary, int age) {
            this.name = name;
            this.position = positionJob;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }

        public void printPerson() {
            System.out.println("ФИО: " + name + "\nдолжность: " + position + "\nemail: " + email + "\nтелефон: " + phone + "\nзарплата: " + salary + "\nвозраст: " + age + "\n");
        }
    }

    public static void main(String[] args) {
        ArrayList<Person> personArray = new ArrayList<>();
        personArray.add(new Person("Петров Сергей Владимирович", "юрист", "petrov@mail.ru", "89151293587", 28000, 42));
        personArray.add(new Person("Иванов Иван Юрьевич", "бухгалтер", "ivanov@mail.ru", "89286571305", 40000, 40));
        personArray.add(new Person("Сидоров Михаил Петрович", "инженер", "sidorov@mail.ru", "89381682950", 35000, 35));
        personArray.add(new Person("Носов Олег Сергеевич", "менеджер", "nosov@mail.ru", "89281032680", 22000, 36));
        personArray.add(new Person("Шарунов Василий Сергеевич", "водитель", "sharunov@mail.ru", "89205698015", 23000, 43));

        for (Person person : personArray) {
            if (person.age > 40) {
                person.printPerson();
            }
        }
    }
}
