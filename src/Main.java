public class Main {

    public static void carsCout(Car[] cars) {

        for (byte i = 0; i < cars.length; i++) {
            System.out.println(cars[i].toString());
        }
    }

    public static void main(String[] args) {

        Car.Key Auto=new Car.Key(true,true);//тут создаем объект для статик класса, который общий для все машин
        Car.Key Manual=new Car.Key(false,false);



        Car[] cars = new Car[5];
        cars[0] = new Car("Lada", "Granta",
                1.2f, "черный", 2020, "Россия",
                "Автомат","Хэчбек",
                "E000мм000",true, Auto);
        cars[1] = new Car("Audi", "A8 50 L TDI quattro", 3.0f, "черный",
                2020,
                "Германия","Автомат","Хэчбек",
                "F6DE",true, Auto);
        cars[2] = new Car("BMW", "Z8", 3.0f, "черный",
                2021,"Германия",
                "Автомат","Хэчбек","FE565фУУ",false,Manual);
        cars[3] = new Car("Kia", "Sportage", 2.4f, "красный",
                2018,
                "Корея","","","FE565фУУff",false, Auto);
        cars[4] = new Car("Хендай", "Avante", 1.6f,
                "Синий", 2018,"Корея",
                "Полу-Автомат","Хэчбек","65фУУffff", true,Manual);

        carsCout(cars);

        cars[0].changeTires();
        System.out.println(cars[0].toString());
        System.out.println(cars[0].getRegNumber());
        cars[0].verifyRegNumber();

        Car.Insurance contract0=cars[0]. new Insurance(2025,"909FF4568",2000f);//вызываем таким образом, т.к это - вложенный нестатичный класс. относящийся только к определенному
        //объекту
        Car.Insurance contract1= cars[1]. new Insurance(1999,"909FF5678",5000f);

        cars[0].setInsuranceContract(contract0);
        cars[1].setInsuranceContract(contract1);

        System.out.println(cars[0].toString()+" "+cars[0].getInsuranceContract());
        System.out.println(cars[1].toString()+" "+cars[1].getInsuranceContract());


    }
}