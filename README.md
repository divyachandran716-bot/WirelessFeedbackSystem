# Efficient Allocation of Periodic Feedback Channels in Broadband Wireless Networks

## 📌 Overview

This project implements a simulation system to optimize the allocation of periodic feedback channels in broadband wireless networks. The system focuses on improving bandwidth utilization, reducing communication delay, and enhancing overall network performance through priority-based scheduling.

---

## 🚀 Features

• Priority-based allocation of feedback channels
• Efficient handling of limited communication resources
• Simulation of real-world wireless network behavior
• Optimized scheduling to reduce latency
• Modular and scalable Java implementation

---

## 🛠️ Tech Stack

• Java
• Object-Oriented Programming (OOP)
• Basic Scheduling Algorithms
• MySQL (conceptual integration)

---

## 🧠 How It Works

The system simulates multiple devices requesting feedback channels. Since the number of available channels is limited, the scheduler allocates channels based on device priority.

• Devices with higher priority are served first
• Channels are allocated dynamically
• If no channels are available, requests are deferred
• Ensures efficient bandwidth usage and reduced delay

---

## 📂 Project Structure

WirelessFeedbackSystem/
├── Main.java
├── Device.java
├── Channel.java
├── Scheduler.java

---

## ▶️ How to Run

1. Clone the repository:

```
git clone https://github.com/divyachandran716-bot/WirelessFeedbackSystem.git
```

2. Navigate to the project folder:

```
cd WirelessFeedbackSystem
```

3. Compile the program:

```
javac *.java
```

4. Run the program:

```
java Main
```

---

## 📊 Sample Output

```
Channel 1 allocated to Device 3
Device 3 sending feedback...
Channel 2 allocated to Device 1
Device 1 sending feedback...
No available channel for Device 2
No available channel for Device 4
```

---

## 🎯 Key Concepts

• Bandwidth Utilization
• Latency Reduction
• Resource Allocation
• Scheduling Algorithms
• Wireless Network Optimization

---

## 📈 Future Enhancements

• Integration with real MySQL database
• Advanced scheduling (Round Robin, Dynamic Allocation)
• Web-based UI using React
• Visualization of network performance metrics

---

## 👩‍💻 Author

**Divya Chandran**
GitHub: https://github.com/divyachandran716-bot

---

## ⭐ Acknowledgment

This project was developed as part of academic and self-learning efforts to understand wireless communication optimization and system design.
