package W5Workshop;

public class bus {
	static abstract class Vehicle {
        abstract void wheel();
        void door() {
            System.out.println("Vehicle Door");
        }
    }
    static class Bus extends Vehicle {
        @Override
        void wheel() {
            System.out.println("Bus has wheels");
        }
    }
    public static void main(String[] args) {
        Bus myBus = new Bus();
        myBus.wheel();
        myBus.door();
    }
}
