package ByblosBank;

public class Branches {
    private String branchName;
    private String branchLocation;
    private String branchPhoneNumber;
    private int branchCode;

    public Branches(String branchName, String branchLocation, String branchPhoneNumber, int branchCode) {
        this.branchName = branchName;
        this.branchLocation = branchLocation;
        this.branchPhoneNumber = branchPhoneNumber;
        this.branchCode = branchCode;

    }

    @Override
    public String toString() {
        return "Branches{" +
                "branchName='" + branchName + '\'' +
                ", branchLocation='" + branchLocation + '\'' +
                ", branchPhoneNumber='" + branchPhoneNumber + '\'' +
                ", branchCode=" + branchCode +
                '}';
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchLocation(String branchLocation) {
        this.branchLocation = branchLocation;
    }

    public String getBranchLocation() {
        return branchLocation;
    }

    public void setBranchPhoneNumber(String branchPhoneNumber) {
        this.branchPhoneNumber = branchPhoneNumber;
    }

    public String getBranchPhoneNumber() {
        return branchPhoneNumber;
    }

    public void setBranchCode(int branchCode) {
        this.branchCode = branchCode;
    }

    public int getBranchCode() {
        return branchCode;
    }
}
