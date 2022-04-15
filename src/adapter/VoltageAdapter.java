package adapter;

public class VoltageAdapter extends Voltage220V implements IVoltage110V {

    @Override
    public int output110V() {
        int originVoltage = output220V();
        int targetVoltage = originVoltage / 2;
        return targetVoltage;
    }
}
