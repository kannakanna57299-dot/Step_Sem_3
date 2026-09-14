package week6.class_problems;
class PlacementRecord {
    String studentName;
    String company;
    double packageLpa;

    // Constructor
    PlacementRecord(String studentName, String company, double packageLpa) {
        this.studentName = studentName;
        this.company = company;
        this.packageLpa = packageLpa;
    }

    // Instance method
    void printRecord() {
        System.out.println(studentName + " -> " + company + " @ " + packageLpa + " LPA");
    }
}

public class readerwritesolution {
    public static void main(String[] args) {

        // Creating objects
        PlacementRecord p1 = new PlacementRecord("Ravi", "TCS", 4.5);
        PlacementRecord p2 = new PlacementRecord("Anitha", "Zoho", 6.2);
        PlacementRecord p3 = new PlacementRecord("Karthik", "Infosys", 4.0);

        // Array of PlacementRecord objects
        PlacementRecord[] records = {p1, p2, p3};

        // Printing each record
        for (int i = 0; i < records.length; i++) {
            records[i].printRecord();
        }
    }
}