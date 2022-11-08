public class Main {

    public static void carsCout(Car[] Cars) {

        for (byte i = 0; i < Cars.length; i++) {
            System.out.println(Cars[i].toString());
        }
    }

    public static void main(String[] args) {
        Car[] Cars = new Car[5];
        Cars[0] = new Car("Lada", "Granta", 1.7f,"желтый", 2015, "Россия");
        Cars[1] = new Car("Audi", "A8 50 L TDI quattro", 3.0f, "черный", 2020,"Германия");
        Cars[2] = new Car("BMW", "Z8", 3.0f, "черный", 2021,"Германия");
        Cars[3] = new Car("Kia", "Sportage", 2.4f, "красный", 2018,"Корея");
        Cars[4] = new Car("Хендай", "Avante", 1.6f, "Синий", 2018,"Корея");

        carsCout(Cars);
    }
}