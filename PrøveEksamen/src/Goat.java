public class Goat extends Animal implements Feedable  {
    private String favoriteFood;

    public Goat(){
        favoriteFood = "ikke satt";
    }

    public Goat(String name, String genetation){
        super(name, genetation);
    }

    public Goat(String name, String generation, int age){
        super(name, generation, age);
    }

    public Goat(String name, String generation, int age, String favoriteFood){
        super(name, generation, age);
        this.favoriteFood = favoriteFood;
    }

    public void setFavoriteFood(String food){
        this.favoriteFood = food;
    }

    public String getFavoriteFood(){
        return favoriteFood;
    }

    @Override
    public String toString(){
        return "My name is " + getName() + ", " + getGeneration() + " of his/her name, and I am " + getAge()
                + ". I am pleased if you feed me " + favoriteFood + ".";
    }

    @Override
    public String feedAnimal(String food){
        if (favoriteFood.equals(food)){
            return food + " is my favorite food";
        } else {
            return "I dont like " + food + ". Do something else for me";
        }
    }
}
