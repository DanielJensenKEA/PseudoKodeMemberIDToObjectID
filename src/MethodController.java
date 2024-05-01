import java.lang.reflect.Method;
import java.util.ArrayList;

public class MethodController {

    Member member = new Member();
    ArrayList<Member> memberList;
    ArrayList<ExtraDetailsMember> extraDetailsList;

    public MethodController() {
        memberList = new ArrayList<>();
        extraDetailsList = new ArrayList<>();
        generateMembers();
        generateExtraDetailsMember();

    }

    public void generateMembers() {
        Member m1 = new Member("Daniel Jensen", 25, 90000, 234);
        memberList.add(m1);
        if (!memberList.isEmpty()) {
            System.out.println("Member added");
        } else {
            System.out.println("Error in adding member to list.");
        }

    }
    public void generateExtraDetailsMember() {
        ExtraDetailsMember EDM1 = new ExtraDetailsMember(false, "Vindspinderivej 80", 9, 234);
        extraDetailsList.add(EDM1);
        if (!extraDetailsList.isEmpty()) {
            System.out.println("Extra details about member added to list.");
        } else {
            System.out.println("Error in adding extra details to list of details.");
        }

    }
    public Member findMember(String name) {
        for(Member m : memberList) {
            if(m.getName().toLowerCase().equals(name)) {
                return m;
            }
        }
        return null;
    }
    public ExtraDetailsMember returnExtraDetailsToMemberId(Member member) {
        for(ExtraDetailsMember m : extraDetailsList) {
            if (member.getMemberId() == m.getMemberId()) {
                return m;
            }
        }
        return null;
    }

    public ArrayList<Member> getMemberList() {
        return memberList;
    }

    public ArrayList<ExtraDetailsMember> getExtraDetailsList() {
        return extraDetailsList;
    }
    public String toStringArray() {
        String result = " ";
        for(Member m : memberList) {
            result += m.toString();
        }
        return result;
    }
    public String toStringArrayEDM() {
        String result = " ";
        for(ExtraDetailsMember EDM : extraDetailsList) {
            result += EDM.toString();
        }
        return result;
    }
}
