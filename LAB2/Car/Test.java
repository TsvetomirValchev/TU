import java.util.ArrayList;


public class Test {



    public static void main(String[] args) {
        Car[] cars = new Car[5];
        cars[0] = new Car("VW", "GOLF", "Green", 90, 1.9, "manual", 1998);
        cars[1] = new Car("BMW", "330xd", "black", 184, 3.0, "manual", 2000);
        cars[2] = new Car("Mercedes", "C220", "grey", 150, 2.2, "automatic", 2002);
        cars[3] = new Car("Mercedes", "C220", "grey", 150, 2.2, "automatic", 2002);
        cars[4] = new Car("Mercedes", "C220", "grey", 150, 2.2, "automatic", 2002);

//        for (Car c : cars) {
//            c.printDataForCar();
//        }
//        System.out.println("\n\n\n");
//        System.out.println("------------------------------");



        //ex 1
        ArrayList<Car> filteredCars = new ArrayList<Car>();
        filteredCars = FilterByChar.generateNewCarArr(cars, 'M');
        for(Car c : filteredCars) {
            c.printDataForCar();
        }
        System.out.println("\n\n\n");
        System.out.println("------------------------------");

        //ex2
        Car[] sortedCars = new Car[cars.length];
        sortedCars = SortCars.sortByMake(cars, 'a');
        for(Car c : sortedCars) {
            System.out.println(c.getMake());
        }
        System.out.println("\n\n\n");
        System.out.println("------------------------------");
        //ex3
        ArrayList<Car> noTwinsCars = new ArrayList<Car>();
        noTwinsCars = DeleteAllTwinsCar.clearTwins(cars);
        for(Car c : noTwinsCars) {
            System.out.println(c.getMake());
        }
    }


}