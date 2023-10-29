package Factory;

public class GreenhouseController implements FarmingEquipment {
    @Override
    public void operate() {
        System.out.println("Greenhouse controller is now operational.");
    }
}
