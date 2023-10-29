import Factory.FarmingEquipment;
import Factory.FarmingEquipmentFactory;
import Factory.IrrigationSystemFactory;
import Observer.CentralMonitoringUnit;
import Observer.SoilMoistureSensor;

public class Main {
    public static void main(String[] args) {
        CentralMonitoringUnit centralUnit = new CentralMonitoringUnit("soil moisture");
        centralUnit.attach(new SoilMoistureSensor());

        centralUnit.collectData();

        FarmingEquipmentFactory equipmentFactory = new IrrigationSystemFactory();
        FarmingEquipment equipment = equipmentFactory.createEquipment();
        equipment.operate();
    }
}