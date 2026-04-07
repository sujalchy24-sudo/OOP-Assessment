package W5Workshop;

public class Animals {
	interface LivingBeing {
        void specialFeature();
    }
    static class Fish implements LivingBeing {
        @Override
        public void specialFeature() {
            System.out.println("Fish can breathe underwater using gills."); // [cite: 20, 22, 23]
        }
    }
    static class Bird implements LivingBeing {
        @Override
        public void specialFeature() {
            System.out.println("Birds can fly using their wings."); // [cite: 20, 22, 23]
        }
    }
    public static void main(String[] args) {
        LivingBeing myFish = new Fish();
        LivingBeing myBird = new Bird();
        
        myFish.specialFeature();
        myBird.specialFeature();
    }

}
