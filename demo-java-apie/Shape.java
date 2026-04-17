public abstract class Shape {
  private Color2 color;

  // Empty Constructor
  public Shape() {
    
  }

  // All Args Constructor
  public Shape (Color2 color) {
    this.color = color;
  }

  public void setColor(Color2 color) {
    this.color = color;
  }

  public Color2 getColor() {
    return this.color;
  }

  // public double area() {
  //   return -1.0;
  // }

  // ! implicitly public
  abstract double area();

  public static void main(String[] args) {
    Shape s1 = new Circle2(3.5);
    System.out.println(s1.area()); 
    // Dynamic Polymorphism


    Shape [] Shapes = new Shape[] {new Circle2(3.5, Color2.BLACK),new Circle2(3.5, Color2.RED), new Sqaure(3.5, Color2.BLACK)};

    Double sum = 0.0;
    for (Shape shape: Shapes){
      sum += shape.area();
      //compile time: Share type --> can call area()
      // runtime: shape --> actual memory object area() content
    }
    System.out.println(sum);

    //! What is the different between interface and parent class
    //1. interface has no attribute, no constructor, no concrete method
    //2. parent class and interface , both can apply polymorphism (Shape[])
    //3. Parent class and interface --> static variable /method becoz static is both class , store in class not object.
    //4. Parent class (normal class -can new ()  and abstract class -- cannot new())
    //5. extends One parent, implements Many interface

  

    


  }
}