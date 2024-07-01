public abstract class Vehicle {
    String  licensePlate;
    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
    }
    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    abstract double calculateRentalCost(int days);
}
interface Maintainable{
    public void performMaintenance();
}
class Car extends Vehicle implements Maintainable {
      double dailyRate;

        public Car(String licensePlate, double dailyRate) {
            super(licensePlate);
            this.dailyRate = dailyRate;
        }

        @Override
        public double calculateRentalCost(int days) {
            return dailyRate * days;
        }

        @Override
        public void performMaintenance() {
            System.out.println("Performing maintenance on car");
        }
    }
class Truck extends Vehicle implements Maintainable {
    double dailyRate;
    double weight;

    public Truck(String licensePlate, double dailyRate, double weight) {
        super(licensePlate);
        this.dailyRate = dailyRate;
        this.weight = weight;
    }

    @Override
    public double calculateRentalCost(int days) {
        return (dailyRate * days) + (weight * 0.1 * days);
    }

    @Override
    public void performMaintenance() {
        System.out.println("Performing maintenance on truck");
    }
}
class Motorcycle extends Vehicle implements Maintainable {
    double dailyRate;

    public Motorcycle(String licensePlate, double dailyRate) {
        super(licensePlate);
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateRentalCost(int days) {
        return dailyRate * days;
    }

    @Override
    public void performMaintenance() {
        System.out.println("Performing maintenance on motorcycle");
    }
}
class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle car = new Car("MPF726", 730.0);
        Vehicle truck = new Truck("J1H2HS", 830.0, 2900);
        Vehicle motorcycle = new Motorcycle("E68SJ7", 282.0);

        Vehicle[] vehicles = {car, truck, motorcycle};

        int rentalDays = 5;
        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle: " + vehicle.getClass().getSimpleName());
            System.out.println("License Plate: " + vehicle.getLicensePlate());
            System.out.println("Rental Cost for " + rentalDays + " days: $" + vehicle.calculateRentalCost(rentalDays));
            if (vehicle instanceof Maintainable) {
                ((Maintainable) vehicle).performMaintenance();
            }
            System.out.println();
        }
    }
}