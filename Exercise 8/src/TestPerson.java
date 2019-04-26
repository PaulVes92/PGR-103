public class TestPerson {
    public static void main(String[] args) {
        Strudent strudent1 = new Strudent("Mario","Itsame","Java",2017,50.000);
        Strudent strudent2 = new Strudent("Luigi","UselessBrother","Java",2018,50.000);
        Strudent strudent3 = new Strudent("Link","Hyrule","Java",2019,50.000);

        System.out.println(strudent1.toString());
        System.out.println(strudent2.toString());
        System.out.println(strudent3.toString());

        strudent1.setFee(44.000);
        strudent1.setProgram("C++");
        strudent1.setYear(2020);

        System.out.println(strudent1.getFee());
        System.out.println(strudent1.getProgram());
        System.out.println(strudent1.getYear());

        Staff staff1 = new Staff("Mr.Anderson","Matrix","Westerdals",30.000);
        Staff staff2 = new Staff("Doomguy","Hell","Hell",100.000);

        System.out.println(staff1.toString());
        System.out.println(staff2.toString());

        staff2.setPay(200.000);
        staff1.setSchool("Westerdals");

        System.out.println(staff2.getPay());
        System.out.println(staff2.getSchool());
    }
}
