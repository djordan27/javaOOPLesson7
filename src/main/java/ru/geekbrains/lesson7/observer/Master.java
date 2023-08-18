package ru.geekbrains.lesson7.observer;

import java.util.Random;

public class Master implements Observer {
    private String jobName = "Мастер";

    private static Random random = new Random();

    private String name;

    private double minSalary;

    public Master(String name) {
        this.name = name;
        minSalary = random.nextDouble(80000, 100000);
    }

    public void receiveOffer(Company company) {
        for (int i = 0; i < company.getVacancies().size(); i++) {
            if (minSalary <= company.getVacancies().get(i).getMaxSalary() &&
                    jobName.equals(company.getVacancies().get(i).getNameOfVacancy())) {
                System.out.printf("Мастер %s (%f) >>> Мне нужна эта работа! (%s - %f)\n",
                        name, minSalary, company.getNameCompany(), company.getVacancies().get(i).getMaxSalary());
                minSalary = company.getVacancies().get(i).getMaxSalary();
            } else if (!jobName.equals(company.getVacancies().get(i).getNameOfVacancy())) {
                System.out.printf("Мастер %s (%f) >>> Я ищу другую вакансию! (%s - %s). Название кампании %s\n",
                        name, minSalary, jobName, company.getVacancies().get(i).getNameOfVacancy(),company.getNameCompany());
            } else if (!jobName.equals(company.getVacancies().get(i).getNameOfVacancy())) {
                System.out.printf("Мастер %s (%f) >>> Я найду работу получше! (%s - %f). Название кампании %s\n",
                        name, minSalary, company.getNameCompany(), company.getVacancies().get(i).getMaxSalary(),company.getNameCompany());
            }
        }
    }
}
