public class Device {
    int id;
    int priority; // Higher value = higher priority
    int feedbackInterval; // how often it sends feedback

    public Device(int id, int priority, int feedbackInterval) {
        this.id = id;
        this.priority = priority;
        this.feedbackInterval = feedbackInterval;
    }

    public void sendFeedback() {
        System.out.println("Device " + id + " sending feedback...");
    }
}