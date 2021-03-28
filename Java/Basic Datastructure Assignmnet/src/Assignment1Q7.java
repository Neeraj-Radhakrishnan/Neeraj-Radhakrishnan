class SearchArray{
    public boolean searchArray(int[] arr,int valueToCheck){
        int i;
        //int count;
        for (i=0;i<arr.length; i++){
            if (arr[i]==valueToCheck){
                //count = (i+1);
                return true ;
            }
        }
        return false;
    }
}
public class Assignment1Q7 {
    public static void main(String[] args) {
        int [] arr = { 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int valueToCheck = 6;
        SearchArray obj =  new SearchArray();
        boolean search = obj.searchArray(arr,valueToCheck);
        if (search ){
            System.out.println("Element found " );
        }
        else
            System.out.println("Element not found");
    }

}
