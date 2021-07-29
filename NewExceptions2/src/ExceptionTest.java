/**import java.io.IOException;
public class ExceptionTest {
    public static void main(String[] args) {
        ExceptionTest exceptionTest = new ExceptionTest();
        try {
            exceptionTest.method1();
        } catch (IllegalArgumentException ex){
            System.out.println(" Assumption was caught");
        }
        public void method1(){
            try {
                method2();
            } catch (IllegalArgumentException ex){
                System.out.println(" Assumption was in method1 caught");
            }
        }
        public void method2(){
                method3();
               System.out.println(" method 2 would like to do something else ");
            }
        public void method3(){
            throw new IllegalArgumentException();
        }
    }
}
 */
