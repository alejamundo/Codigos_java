
package programacionBasica;

/**
 *
 * @author AlejaMundo
 */
public class SerieFibonacci {
    public static void main(String[] args) {
        int ant=0, post=1,sig;
        while(ant<100) {
            System.out.println(ant);//0-1-1
            sig=ant+post;//0+1=1,2,3
            ant=post;//1,1,2
            post=sig;//1,2,3
        }
    }
}
