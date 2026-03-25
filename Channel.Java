public class Channel {
    int id;
    boolean isBusy;

    public Channel(int id) {
        this.id = id;
        this.isBusy = false;
    }

    public void allocate(Device device) {
        isBusy = true;
        System.out.println("Channel " + id + " allocated to Device " + device.id);
        device.sendFeedback();
    }

    public void release() {
        isBusy = false;
    }
}