public class TestAnimal {
    public static void main(String[] args) {
        Lion simba = new Lion("Simba", "The Second", 2);
        Goat billy = new Goat("Billy", "The First", 5, "Grass");
        Stable ourStable = new Stable("Ekeberg parken", "Horse box NR.5", "EKT");

        billy.setStable(ourStable);

        System.out.println(billy.toString());
        System.out.println(simba.toString());

        System.out.println(billy.feedAnimal("Grass"));
        System.out.println(billy.feedAnimal("Beef"));

    }
}
