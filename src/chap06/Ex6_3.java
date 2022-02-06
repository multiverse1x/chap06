package chap06;

public class Ex6_3 {
    public static void main(String[] args) {
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);
        System.out.println("------------------");
        System.out.println();

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;
        System.out.println("c1은 (" + c1.kind + "," + c1.number + ")이며, 가로 " +
                Card.width + ", 세로 " + Card.height + "이다.");
        System.out.println("c2는 (" + c2.kind + "," + c2.number + ")이며, 가로 " +
                Card.width + ", 세로 " + Card.height + "이다.");
        System.out.println("c1의 가로와 세로를 각각 50, 80으로 변경합니다.");


        Card.width = 50;
        Card.height = 80;
        System.out.println("c1은 (" + c1.kind + "," + c1.number + ")이며, 가로 " +
                Card.width + ", 세로 " + Card.height + "이다.");

        System.out.println("c2는 (" + c2.kind + "," + c2.number + ")이며, 가로 " +
                Card.width + ", 세로 " + Card.height + "이다.");

    }
}


class Card {
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}