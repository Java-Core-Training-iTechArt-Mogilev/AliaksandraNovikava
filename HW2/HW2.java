public class HW2 {

    public static void main(String[] args){
        int[] array= new int[10];
         for(int i= 0; i < array.length; i++)
         {
             array[i]= (int) (Math.random()*100)+1;
         }

        System.out.println("Array without sort:");
        for(int i= 0; i < array.length; i++)
        {
            System.out.print(array[i]+" ");
        }


int buf;
        for(int j =0; j< array.length;j++ ) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                }

            }
        }
        System.out.println();
        System.out.println("Array after sort:");
        for(int i= 0; i < array.length; i++)
        {
            System.out.print(array[i]+" ");
        }


    }
}
