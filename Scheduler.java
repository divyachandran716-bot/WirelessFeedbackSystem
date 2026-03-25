import java.util.*;

public class Scheduler {

    public static void allocateChannels(List<Device> devices, List<Channel> channels) {

        // Sort devices based on priority (high → low)
        devices.sort((d1, d2) -> d2.priority - d1.priority);

        int channelIndex = 0;

        for (Device device : devices) {
            if (channelIndex < channels.size()) {
                Channel channel = channels.get(channelIndex);

                if (!channel.isBusy) {
                    channel.allocate(device);
                    channel.release();
                    channelIndex++;
                }
            } else {
                System.out.println("No available channel for Device " + device.id);
            }
        }
    }
}