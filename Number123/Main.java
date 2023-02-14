package Number123;

public class Main {
    public static void main(String[] args){
        int num = 396;
        int one = num / 100;
        int two = num /10 % 10;
        int three = num % 10;

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
    }
}
