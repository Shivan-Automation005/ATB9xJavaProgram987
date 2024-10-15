package Oct15102024;

public class TernaryOperator
{
    public static void main(String[] args) {
        int a=10,b=25,c=15;
        int max;
        max=(a>b) ? (a > c ? a:c) :( b > c ? b: c);
        System.out.println(max);
    }
}
