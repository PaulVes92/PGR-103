public class Lion extends Animal {

    public Lion(){
    }

    public Lion(String name, String generation){
        super(name, generation);
    }

    public Lion(String name, String generation, int age){
        super(name, generation, age);
    }

    @Override
    public String toString(){
        return "My name is " + getName() + "," + getGeneration() + " of his/her name, and I am " + getAge() + ".";
    }

}
