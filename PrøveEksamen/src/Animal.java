public abstract class Animal {

    private String name;
    private String generation;
    private int age;
    private Stable stable;

    public Animal(){
        name = "ikke satt";
        generation = "ikke satt";
        age = 0;
    }

    public Animal(String name, String generation){
        this.name = name;
        this.generation = generation;
    }

    public Animal(String name, String generation, int age){
        this.name = name;
        this.generation = generation;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setGeneration(String generation){
        this.generation = generation;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public String getGeneration(){
        return generation;
    }

    public int getAge(){
        return age;
    }

    @Override
    public abstract String toString();

    public Stable getStable(){
        return stable;
    }

    public void setStable(Stable stable){
        this.stable = stable;
    }
}

