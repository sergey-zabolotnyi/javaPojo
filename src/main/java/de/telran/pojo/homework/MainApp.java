package de.telran.pojo.homework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Student student1 = (Student) context.getBean("student");
        Student student2 = (Student) context.getBean("student");

        // Настройка характеристик первого студента
        student1.setName("Andrej");
        student1.setAge(25);

        // Вывод характеристик второго студента
        student2.displayInfo(); // Выводит характеристики первого студента из-за singleton
                                // Не выводит при prototype (Name: null, Age: 0)

    }
}