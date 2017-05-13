public class AlgorithmAnalysis {
  int n = 10;

  public static void main(String[] args) {
    AlgorithmAnalysis aa = new AlgorithmAnalysis();
    System.out.println("actual number of steps:");
    System.out.println(aa.first());
    System.out.println(aa.second());
    System.out.println(aa.third());
    System.out.println(aa.fourth());
    System.out.println(aa.fifth());
    System.out.println(aa.sixth());
    System.out.println(aa.seventh());
  }

  public int first() {
    int sum = 0;
    // Fragment #1
    for ( int i = 0; i < n; i ++) {
      sum++;
    }
    return sum;
  }

  public int second() {
    int sum = 0;
    // Fragment #2
    for ( int i = 0; i < n; i ++)
      for ( int j = 0; j < n; j ++)
        sum++;
    return sum;
  }

  public int third() {
    int sum = 0;
    // Fragment #3
    for ( int i = 0; i < n; i ++)
      for ( int j = i; j < n; j ++)
        sum++;
    return sum;
  }

  public int fourth() {
    int sum = 0;
    // Fragment #4
    for ( int i = 0; i < n; i ++)
      sum ++;
    for ( int j = 0; j < n; j ++)
      sum ++;
    return sum;
  }

  public int fifth() {
    int sum = 0;
    // Fragment #5
    for ( int i = 0; i < n; i ++)
      for ( int j = 0; j < n*n; j ++)
        sum++;
    return sum;
  }

  public int sixth() {
    int sum = 0;
    // Fragment #6
    for ( int i = 0; i < n; i ++)
      for ( int j = 0; j < i; j ++)
        sum++;
    return sum;
  }

  public int seventh() {
    int sum = 0;
    // Fragment #7
    for ( int i = 1; i < n; i ++)
      for ( int j = 0; j < n*n; j ++)
        if (j % i == 0)
          for (int k = 0; k < j; k++)
            sum++;
    return sum;
  }
}
