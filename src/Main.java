public class Main {

    public static void main(String[] args) {

        TrafficLightSimulator simulator =
                new TrafficLightSimulator(TrafficLightColor.RED);

        // Limit number of executions
        for (int i = 0; i < 10; i++) {
            System.out.println(simulator);
            simulator.changeColor();

            try {
                Thread.sleep(1000); // 1 second delay (optional)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
