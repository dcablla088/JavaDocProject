/**
 * Representa un coche con marca, modelo, año y precio.
 */
public class Car {
    /** Marca del coche (ej: Toyota,Audi ) */
    private String make;
    
    /** Modelo del coche (ej: Corolla,A5) */
    private String model;
    
    /** Año de fabricación (ej:2025) */
    private int year;
    
    /** Precio del coche (ej:5000) */
    private double price;

    /**
     * Crea un nuevo coche.
     * 
     * @param make   El nombre completo de la marca 
     * @param model  El nombre completo del modelo
     * @param year   El año preciso en el que salio
     * @param price  El precio aproximado que tiene
     */
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    /** @return la marca del coche
     * ej (toyota)
     */
    public String getMake() {
        return make;
    }

    /**
     * 
     *  @param make nueva marca que tiene el coche
     * 
     */
    public void setMake(String make) {
        this.make = make;
    }

    /** @return el modelo
     * ej (Corolla)
     */
    public String getModel() {
        return model;
    }

    /** @param model nuevo modelo que tiene el coche */
    public void setModel(String model) {
        this.model = model;
    }

    /** @return el año
     * 2025
     */
    public int getYear() {
        return year;
    }

    /** @param year nuevo año que tiene el coche */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * 
     * @return Precio
     * Ej (25000)
     */
    public double getPrice() {
        return price;
    }

    /** @param price nuevo precio que tiene el coche */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return descripción completa del coche
     * Year = año del coche
     * Make = marca del coche
     * model = modelo del coche
     */
    public String carDescription() {
        return "The car is a " + year + " " + make + " " + model + " priced at $" + price;
    }

    /** @return descripción del coche
     * Breve descripcion del coche
     * Override es para cambiar el funcionamiento
     */
    @Override
    public String toString() {
        return carDescription();
    }

    /**
     * Ejemplo de uso.
     * 
     * @param args no usado
     */
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2025, 26800);
        System.out.println(car);
    }
}