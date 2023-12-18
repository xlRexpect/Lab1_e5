

import java.util.Random;


    public class MainApp {
    public static void main(String[] args) {
        Random r=new Random();
        int a = r.nextInt(20);
        System.out.println(a);

        int b=0;

        int n1,n2=1,n3=2;
        int aux;

        if(a<=2){
            b=1;
        }else {
            while (n3 <= a)
            {
                if (a == n3) {
                    b = 1;
                    break;
                }

                aux = n2 + n3;
                n1 = n2;
                n2 = n3;
                n3 = aux;
                System.out.println(n1 + " " + n2 + " " + n3);
            }
        }

        if(b==1) {
            System.out.println("numarul apartine sirului fibonacci ");
        }else{
            System.out.println("numarul nu apartine sirului fibonacci ");
        }

    }
}