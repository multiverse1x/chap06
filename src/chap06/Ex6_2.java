package chap06;

public class Ex6_2 {
    public static void main(String[] args) {

        Tv t1 = new Tv(); // Tv t1; t1= new Tv(); 를 한문장으로 가능.
        Tv t2 = new Tv();
        System.out.println("t1의 channel값은 " + t1.channel);
        System.out.println("t2의 channel값은 " + t2.channel);

        t1.channel = 7;
        System.out.println("t1dml channel이 7로 변경되었습니다.");
        System.out.println("t1의 channel값은 " + t1.channel);
        System.out.println("t2의 channel값은 " + t2.channel);

        t2.channel = t1.channel; //참조변수 t1의 값을 t2에 저장. 참조를 변경
        System.out.println("t1의 channel값은 " + t1.channel);
        System.out.println("t2의 channel값은 " + t2.channel);


    }
}
