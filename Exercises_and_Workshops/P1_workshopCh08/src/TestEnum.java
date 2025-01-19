public class TestEnum {
    public static void main(String[] args) {
        for (FamilyMember p : FamilyMember.values()) {
            System.out.println(p + " was born in " + p.getYear() + " and is " + p.getGender());
        }
        FamilyMember cathy = FamilyMember.Cathy;
        System.out.println(cathy);
        
        // First save the members in an array
        FamilyMember[] members = FamilyMember.values();
        for (FamilyMember p : members) {
            System.out.println(p + " was born in " + p.getYear() + " and is " + p.getGender());
        }
    }
}
