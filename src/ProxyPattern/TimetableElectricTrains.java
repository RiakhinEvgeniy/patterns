package ProxyPattern;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TimetableElectricTrains implements TimetableTrains {

    @Override
    public String[] getTimetable() {
        List<String> listTrains = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(new FileReader(new File("C:\\Users\\User\\Desktop\\testTrains.txt")));

            while (scanner.hasNextLine()) {
                String str = scanner.nextLine();
                listTrains.add(str);
            }
        } catch (Exception e) {
            System.out.println("Error " + e);
        }

        return listTrains.toArray(new String[listTrains.size()]);
    }

    /*@Override
    public String getTrainDepartureTime(String trainID) {
        String[] timeTable = getTimetable();

        for (int i = 0; i < timeTable.length; i++) {
            if (timeTable[i].startsWith("trainID")) return timeTable[i];
        }
        return "";
    }*/
}
