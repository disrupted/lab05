public class AlgorithmAnalysis {
  private static final int n = 10;

  public static void main(String[] args) {
    AlgorithmAnalysis aa = new AlgorithmAnalysis();
    System.out.println("n = " + n);
    System.out.println("actual number of steps for algorithm...");
    for (int i = 1; i <= 7; i++) {
      System.out.println(i + ": " + aa.runAlgorithm(i, n));
    }
  }

  private int first(int n) {
    int sum = 0;
    // Fragment #1
    for (int i = 0; i < n; i++) {
      sum++;
    }
    return sum;
  }

  private int second(int n) {
    int sum = 0;
    // Fragment #2
    for (int i = 0; i < n; i++)
      for (int j = 0; j < n; j++)
        sum++;
    return sum;
  }

  private int third(int n) {
    int sum = 0;
    // Fragment #3
    for (int i = 0; i < n; i++)
      for (int j = i; j < n; j++)
        sum++;
    return sum;
  }

  private int fourth(int n) {
    int sum = 0;
    // Fragment #4
    for (int i = 0; i < n; i++)
      sum++;
    for (int j = 0; j < n; j++)
      sum++;
    return sum;
  }

  private int fifth(int n) {
    int sum = 0;
    // Fragment #5
    for (int i = 0; i < n; i++)
      for (int j = 0; j < n * n; j++)
        sum++;
    return sum;
  }

  private int sixth(int n) {
    int sum = 0;
    // Fragment #6
    for (int i = 0; i < n; i++)
      for (int j = 0; j < i; j++)
        sum++;
    return sum;
  }

  private int seventh(int n) {
    int sum = 0;
    // Fragment #7
    for (int i = 1; i < n; i++)
      for (int j = 0; j < n * n; j++)
        if (j % i == 0)
          for (int k = 0; k < j; k++)
            sum++;
    return sum;
  }

  private int runAlgorithm(int number, int n) {
    switch (number) {
      case 1:
        return first(n);
      case 2:
        return second(n);
      case 3:
        return third(n);
      case 4:
        return fourth(n);
      case 5:
        return fifth(n);
      case 6:
        return sixth(n);
      case 7:
        return seventh(n);
      default:
        return -1; // algorithm not defined
    }
  }
}
