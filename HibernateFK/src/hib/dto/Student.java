
package hib.dto;

public class Student extends College 
{
    private int rollNo;
    private String studentName;

    public Student() {
    }

    public Student(int rollNo, String studentName) {
        this.rollNo = rollNo;
        this.studentName = studentName;
    }

    public Student(int rollNo, String studentName, int regNo, String collegeName, String services) {
        super(regNo, collegeName, services);
        this.rollNo = rollNo;
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    
}
