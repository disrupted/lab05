public class AlgorithmAnalysis {
  public static void main(String[] args) {
    AlgorithmAnalysis aa = new AlgorithmAnalysis();
    final int n = 100;
    System.out.println("n = " + n);
    for (int i = 1; i <= 7; i++)
      aa.runAlgorithm(i, n);
  }

  private void first(int n) {
    int sum = 0;
    System.out.println("Fragment 1:");
    long start = System.nanoTime();
    for (int i = 0; i < n; i++) {
      sum++;
    }
    long stop = System.nanoTime();
    long runningTime = (stop - start);
    System.out.println("Running Time: " + runningTime + "ns");
    System.out.println("Operations: " + sum);
    System.out.println("Input Size: " + n);
    double v = (double) sum / n;
    System.out.println("factor to multiply N: " + v); // that represent n*v -> O(n) (linear)
    System.out.println("_____________________________");

  }

  private void second(int n) {
    int sum = 0;
    System.out.println("Fragment 2:");
    long start = System.nanoTime();
    for (int i = 0; i < n; i++)
      for (int j = 0; j < n; j++)
        sum++;
    long stop = System.nanoTime();
    long runningTime = (stop - start);
    System.out.println("Running Time: " + runningTime / 1000 + "ms");
    System.out.println("Operations: " + sum);
    System.out.println("Input Size: " + n);
    double v = (double) sum / n;
    System.out.println("factor to multiply N: " + v); // that represent n*v -> O(n^2) (quadratic)
    System.out.println("_____________________________");
  }

  private void third(int n) {
    int sum = 0;
    System.out.println("Fragment 3:");
    long start = System.nanoTime();
    for (int i = 0; i < n; i++)
      for (int j = i; j < n; j++)
        sum++;
    long stop = System.nanoTime();
    long runningTime = (stop - start);
    System.out.println("Running Time: " + runningTime / 1000 + "ms");
    System.out.println("Operations: " + sum);
    System.out.println("Input Size: " + n);
    double v = (double) sum / n;
    System.out.println("factor to multiply N: " + v); // that represent n*v -> O(n^2)/2 + n/2 -> can be reduced to O(n^2)/2
    System.out.println("_____________________________");
  }

  private void fourth(int n) {
    int sum = 0;
    System.out.println("Fragment 4:");
    long start = System.nanoTime();
    for (int i = 0; i < n; i++)
      sum++;
    for (int j = 0; j < n; j++)
      sum++;
    long stop = System.nanoTime();
    long runningTime = (stop - start);
    System.out.println("Running Time: " + runningTime + "ns");
    System.out.println("Operations: " + sum);
    System.out.println("Input Size: " + n);
    double v = (double) sum / n;
    System.out.println("factor to multiply N: " + v); // that represent n*v -> O(2N)
    System.out.println("_____________________________");
  }

  private void fifth(int n) {
    int sum = 0;
    System.out.println("Fragment 5:");
    long start = System.nanoTime();
    for (int i = 0; i < n; i++)
      for (int j = 0; j < n * n; j++)
        sum++;
    long stop = System.nanoTime();
    long runningTime = (stop - start);
    System.out.println("Running Time: " + runningTime / 1000 + "ms");
    System.out.println("Operations: " + sum);
    System.out.println("Input Size: " + n);
    double v = (double) sum / n;
    System.out.println("factor to multiply N: " + v); // that represent n*v -> O(N^3)
    System.out.println("_____________________________");
  }

  private void sixth(int n) {
    int sum = 0;
    System.out.println("Fragment 6:");
    long start = System.nanoTime();
    for (int i = 0; i < n; i++)
      for (int j = 0; j < i; j++)
        sum++;
    long stop = System.nanoTime();
    long runningTime = (stop - start);
    System.out.println("Running Time: " + runningTime / 1000 + "ms");
    System.out.println("Operations: " + sum);
    System.out.println("Input Size: " + n);
    double v = (double) sum / n;
    System.out.println("factor to multiply N: " + v); // that represent n*v -> less than O(n^2)/2 -n/2 -> can be reduced toO(n^2)/2
    System.out.println("_____________________________");
  }

  private void seventh(int n) {
    int sum = 0;
    System.out.println("Fragment 7:");
    long start = System.nanoTime();
    for (int i = 1; i < n; i++)
      for (int j = 0; j < n * n; j++)
        if (j % i == 0)
          for (int k = 0; k < j; k++)
            sum++;
    long stop = System.nanoTime();
    long runningTime = (stop - start);
    System.out.println("Running Time: " + runningTime / 1000 + "ms");
    System.out.println("Operations: " + sum);
    System.out.println("Input Size: " + n);
    double v = (double) sum / n;
    System.out.println("factor to multiply N: " + v); // that represent n*v -> O(N^5)
    System.out.println("_____________________________");
  }

  private void runAlgorithm(int number, int n) {
    switch (number) {
      case 1:
        first(n);
        break;
      case 2:
        second(n);
        break;
      case 3:
        third(n);
        break;
      case 4:
        fourth(n);
        break;
      case 5:
        fifth(n);
        break;
      case 6:
        sixth(n);
        break;
      case 7:
        seventh(n);
        break;
      default:
        System.out.println("ERROR: Algorithm " + number + " not found."); // algorithm not defined
        break;
    }
  }
}
