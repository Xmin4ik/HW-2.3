public class Car {
    private String modelName;
    private int wheelsCount;
    @Override
    public String toString() {
        return   "модель'" + modelName + '\'' +
                ", кол-во колес=" + wheelsCount ;
    }
    public String getModelName(String modelName) {
        return modelName;
    }

    public Car(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    public int getWheelsCount() {
        return wheelsCount;
    }
    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

}
