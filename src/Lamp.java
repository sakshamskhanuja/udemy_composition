public class Lamp {

    // Instance Fields.
    private String style;
    private boolean battery;
    private int globRating;

    // Parameterized Constructor.
    public Lamp(String style, boolean battery, int globalRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn() {
        System.out.println("Lamp -> Turning on");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }
}
