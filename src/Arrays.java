public class Arrays {
    public static void main(String[] args) {

        /*/w przypadku gdy w typie int nie zadeklarujemy
         wszystkich miejsc w tabeli wynikiem bedzie 0, w przypadku Integer wynikiem bedzie null*/

        int[] intArr = new int[3];
        intArr[0] = 567;
        intArr[1] = 968;
        intArr[2] = 675;

        String[] strArr = new String[] {
                "ABC",
                "DEF",
                "EFG"
        };

        for (int i=0; i<intArr.length; i++){

            System.out.println(i + "'th element: " + intArr[i]);
        }

        for (String el : strArr){
            System.out.println("My strArr element: " + el);

        }

    }
}
