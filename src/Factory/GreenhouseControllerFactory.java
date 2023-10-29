package Factory;

public class GreenhouseControllerFactory implements FarmingEquipmentFactory {
    @Override
    public FarmingEquipment createEquipment() {
        return new GreenhouseController();
    }
}
