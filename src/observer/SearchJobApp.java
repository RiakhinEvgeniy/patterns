package observer;

public class SearchJobApp {
    public static void main(String[] args) {
        Observer sacha = new Subscriber("Sacha");
        Observer evgeniy = new Subscriber("Evgeniy");

        JobWebSite jobWebSite = new JobWebSite();

        jobWebSite.addVacancy("First vacancy");
        jobWebSite.addVacancy("Second vacancy");

        jobWebSite.addObserver(sacha);
        jobWebSite.addObserver(evgeniy);

        jobWebSite.addVacancy("Third vacancy");
        jobWebSite.removeVacancy("Third vacancy");
    }
}
