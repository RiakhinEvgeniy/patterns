package ProxyPattern;

public class TimetableElectricTrainsProxy implements TimetableTrains {
    private TimetableElectricTrains timetableElectricTrains = new TimetableElectricTrains();

    private String[] timeTable = null;

    @Override
    public String[] getTimetable() {
        if (timeTable == null) {
            timeTable = timetableElectricTrains.getTimetable();
        }
        return timeTable;
    }

    public void clearCash() {
        timeTable = null;
    }
}
