package sci.inheritance;

public class ExampleWithArray {
    public static void main(String args[]){

        int[] sirDeNumere = exampleWithArray(); //cum l-am creat:selectare ce avem nevoie, refactor-exract-method
        exampleWithArrayObjects();
        exampleDeleteElementFromArray();

        int [] sirNumerePredefinite={3,4,8};
        System.out.println(sirDeNumere[1]);
    }

    private static void exampleDeleteElementFromArray() {
        String sirString[]= {"a", "b","c"};
        String [] newArrayCopy=new String[2];
        for (int i=0; i<sirString.length; i++){
            //i este par:
            //if (i%2==0)
            //if i este impar:
            // if i%2!=0
            if (i!=2&&i<newArrayCopy.length){
                newArrayCopy[i]=sirString[i];
            }
        }
    }


    //Creare array de obiecte ;
    private static void exampleWithArrayObjects() {
        Shape [] sirDeNumere= new Shape[5];
        sirDeNumere[0]=new Circle(1);
        sirDeNumere[1]=new Circle(1);
        sirDeNumere[2]=new Triangle(1,2,3);
        sirDeNumere[3]=new Rectangle(3,4);
        sirDeNumere[4]=new Triangle(2,4,5);

            for(int i=0;i<sirDeNumere.length; i++){
                System.out.println(sirDeNumere[i].displayShape());

            }
    }



    private static int[] exampleWithArray() {
        int dataprimitiva;
        int [] sirDeNumere=new int[5];
        sirDeNumere[0]=5;
        sirDeNumere[1]=3;
        sirDeNumere[2]=8;

        return sirDeNumere;
    }
}
