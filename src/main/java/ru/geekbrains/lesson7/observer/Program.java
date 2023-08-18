package ru.geekbrains.lesson7.observer;

public class Program {


    /**
     * TODO: 1.Доработать приложение, поработать с шаблоном проектирования Observer
     *   добавить новый тип соискателя.
     *   **.2 Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *   **.3 Предусмотреть тип вакансии (enum)
     * @param args
     */
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        JobAgency jobAgency = new JobAgency();

        Student student1 = new Student("A");
        Object student2 = new Student("B");
        Observer student3 = new Student("C");


        Company geekBrains = new Company("GeekBrains", jobAgency);
        geekBrains.setVacancies(new Vacancy());
        geekBrains.setVacancies(new Vacancy());
        geekBrains.setVacancies(new Vacancy());
        geekBrains.setVacancies(new Vacancy());

        Company google = new Company("Google", jobAgency);
        google.setVacancies(new Vacancy());
        google.setVacancies(new Vacancy());
        google.setVacancies(new Vacancy());
        google.setVacancies(new Vacancy());
        google.setVacancies(new Vacancy());

        Company yandex = new Company("Yandex", jobAgency);
        yandex.setVacancies(new Vacancy());
        yandex.setVacancies(new Vacancy());
        yandex.setVacancies(new Vacancy());
        yandex.setVacancies(new Vacancy());
        yandex.setVacancies(new Vacancy());



        Master ivanov = new Master("Ivanov");
        Master petrov = new Master("Petrov");
        Student sidorov = new Student("Sidorov");

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(sidorov);

        for (int i = 0; i < 5; i++){
            geekBrains.needEmployee();
            google.needEmployee();
            yandex.needEmployee();
        }

    }

}
