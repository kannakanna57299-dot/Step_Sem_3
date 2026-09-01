package week2.class_problems;

public class maskphonenumber {

    public static String maskPhoneNumber(String phone) {

        // Check length
        if (phone.length() != 10) {
            return "Invalid phone number";
        }

        // Check all characters are digits
        for (int i = 0; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) {
                return "Invalid phone number";
            }
        }

        // Get last 4 digits
        String lastFour = phone.substring(6);

        // Create mask using StringBuilder
        StringBuilder result = new StringBuilder("XXXXXX");

        // Insert '-' between mask and last 4 digits
        result.insert(6, "-");

        result.append(lastFour);

        return result.toString();
    }

    public static void main(String[] args) {

        String phone = "9876543210";

        System.out.println(maskPhoneNumber(phone));
    }
}