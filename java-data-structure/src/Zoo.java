import java.util.ArrayList;

public class Zoo<T extends Animal> {
  private ArrayList<T> animals;

  //constructor
   public Zoo(){
    this.animals = new ArrayList<>();
   }


  //getAnimals()
   public ArrayList<T> getAnimal(){
    return this.animals;
  }

   public boolean add(T animal){
    return this.animals.add(animal);
  }

  //add (T animal)

public static void main(String[] args) {
  Zoo<Tiger> zoo1 = new Zoo<>();
  zoo1.add(new Tiger("Tiger1"));

  Zoo<Panda> zoo2 = new Zoo<>();
  zoo2.add(new Panda());

  Zoo<Animal> zoo3 = new Zoo<>();
  zoo3.add(new Tiger());
  zoo3.add(new Panda());


 }
  
}
