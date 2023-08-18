package ru.geekbrains.lesson7.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.Object.*;

public class Company {
//    Company company;
    private List <Vacancy> vacancies = new ArrayList<>();

    private static Random random = new Random();
    private String nameCompany;
    private  double maxSalary;

    private Publisher jobAgency;

    public Company(String nameCompany, Vacancy vacancy, Publisher jobAgency) {
        this.nameCompany = nameCompany;
        vacancies.add(vacancy);
        this.jobAgency = jobAgency;
//        this.company = new Company(nameCompany,vacancy,jobAgency);
    }
    public Company(String nameCompany, List<Vacancy> vacancies, Publisher jobAgency) {
        this.nameCompany = nameCompany;
        this.vacancies.addAll(vacancies);
        this.jobAgency = jobAgency;
//        this.company = new Company(nameCompany,vacancy,jobAgency);
    }
    public Company(String nameCompany, Publisher jobAgency) {
        this.nameCompany = nameCompany;
        this.jobAgency = jobAgency;
    }

    public void needEmployee() throws InstantiationException, IllegalAccessException {
            jobAgency.sendOffer(new Company(nameCompany,vacancies,jobAgency));//Очень криво написал.
//        jobAgency.sendOffer(nameCompany, salary);
    }

    public void setVacancies(List<Vacancy> vacancies) {
        this.vacancies = vacancies;
    }

    public void setVacancies(Vacancy vacancies) {
        this.vacancies.add(vacancies);
    }

    public List<Vacancy> getVacancies() {
        return vacancies;
    }

    public String getNameCompany() {
        return nameCompany;
    }
}
