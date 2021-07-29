// Array Out of bound exception addSuppressed(Throwable exception):, . fillInStackTrace():, getCause():
/*
public class LangError {
    public static void main(String[] args) {
        try {
            String pet[] = {"dog", "cat", "pig"};
            int n = "alex";
            System.out.println(pet[3]);
        } catch (Exception ex) {
            System.out.println("exception is " + ex);
            ex.printStackTrace();
            ex.fillInStackTrace();
            ex.getCause();
            ex.getSuppressed();

        }
        // give you a complier time error or unchecked error.
    }
}*/
