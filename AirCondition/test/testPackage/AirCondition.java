package testPackage;

public class AirCondition {
    private boolean isStatus;
    private int temperature;

    public AirCondition(){
        this.temperature = 16;
    }

    public void onAirCondition(){
        isStatus = true;
    }

    public void offAirCondition(){
        isStatus = false;
    }

    public Boolean checkStatus() {
        return isStatus;
    }

    public void increaseTemperature(int value){
        if (temperature + value > 30) {
            temperature = 30;
        }
        else  {
            temperature = temperature + value;
        }
    }

    public void decreaseTemperature(int value) {
        if (temperature - value < 16) {
            temperature = 16;
        } else temperature = temperature - value;
    }

    public int checkTemperature() {
        return temperature;
    }
}
