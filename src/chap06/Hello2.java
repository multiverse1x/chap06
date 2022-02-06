package chap06;

//하나의 소스파일에는 하나의 클래스만 작성하는 것이 좋다.

public class Hello2 {} //소스파일의 이름은 public class이름과 일치
   class Hello3{ //여기에 public 붙이면 에러남. 하나의 소스파일에는 하나의 public class만 허용
      public static void main(String[] args) {
        System.out.println("hello~");
      }
    }
    class Hello4{} // 소스파일 이름 바꾸려면 소스파일 > 오른쪽 클릭 > refactor > rename


