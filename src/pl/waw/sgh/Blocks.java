package pl.waw.sgh;

public class Blocks {
    //
    public static int d = 6;

    public static void myProcedure() {
        System.out.println(d);
        //System.out.println(a);
    }

    public static int myFunc(int d) {
        return d*10;
    }

    public static void main(String[] args) {
        int a = 5;
        myProcedure();
        System.out.println(myFunc(7));
        //System.out.println(d);
        {
            int b = 7;
            System.out.println(a);
            System.out.println(b);
            {
                int c = 7;
                System.out.println(a);
                System.out.println(b);
            }
            //System.out.println(c);
        }
        System.out.println(a);
        //System.out.println(b);
    }
}
