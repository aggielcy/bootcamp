public enum Direction2 {
  RED, BLACK, BLUE,;



  public static void main(String[] args) {
    double[] prices = new double[] {99.9, 50.3, 100.0};
    double totalPrice = 0.0;
    for (int i = 0; i < prices.length; i++) {
      totalPrice += prices[i];
    }
  }

}
