public class Main {

    public static void main(String[] args) {
        Factory factory = new Factory();

        Car car = new Car("red", "VW", 5);
        Car car1 = new Car("blue", "Audi", 3);
        Car car2 = new Car("red", "Audi", 3);

        factory.buildCar(car);
        factory.buildCar(car1);
        factory.buildCar(car2);
    }
}
//Addendum just because
//und Car car2 und factory car2
//merge-Conflict
/*
<<<<<<< HEAD
        Car car2 = new Car("blue", "Audi", 5);
=======
        Car car2 = new Car("red", "VW", 3);

>>>>>>> merge_conflict
*/