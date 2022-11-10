import java.security.Key;

public class Car {

    final String  brand;
    final String model;
    float engineVolume;
    String color;
    final   Integer year;
    String country;

    String transmission;
   final String bodyType;
    String regNumber;

    boolean tires;

    public static class Key{
       private final boolean remoteEngineSet;
       private final boolean infinityAccess;

        public  Key(boolean infinityAccess, boolean remoteEngineSet) {
            this.infinityAccess=infinityAccess;
            this.remoteEngineSet=remoteEngineSet;
        }

        @Override
        public String toString() {
            return
                    " удаленный запуск двигателя=" + remoteEngineSet +
                    ", бесконечный доступ=" + infinityAccess +
                    '}';
        }
    }

    public Car.Key keyParam;

    public class Insurance {

        final private int finalYear;
        final private String insuranceNumber;
        private float price;


    public Insurance(int finalYear, String insuranceNumber, float price) {
        if (finalYear < java.time.LocalDate.now().getYear()) {
            System.out.println("Страховка просрочена");
        }
            this.finalYear = finalYear;

        if (insuranceNumber.length()!=9){
            System.out.println("\"Введено неверное число знаков");
        }
            this.insuranceNumber = insuranceNumber;

        this.price = price;
    }
        @Override
        public String toString() {
            return "Данные автострахового полиса: {" +
                    "год истечения=" + finalYear +
                    ", номер='" + insuranceNumber + '\'' +
                    ", стоимость=" + price +
                    "рублей }";
        }
}

private Insurance insuranceContract;



    public Car(String brand, String model, float engineVolume, String color, Integer year, String country,String transmission,
               String bodyType, String regNumber, boolean tires, Car.Key keyParam){

        if (model == null || model == "") {
            this.model = "default";
        } else {
            this.model = model;
        }
        this.brand = brand;
        if (engineVolume <= 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
        if (year == null || year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }

        if (color == null || color == "") {
            this.color = "Белый";
        } else {
            this.color = color;
        }
        this.country = country;

        if (transmission == "" || transmission == null) {
            this.transmission = "Автомат";
        } else {
            this.transmission = transmission;
        }

        if (bodyType == "" || bodyType == null) {
            this.bodyType = "Седан";
        } else {
            this.bodyType = bodyType;
        }

        this.regNumber=regNumber;
        this.keyParam=keyParam;



    }



    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public Integer getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegNumber() {
        return regNumber;
    }


    public boolean isTires() {
        return tires;
    }


    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public void setTires(boolean tires) {
        this.tires = tires;
    }

    public Key getKeyParam() {
        return keyParam;
    }

    public boolean changeTires(){
        this.tires = !this.tires;
        return tires;
    }

    public void  verifyRegNumber(){
        String s1 = regNumber.substring(1, 4);
        String s2= regNumber.substring(6,9);
        if (regNumber.length()!=9 && s1!="000" &&  s2!="000"){
            System.out.println(("Номер задан неверно"));
        } else {
            System.out.println(("Номер верный"));
        }

    }




    @Override
    public String toString() {
        return "Машина{" +
                "марка='" + brand + '\'' +
                ", модель='" + model + '\'' +
                ", объем двигателя=" + engineVolume +
                ", цвет='" + color + '\'' +
                ", год производства=" + year +
                ", страна-производитель='" + country + '\'' +
                ", коробка передач='" + transmission + '\'' +
                ", кузов='" + bodyType + '\'' +
                ", регистрационный номерер='" + regNumber + '\'' +
                ", тип резины=" + tires +
                ", ключ=" + keyParam.toString() +
                ", условия страховки: "+
                '}';
    }

    public void setInsuranceContract(Insurance insuranceContract) {
        this.insuranceContract = insuranceContract;
    }

    public Insurance getInsuranceContract() {
        return insuranceContract;
    }
}




