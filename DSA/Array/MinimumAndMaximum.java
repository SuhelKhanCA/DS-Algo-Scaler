import java.util.Arrays;
class Pair{
    int index;
    int value;
    public Pair(int index, int value){
        this.index = index;
        this.value = value;
    }
    public String printPair(){
        return this.value + " --- " + this.index;
    }
}
public class MinimumAndMaximum{
    public static void main(String[] args) {
        int[] arr = {55, 41, 12, 66, -70, 100};

        System.out.println("Minimum element with index is: " + minimum(arr).printPair());
        System.out.println("Maximum element with index is: " + maximum(arr).printPair());
   
    }

    static Pair minimum(int[] a){
          int minIndex = 0;
          for(int i=0; i< a.length; i++){
            if(a[i] < a[minIndex]){
                minIndex = i;
            }
          }

          return new Pair(minIndex, a[minIndex]);                              
    }

    static Pair maximum(int[] a){
          int maxIndex = 0;
          for(int i=0; i< a.length; i++){
            if(a[i] > a[maxIndex]){
                maxIndex = i;
            }
          }

          return new Pair(maxIndex, a[maxIndex]);                              
    }    
}