public class First {
    static void sum(int numA, int numB){
        if ((numA + numB) > 0){
            System.out.println("Positive sum:" + (numA + numB));
        } else if ((numA + numB) < 0) {
            System.out.println("Oops, it's not positive sum:" + (numA + numB));
        } else {
            System.out.println("WOW");
        }
    }

    public static void main(String[] args) {
       sum(5,10);
        sum(-9,6);
        sum(5,-5);
    }
}
