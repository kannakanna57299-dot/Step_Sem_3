package week3.assignment_probels;

public class traafficsignal {
    void simulateTrafficSignal(int cycles) {
        for(int i=0;i<cycles;i++) {
            switch(i%3) {
                case 0:
                    System.out.println("Red-Stop");
                    break;
                case 1:
                    System.out.println("Yellow-Ready to go");
                    break;
                case 2:
                    System.out.println("Green-go");
                    break;
            }
        }
    }
    public void main(String[] args) {
        int cycles=6;
        simulateTrafficSignal(cycles);
    }
}
