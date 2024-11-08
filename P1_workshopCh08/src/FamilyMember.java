public enum FamilyMember {

    Cathy(1992, "W"),
    Tinu(1985, "M"),
    Levin(2015, "M"),
    Uva(1952, "W");

    private int year;
    private String gender;

    private FamilyMember(int year, String gender) {
        this.year = year;
        this.gender = gender;
    }

    public int getYear() {
        return this.year;
    }
    public String getGender() {
        return this.gender;
    }
}
