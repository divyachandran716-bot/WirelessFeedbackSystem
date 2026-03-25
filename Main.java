import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Create Devices
        List<Device> devices = new ArrayList<>();
        devices.add(new Device(1, 5, 2));
        devices.add(new Device(2, 3, 3));
        devices.add(new Device(3, 8, 1));
        devices.add(new Device(4, 2, 4));

        // Create Channels
        List< Channel> channels = new ArrayList<>();
        channels.add(new Channel(1));
        channels.add(new Channel(2));

        // Run Scheduler
        Scheduler.allocateChannels(devices, channels);
    }
}