public class Truck extends Car{
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public String getModelName(String modelName) {
        return modelName;
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}