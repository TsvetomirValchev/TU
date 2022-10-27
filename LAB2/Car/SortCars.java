public class SortCars {
    //Създайте втори метод, който по подаден параметър масив от коли, връща отново масив от коли,
    // но сортиран по възходящ или по низходящ ред, в зависимост от марката на колата.
    // Нека редът да се определя от параметър на метода.
    public  static Car[] sortByMake(Car[] cars, char ch) {
        Car sortedCars[] = cars.clone();

        for (int i = 0; i < sortedCars.length - 1; i++) {
            char minChar = sortedCars[i].getMake().charAt(0);
            int minIndex = i;
            for (int j = i + 1; j < sortedCars.length; j++)
                if (minChar > sortedCars[j].getMake().charAt(0)) {
                    minChar = sortedCars[j].getMake().charAt(0);
                    minIndex = j;
                }

            Car temp = new Car();
            temp.copyData(sortedCars[i]);
            sortedCars[i].copyData(sortedCars[minIndex]);
            sortedCars[minIndex].copyData(temp);
        }
        return sortedCars;
    }
}