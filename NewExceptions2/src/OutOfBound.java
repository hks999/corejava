// Array Out of bound exception addSuppressed(Throwable exception):, . fillInStackTrace():, getCause():

public class OutOfBound {
    public static void main(String[] args) {
        try {
            String pet[] = {"dog", "cat", "pig"};
            System.out.println(pet[3]);
        } catch (Exception ex) {
            System.out.println("exception is " +ex);
            ex.printStackTrace();

        }
    }
}
