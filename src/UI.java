public class UI {
    MethodController MC;

    public UI() {
        MC = new MethodController();
        startProgram();
    }

    public void startProgram() {
        System.out.println("Printing memberlist: ");
        System.out.println(MC.toStringArray());

        System.out.println("Printing Extra Details member: ");
        System.out.println(MC.toStringArrayEDM());

        System.out.println("Find and search methods: ");
        Member memberToFind = MC.findMember("daniel jensen");
        ExtraDetailsMember extraDetailsMemberInfo = MC.returnExtraDetailsToMemberId(memberToFind);
        System.out.println(memberToFind.getName()+extraDetailsMemberInfo);



    }
}
