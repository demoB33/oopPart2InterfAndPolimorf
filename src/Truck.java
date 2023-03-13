public class Truck extends Car{
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void getCheckInfo() {
        System.out.println("Проверяем двигатель");
        System.out.println("Проверяем прицеп");
    }

}
