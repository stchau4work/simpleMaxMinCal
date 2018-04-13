public class SimpleCalService {

    private int[] simpleArr;

    public SimpleCalService(int[] simpleArr){
        this.simpleArr = simpleArr;
    }

    public int calculateMaxDelta(){
        return findMax()- findMin();
    }

    public int findMax() {
        int i = 1;
        int max = simpleArr[0];
        while (simpleArr.length - i >0){
            if (max < simpleArr[i])
            {
                max = simpleArr[i];
            }
            i++;
        }
        return max;
    }

    public int findMin() {
        int i = 1;
        int min = simpleArr[0];
        while (simpleArr.length - i >0){
            if (min > simpleArr[i])
            {
                min = simpleArr[i];
            }
            i++;
        }
        return min;
    }
}
