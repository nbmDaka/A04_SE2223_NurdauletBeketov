package Factory;

public class IrrigationSystemFactory implements FarmingEquipmentFactory {
    @Override
    public FarmingEquipment createEquipment() {
        return new IrrigationSystem();
    }
}
