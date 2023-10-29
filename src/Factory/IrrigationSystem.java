package Factory;

public class IrrigationSystem implements FarmingEquipment{
    @Override
    public void operate() {
        System.out.println("Irrigation system is now operating.");
    }
}
