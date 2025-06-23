package Basic_maths;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.Math.sqrt;

public class allDivisors {
    ArrayList<Integer> allDiv(int num){     //Return type is Arraylist <Integer
        ArrayList <Integer> a1=new ArrayList<>();
        for(int i=1; i<=num;i++){
            if(num%i==0) {
                a1.add(i);
            }
        }
        return a1;
    }

    ArrayList<Integer> optimal_allDiv(int num){
        ArrayList<Integer> a2=new ArrayList<>();
        for (int i=1;i<=sqrt(num);i++){
            if(num%i==0){
                a2.add(i);
                if(num/i!=i){
                    a2.add(num/i);
                }
            }
        }
        return a2;
    }
    public static void main(String[] args) {
        allDivisors a1=new allDivisors();
        ArrayList<Integer> divisors=a1.allDiv(36);
        System.out.println(divisors);

        ArrayList<Integer> div=a1.optimal_allDiv(36);
        System.out.println(div);
        Collections.sort(div);  //Sorting the list
        System.out.println(div);
    }
}

//Note: In first approach T.C is O(n) and in second approach it is O(sqrt(n))
