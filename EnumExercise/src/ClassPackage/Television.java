package ClassPackage;

public class Television {
    private boolean isOn;

    public void toggle() {
        isOn = !isOn;
    }
    public boolean isOn() {
        return isOn;
    }
}
