package ProxyPattern;

public class DisplayTimetable {
    private TimetableTrains timetableTrains = new TimetableElectricTrainsProxy();

    public void printTable() {
        String[] timeTable = timetableTrains.getTimetable();
        String[] tmpArray;
        System.out.println("train\twhere from\twhere\ttime departure\ttime arrive\ttime in way");
        System.out.println("-------------------------------------------------------------------");
        for (int i = 0; i < timeTable.length; i++) {
            tmpArray = timeTable[i].split(";");
            System.out.printf("%s;\t%s\t%s\t\t%s\t\t\t%s\t\t%s\n",
                                        tmpArray[0], tmpArray[1], tmpArray[2], tmpArray[3], tmpArray[4],
                                        tmpArray[5]);
        }
    }
}
