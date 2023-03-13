public class ServiceStation{
    public void checkAuto(Transport bicycle) {
        System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                bicycle.updateTyre();
            }
        }
        public void check(Bicycle bicycle){
        checkAuto(bicycle);
    }
    public void check(Car car){
         checkAuto(car);
        car.getCheckInfo();

    }
    public void check(Truck truck){
        checkAuto(truck);
        truck.getCheckInfo();
    }
}

