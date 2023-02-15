import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args){
        ArrayList<String> a1= new ArrayList<String>();
        a1.add("john");
        a1.add("Dean");
        a1.add("Sam");
        for(String str : a1){

            System.out.println("Welcome:"+str);
        }
        System.out.println("size of Arraylist"+a1.size());
        a1.remove(2);
        a1.remove("Dean");
        System.out.println("ArrayList after removing element:");
        System.out.println("size of arraylist:"+a1.size());

        a1.set(1,"shushuvai");
        System.out.println("a1"+a1);


    }
}
