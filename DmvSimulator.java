import java.util.Random;

public class DmvSimulator{

    public static void main(String[] args){

        //Greeting
        System.out.println("Welcome to the DMV.");

        //Give user random wait number (1-100)
        Random r = new Random();
        int waitNum = r.nextInt(100) + 1;
        System.out.println("Your number is " +  waitNum + ", please wait until your number is called.");

        //Call out numbers
        for(int i = 1; i <= 100; i++){
            if(i + waitNum <= 100){
                System.out.println("Number " + (i + waitNum) + "! Please come up!");
            }else if (i + waitNum > 100){
                System.out.println("Number " + ((i + waitNum) - 100) + "! Please come up!");
            }
        }

        //User doesn't have paperwork :(
        System.out.println("What a Pepega. Imagine not having the required paperwork. KEKW... You'll have to come back and wait again");
    }
}