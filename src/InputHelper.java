import java.util.Scanner;

public class InputHelper{
    //All methods should be public &static
    public static String getNonZeroLenString(Scanner scan, String prompt){
        String s;
        boolean valid=false;
        System.out.println(prompt);
        do{
            s=scan.nextLine();
            if (s.length()>0){
                valid=true;
            }else{
                System.out.println("Error, please try again");
            }
        }while(!valid);
        return s;
    }
    public static int getInt(Scanner scan, String prompt){
        int x=0;
        boolean valid=false;
        System.out.println(prompt);
        do{
            if (scan.hasNextInt()){
                x=scan.nextInt();
                valid=true;
            }else{
                System.out.println("Error, please try again. Must enter integer");
            }
            scan.nextLine();
        }while(!valid);
        return x;
    }
    public static double getDouble(Scanner scan, String prompt){
        double y=0;
        boolean valid=false;
        System.out.println(prompt);
        do{
            if (scan.hasNextDouble()){
                y=scan.nextDouble();
                valid=true;
            }else{
                System.out.println("Error, please try again. Must enter number");
            }
            scan.nextLine();
        }while(!valid);
        return y;
    }
    public static int getRangedInt(Scanner scan, String prompt) {
        int r = 0;
        int l = 0;
        int h = 100;
        boolean valid=false;
        System.out.println(prompt);

        System.out.println("Please enter number between "+l+" and "+h);
        do{
            if(scan.hasNextInt()){
                r=scan.nextInt();
                if(r>=l&&r<=h){
                    valid=true;
                }else{
                    System.out.println("Please enter number between "+l+" and "+h);
                }
            }else{
                System.out.println("Please enter int");
            }
            scan.nextLine();
        }while(!valid);
        return r;
    }

    public static double getRangedDouble(Scanner scan, String prompt) {
        double r = 0;
        double l = 0;
        double h = 100;
        boolean validFinal=false;
        System.out.println(prompt);
        /**/
        do{
            System.out.println("Please enter number between "+l+" and "+h);
            if(scan.hasNextDouble()){
                r=scan.nextDouble();
                if(r>=l&&r<=h){
                    validFinal=true;
                }else{
                    System.out.println("Please enter number between "+l+" and "+h);
                }
            }else{
                System.out.println("Please enter number");
            }
            scan.nextLine();
        }while(!validFinal);

        return r;
    }

    public static int getPositiveNonZeroInt(Scanner scan, String prompt){
        int k=0;
        boolean valid=false;
        System.out.println(prompt);
        do{
            if (scan.hasNextInt()){
                k=scan.nextInt();
                if(k>=0){
                    valid=true;
                }else{
                    System.out.println("Please enter postive");
                }
            }else{
                System.out.println("Error, please try again. Must enter integer");
            }
            scan.nextLine();
        }while(!valid);
        return k;
    }
    public static Boolean getYNConfirm(Scanner scan, String prompt){
        boolean yN=true;
        boolean valid=false;
        System.out.println(prompt);
        do{
            if(scan.hasNextBoolean()){
                yN= scan.nextBoolean();
                valid=true;
            }else{
                System.out.println("Please enter true or false");
            }
            scan.nextLine();
        }while(!valid);
        return yN;
    }
}
