public class Main {
    public static void main(String[] args) {
        int j,i,s;

        for (i=1; i<=10000000; i++) {
            s=0;
           for (j=1; j<=i; j++) {
               if (i%j==0){
                   s++;
               }

           }
           if (s==2) System.out.print(i+" ");

        }
    }
}