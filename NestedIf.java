import java.util.*;
public class NestedIf {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your favorite iconic character:");
        String act=sc.nextLine();
        if(act.equals("Iron Man")){
            System.out.println("Great choice");
            System.out.println("enter" +act+"real name");
            String reall=sc.nextLine();
            if(reall.equalsIgnoreCase("tony stark")) {
                 System.out.println("Cool actor");
            }
        }else{
            System.out.println(act);
         }
     }
}
