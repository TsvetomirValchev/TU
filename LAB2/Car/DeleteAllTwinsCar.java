import java.util.ArrayList;

public class DeleteAllTwinsCar {
    public static ArrayList<Car> clearTwins(Car[] cars) {
        ArrayList<Car> noTwinsArr = new ArrayList<Car>();

        boolean flagAdd;


        for (Car currentCar : cars) {
            flagAdd = true;
            //  currentCar.copyData(currentCar);
            for(int j=0; j < noTwinsArr.size(); j++) {
                if(currentCar.compareCars(noTwinsArr.get(j)) == 1) {
                    flagAdd = false;
                    break;
                }
            }
            if(flagAdd)
                noTwinsArr.add(currentCar);
        }
        return (noTwinsArr);
    }
}