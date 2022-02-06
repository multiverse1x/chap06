package chap06;

public class Ex6_1 {
    public static void main(String[] args) {
        Tv t;
        t = new Tv();
        System.out.println(t.power);
        System.out.println(t.color);
        System.out.println(t.channel);
        System.out.println("-------");

        t.channel = 7;
        t.channelDown();
        t.channelup();
        t.channelup();
        t.power();

        if(t.power){
            System.out.println("전원은 켜졌다.");
        } else {
            System.out.println(("전원은 꺼졌다."));
        }
        System.out.println("현재 채널은 " + t.channel + "이다");

    }
}

class Tv {
    String color;
    boolean power;
    int channel;

    void power() {power = !power;}
    void channelup() {++channel;}
    void channelDown() {--channel;}
}