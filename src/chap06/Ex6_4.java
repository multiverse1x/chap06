package chap06;
public class Ex6_4 {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long result1 = mm.add(5L, 3L);
        long result2 = mm.subtract(5L, 3L);
        long result3 = mm.multiply(5L, 3L);
        double result4 = mm.divide(5L, 3L);

        System.out.println("add = " + result1);
        System.out.println("subtract = " + result2);
        System.out.println("multiply = " + result3);
        System.out.println("divide = " + result4);
        System.out.println("바뀐부분");
        System.out.println("두번째로 바뀐부분");
    }
}

class MyMath {
    long add(long a, long b) {
        long result = a + b;
        return result;
        // 위의 두줄을 한줄로 간단히 할수있다. return result;
        }
    long subtract(long a, long b) { return a - b; }
    long multiply(long a, long b) { return a * b; }
    double divide(double a, double b) { return a / b; }
}
