
// Automatic type conversions apply to overloading.
public class OverLoadDemo1 {
  void test() {
    System.out.println("NO Parameter.");
  }

  //OverLoad test for two integer parameter.
  void test(int a,int b) {
    System.out.println("a and b: "+ a + " " +b);
  }

  // OverLoad test for double parameter.
  void test(double a) {
  System.out.println("Inside test (double) a: "+ a);
  }
}

class OverrLoad{
  public static void main(String[] args) {
    OverLoadDemo1 demo = new OverLoadDemo1();

    int i=80;

    demo.test();
    demo.test(10, 20);

    demo.test(i); //this will invoke test (double)
    demo.test(125.666); // this will invoke tesrt (double)
  }
}
