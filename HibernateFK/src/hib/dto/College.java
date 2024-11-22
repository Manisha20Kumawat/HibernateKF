
package hib.dto;

public class College 
{       
    private int regNo;
    private String collegeName;
    private String services;

    public College() {
    }

    public College(int regNo, String collegeName, String services) {
        this.regNo = regNo;
        this.collegeName = collegeName;
        this.services = services;
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
    
}
