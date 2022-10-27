import java.util.ArrayList;

public class FilterByChar {
    //Създайте метод, който по подаден масив от коли и параметър буква(char),
// “прочиства” масива от коли и връща нов масив от коли, на които марките им започват с подадената като параметър буква.
    public static ArrayList<Car> generateNewCarArr(Car[] cars, char ch) {
        ArrayList<Car> filteredCars = new ArrayList<Car>();
        for (Car currentCar : cars) {
            if (currentCar.getMake().charAt(0) == ch) {
                filteredCars.add(currentCar);
            }
        }
        return (filteredCars);
    }
}