package ArrayEColection;

public class Array {
    public static void main(String[] args) {
        Integer [] array = new Integer[6]; // definir estaticos {2,3,4,15,3};

        array[0] = 2;
        array[1] = 5;
        array[5] = 8;

//        Percorrendo array
        for(int i = 0; i < array.length; i++){
            if (array[i] == null){
                array[i] = i;
            }
            array[3] = 33;
            System.out.println(array[i]);
        }

    }
}
