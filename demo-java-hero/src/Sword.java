// ! final (cannot be assigned after constructor)
public class Sword extends Weapon {
  private final Type type; //<final meaning cannot setter
  private int level;

  // Constructor , use private, not public
  private Sword(Type type) {
    this.type = type;
  }

  public static Sword ofDORAN() { // 5 , use static, not need to create new object
    return new Sword(Type.DORAN);
  }

  public static Sword ofHEXDRINKER() { // 10
    return new Sword(Type.HEXDRINKER);
  }

  // Method
  public Sword.Type getType() {
    return this.type;
  }

  public int getPa() {
    return this.type.getPa();
  }

  // Inner Class
  public static enum Type {
    DORAN(5), HEXDRINKER(10),;

    private int pa;

    private Type(int pa) {
      this.pa = pa;
    }

    public int getPa() {
      return this.pa;
    }
  }
}