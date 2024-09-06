package car;

public class CarApplication {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "2020", 5000000);
        Car car2 = new Car("Honda", "2018", 2800000);

        System.out.println("Car 1 price: #" + car1.getPrice());
        System.out.println("Car 2 price: #" + car2.getPrice());

        car1.applyDiscount(5);
        car2.applyDiscount(7);

        System.out.println("Car 1 price after 5% discount: #" + car1.getPrice());
        System.out.println("Car 2 price after 7% discount: #" + car2.getPrice());
    }

}
