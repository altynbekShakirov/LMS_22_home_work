import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list= new ArrayList<>();
        ArrayList<Integer>exactNumber=new ArrayList<>();
        ArrayList<Integer>evenNumber= new ArrayList<>();
        Random random= new Random();


        for (int i = 0; i < 50; i++) {
            int num= random.nextInt(1,100);
            if (num%2==1) exactNumber.add(num);
           else {

               evenNumber.add(num);
            }
        }
        list.add(exactNumber);
        list.add(evenNumber);
        System.out.println("Exact number: "+exactNumber);
        System.out.println("Even number: "+evenNumber);
        System.out.println("In one array: "+list);

    }


}