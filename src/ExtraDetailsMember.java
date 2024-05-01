public class ExtraDetailsMember {
    private boolean married;
    private String address;
    private int numberOfChildren;
    private int memberId;

    public ExtraDetailsMember(boolean married, String address, int numberOfChildren, int memberId) {
        this.married = married;
        this.address = address;
        this.numberOfChildren = numberOfChildren;
        this.memberId = memberId;
    }
    @Override
    public String toString() {
        String result = "";
        if (married) {
            result += " is married. ";
        } else {
            result +=" is not married. ";
        }
        result += "The member lives at "+address;
        result += "\nThe member has "+numberOfChildren+" children.";
        result += "\nMember ID: "+memberId;
        return result;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    public void setNumberOfChildren(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }
}
