public class Car extends Transport implements InfoCheck {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void getCheckInfo() {
        System.out.println("Проверяем двигатель");
    }
}
