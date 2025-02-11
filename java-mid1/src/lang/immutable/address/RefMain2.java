package lang.immutable.address;

public class RefMain2 {

    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = new ImmutableAddress("대구");
        System.out.println("대구 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
