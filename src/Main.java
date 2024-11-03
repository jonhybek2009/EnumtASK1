//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double distanceinKm= 50;
        double carCost = calculateTravelCost(TransportType.CAR, distanceinKm);
        double busCost = calculateTravelCost(TransportType.BUS, distanceinKm);
        double truckCost = calculateTravelCost(TransportType.TRUCK, distanceinKm);

        System.out.println("CAR цена за 1 км пройденнгого пути: " + carCost);
        System.out.println("BUS цена за 1 км пройденнгого пути: " + busCost);
        System.out.println("TRUCK цена за 1 км пройденнгого пути: "+ truckCost);
    }

    public static double calculateTravelCost(TransportType type, double distanceinKm) {
        return distanceinKm * type.getOneKmPrice();
    }
}