package Test_package;

public class duplicateChecker {

    public static boolean hasDuplicate(int[]arr){
        boolean check = false;

        for (int i = 0; i<arr.length; i++){

            for(int k = 0; k<arr.length; k++){

                if(i==k){

                }

                else if (arr[i]==arr[k]){
                    //System.out.println("Duplicate");
                    check = true;
                    break;
                }


            }

        }
        return check;

    }

    public static void main(String[] args) {

        int[]arr1 = {1,2,3,4,5};
        int[]arr2 = {1,2,2,3};

        System.out.println(hasDuplicate(arr1));



    }





}
