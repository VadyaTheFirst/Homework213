public class Car {

    String brand;
    String model;
    float engineVolume;
    String color;
    Integer year;
    String country;

    public Car(String brand, String model, float engineVolume, String color, Integer year, String country) {
        if (model==null || model==""){
            this.model="default";
        } else  {
            this.model = model;
        }
        this.brand = brand;
        if (engineVolume<=0){
            this.engineVolume=1.5f;
        } else {
        this.engineVolume = engineVolume;
        }
        if (year==null || year<=0 ){
            this.year=2000;
        } else {
            this.year = year;
        }

        if (color==null || color==""){
            this.color="Белый";
        } else {
            this.color = color;
        }
        this.country=country;

    }

    @Override
    public String toString() {
        return this.brand+ " " + this.model + " " + " "+this.color+" цвета объемом "+this.engineVolume+" л."+
                " произведена в "+this.year+" году в "+this.country.toString();
    }


}
