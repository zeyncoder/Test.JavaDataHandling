package level1.WRAPPER;

public class Wrapper {
    public static void main(String[] args) {
        int number=27;
        Integer wrapped=Integer.valueOf(number);
        int unwrapped = wrapped.intValue();
        System.out.print( number + " " + wrapped + " " + unwrapped);

    }
}
