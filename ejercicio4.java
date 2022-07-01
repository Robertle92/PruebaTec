public class ejercicio4 {

    public static int calculateModa(int arrayModa[]) {

        int maxReps= 0;
        int moda= 0;

        for(int i=0; i < arrayModa.length; i++) {
            int numReps= 0;

            for(int j=0; j < arrayModa.length; j++) {
                if(arrayModa[i] == arrayModa[j]) {
                    numReps++;
                }
                if(numReps > maxReps) {
                    moda= arrayModa[i];
                    maxReps= numReps;
                }
            }
        }
        return moda;
    }

    public static void main(String[] args){
        int modaArray[] = new int[] {9,6,86,3,6,6,1,22,3,9,6,7,12};
        System.out.println("Moda is: \n" + calculateModa(modaArray));
    }
}
