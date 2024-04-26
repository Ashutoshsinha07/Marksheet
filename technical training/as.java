import javax.swing.*;

class Student {
    private int rollNo;
    private String name;
    private int[] marks;

    // Constructor
    public Student(int rollNo, String name, int[] marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Getter methods
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int[] getMarks() {
        return marks;
    }

    // Method to calculate total marks
    public int calculateTotalMarks() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    // Method to calculate percentage
    public double calculatePercentage() {
        return (double) calculateTotalMarks() / marks.length;
    }

    // Method to determine grade
    public String calculateGrade() {
        double percentage = calculatePercentage();
        if (percentage >= 90) {
            return "A";
        } else if (percentage >= 80) {
            return "B";
        } else if (percentage >= 70) {
            return "C";
        } else if (percentage >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}

class ReportCardGUI {
    public static void main(String[] args) {
        // Create a new student object
        Student student = new Student(1, "John Doe", new int[]{99, 90, 87});

        // Create report card
        StringBuilder reportCard = new StringBuilder();
        reportCard.append("Roll No: ").append(student.getRollNo()).append("\n");
        reportCard.append("Name: ").append(student.getName()).append("\n");
        reportCard.append("Marks: ").append(java.util.Arrays.toString(student.getMarks())).append("\n");
        reportCard.append("Total Marks: ").append(student.calculateTotalMarks()).append("\n");
        reportCard.append("Percentage: ").append(student.calculatePercentage()).append("%\n");
        reportCard.append("Grade: ").append(student.calculateGrade()).append("\n");

        // Display report card using Swing
        JOptionPane.showMessageDialog(null, reportCard.toString(), "Student Report Card", JOptionPane.INFORMATION_MESSAGE);
    }
}
