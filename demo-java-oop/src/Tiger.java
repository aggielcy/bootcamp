public class Tiger {
  private Color2 color;

  // Constructor
  public Tiger (Color2 color) {
    this.color = color;
  }
  // get set
  public Color2 getColor() {
    return this.color;
  }

  public void setColor(Color2 color) {
    this.color = color;
  }

  public static void main(String[] args) {
    Tiger t1 = new Tiger(Color2.RED);

    if (t1.getColor() == Color2.RED) {

    }

    // new Color()

  }
}