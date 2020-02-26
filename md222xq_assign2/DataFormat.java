package md222xq_assign2;

import java.util.Scanner;

public class DataFormat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("input year(number): ");
        int year = input.nextInt();

        System.out.println("Please input month(number): ");
        int month = input.nextInt();

        System.out.println("Please input day(number): ");
        int day = input.nextInt();

        input.nextLine();
        System.out.println("Please select a format (b/l/m): ");
        String format = input.nextLine();


        if (format.equals("b")){
            if (month >=10){
                System.out.println(year + "/" + month + "/" + day);
            }
            else{
                System.out.println(year + "/0" + month + "/" + day);
            }

        }
        else if(format.equals("m")){
            if (month >=10){
                System.out.println(month + "/" + day + "/" + year);            }
            else{
                System.out.println("0"+month + "/" + day + "/" + year);
            }
        }

        else if(format.equals("l")){
            if (month >=10){
                System.out.println(day + "/" + month + "/" + year);            }
            else{
                System.out.println(day + "/" + "0"+ month + "/" + year);              }
    }




input.close();

}
}

