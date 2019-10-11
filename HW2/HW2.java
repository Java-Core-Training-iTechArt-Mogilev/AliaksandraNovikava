public class HW2 {

    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) + 1;
        }

        int min = array[0];
        int max = 0;
        double mid = 0;
        int sum = 0;

        for (int i = 0; i < array.length - 1; i++) {

            if (min > array[i + 1]) {
                min = array[i + 1];
            }

            if (max < array[i]) {
                max = array[i];
            }
            sum += array[i];
        }
        mid = sum / array.length;


        System.out.println("Array without sort:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();
        System.out.println("Min value = " + min + " Max value = " + max + " Average value = " + mid);
        int buf;
        for (int j = 0; j < array.length; j++) {
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
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }


    }
}
