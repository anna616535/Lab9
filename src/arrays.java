import java.util.Scanner;

public class arrays {
    static void main() {
        int [] dataPoints = new int[100];
        Scanner scan = new Scanner(System.in);
        int sum=0;
        double avg=0;
        int shortest=0;
        int longest=0;
        for(int i=0; i<dataPoints.length; i++){
            dataPoints[i]=(int)(Math.random()*100)+1;
        }
        for(int x: dataPoints){
            System.out.print(x+" | ");
        }

        for (int point : dataPoints) {
            sum += point;
        }

        avg= (double) sum /100;

        for(int i=0; i<dataPoints.length; i++){
            if (dataPoints[i]>dataPoints[longest]){
                longest=i;
            }
        }

        for(int i=0; i<dataPoints.length; i++){
            if (dataPoints[i]<dataPoints[shortest]){
                shortest=i;
            }
        }


        System.out.println("\nSum of elements "+ sum);
        System.out.println("Averge of elements "+ avg);
        System.out.println("Max "+ dataPoints[longest]);
        System.out.println("Min " +dataPoints[shortest]);
        int times=0;
        int users= InputHelper.getRangedInt(scan, "\nEnter a number to find in the array");
        for (int i=0; i<dataPoints.length; i++) {
            if (users == dataPoints[i]) {
                times++;
            }
        }
        System.out.println("Your number "+ users+ " showed up "+times+" times");

        int once = InputHelper.getRangedInt(scan, "\nEnter a number to find in the array");
        int i;
        boolean found=false;
        for (i=0; i<dataPoints.length; i++) {
            if (once == dataPoints[i]) {
                found=true;
                break;
            }
        }
        if (found) {
            System.out.println("Your number " + once + " showed up at " + i);
        }else{
            System.out.println("Your number did not show up");
        }
    }
}
