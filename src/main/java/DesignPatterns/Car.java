package DesignPatterns;


//Builder Design pattern
public class Car {
    private String engine;
    private Integer wheels;
    private String color;

    private Car(){
    }
    private Car(CarBuilder  builder){
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.color = builder.color;
    }

    public static class CarBuilder{
        private String engine;
        private Integer wheels;
        private String color;

        public CarBuilder setEngine(String engine){
            this.engine = engine;
            return this;
        }

        public CarBuilder setWheels(Integer wheels){
            this.wheels = wheels;
            return this;
        }

        public CarBuilder setColor (String color){
            this.color = color;
            return this;
        }

        public Car build(){
            return new Car(this);
        }

    }

    @Override
    public String toString(){
        return "My Car is " + this.color +" in color, it has a " +this.engine + " engine and has "+ this.wheels +" wheels.";
    }
}
