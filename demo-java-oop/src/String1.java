public class String1 {
  private char[] chs; // "hello" -> chs

  // ...
  public String1() {

  }

  public String1(String value) {
    this.chs = new char[value.length()];
    int idx = 0;
    for (int i = 0; i < value.length(); i++) {
      this.chs[idx] = value.charAt(i);
      idx++;
    }
  }

  public int length() {
    return this.chs.length;
  }

  public char charAt(int index) {
    return this.chs[index];
  }

  public String replace(char from, char to) {
    for (int i = 0; i < this.chs.length; i++) {
      if (this.chs[i] == from) {
        this.chs[i] = to;
      }
    }
    // char array -> String (for loop)
    return String.valueOf(this.chs);
  }

  public int indexOf(char target) {
    int idx = -1;
    for (int i = 0; i < this.chs.length; i++) {
      if (this.chs[i] == target) {
        idx = i;
        break;
      }
    }
    return idx;
  }

  public static void main(String[] args) {
    String1 str = new String1("hello");

    System.out.println(str.length()); // 5
    System.out.println(str.charAt(0)); // h

    // replace('l', 'x')
    System.out.println(str.replace('l', 'x')); // hexxo
    System.out.println(str); // hexxo

    // indexOf('l')
    System.out.println(str.indexOf('o')); // 4

    String s = "hello";
    System.out.println(s.replace('l', 'x')); // hexxo
    System.err.println(s); // hello




    
  }
}