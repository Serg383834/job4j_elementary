package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {

        Student student = new Student();
        student.setName("Гусев Сергей Александрович");
        student.setGroup("Прог-С-18");
        student.setAdmissionDate("01.08.2019");
        System.out.println(student.getName() + ", группа:  " + student.getGroup() + ", дата поступления: " + student.getAdmissionDate());
    }
}
