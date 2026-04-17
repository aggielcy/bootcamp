import java.util.HashSet;

public class DemoHashSet {
  public static void main(String[] args) {
    HashSet<String>strings = new HashSet<>();
    strings.add ("Sally");
    strings.add("Leo");
    strings.add("Jason");
    strings.add("Alex");    
    System.out.println(strings);

    strings.add("Jason");
    System.out.println(strings);

    System.out.println(strings.contains("Alex")); //true

    HashSet<Cat> cats = new HashSet<>();
    cats.add(new Cat ("cathy"));
    cats.add(new Cat ("Oscar"));
    cats.add(new Cat ("ben"));
    System.out.println(cats);

    cats.add(new Cat ("apple"));  
    System.out.println(cats);

    //! need equals + hashCode run together 
    System.out.println(cats.contains(new Cat("Oscar"))); //true


    //!ArrayList vs HashSet
    //1. HashSet has NO Ordering
    //2. avoid duplicated
    //3. HashSet use equals()+ HashCode()





  }
  
}
