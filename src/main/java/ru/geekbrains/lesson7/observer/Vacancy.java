package ru.geekbrains.lesson7.observer;

import java.util.Random;

public class Vacancy {
    private  double maxSalary;
    private static Random random = new Random();
    private String nameOfVacancy;
    String nameOf[] = {"Директор", "Мастер","Студент"};

    public Vacancy() {
        maxSalary = random.nextInt(10000, 1000000);
        nameOfVacancy = nameOf[random.nextInt(0,3)];
    }

    public Vacancy(double maxSalary, String nameOfVacancy) {
        this.maxSalary = maxSalary;
        this.nameOfVacancy = nameOfVacancy;
    }

    public String getNameOfVacancy() {
        return nameOfVacancy;
    }

    public void setNameOfVacancy(String nameOfVacancy) {
        this.nameOfVacancy = nameOfVacancy;
    }

    public double getMaxSalary() {
        return maxSalary;
    }
}
