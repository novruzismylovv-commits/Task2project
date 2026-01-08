public class TrafficLightSimulator {

    private TrafficLightColor currentColor;

    // Constructor
    public TrafficLightSimulator(TrafficLightColor startColor) {
        this.currentColor = startColor;
    }

    // Method to change light color using switch
    public void changeColor() {
        switch (currentColor) {
            case RED:
                currentColor = TrafficLightColor.GREEN;
                break;
            case GREEN:
                currentColor = TrafficLightColor.YELLOW;
                break;
            case YELLOW:
                currentColor = TrafficLightColor.RED;
                break;
        }
    }

    @Override
    public String toString() {
        return "Current traffic light color: " + currentColor;
    }
}
