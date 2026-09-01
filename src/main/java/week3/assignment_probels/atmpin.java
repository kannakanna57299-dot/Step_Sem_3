package week3.assignment_probels;

public class atmpin {
    void atmPinRetry(String correctPin, String[] attempts) {
        boolean success=false;
        int attempt=0;
        while (attempt < attempts.length && !success) {
            if(attempts[attempt].equals(correctPin)) {
                success=true;
                System.out.println("Pin accepted");
                break;
            }
            attempt++;
        }
        if (!success) {
            System.out.println("Card blocked — too many incorrect attempts");
        }
    }
    public void main(String[] args) {

        String correctPin = "4821";
        String[] attempts = {"1111", "4821"};

        atmPinRetry(correctPin, attempts);
    }
}
