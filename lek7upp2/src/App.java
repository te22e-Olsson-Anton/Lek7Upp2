import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
    
    Scanner tb = new Scanner(System.in);

   /* int litetTal=10;
    int stortTal=1000;

    if(litetTal < 1000)
    {
    
    System.out.println(litetTal +" är mindre än"+stortTal);
    }
    else
    {
    System.out.println(litetTal +" är mindre än"+stortTal);
    }
    System.out.println("litetTal="+litetTal+" stortTal=" +stortTal);
    

    int tal1=10;
    
    int tal2=20;

    if(tal2 > tal1)
    {
        System.out.println(tal1+ " är större än " +tal2);
    }
    else
    {
        System.out.println(tal2+ " är mindre än "+ tal1);
    } */


    /*System.out.println("Vad är klockan");
    int klocka = tb.nextInt();

    if(klocka <7)
    {
        System.out.println("Dags att gå upp");
    }
    if(klocka == 12)
    {
        System.out.println("Dags att äta");
    }
    if(klocka > 23)
    {
        System.out.println("Dags att gå och lägga sig");
    }*/




    /*System.out.println("Hur gammal är du");
    int ålder = tb.nextInt();

    System.out.println("Är du medlem");
    String medlem = tb.next();

    if (ålder >= 18 && medlem.equalsIgnoreCase("Ja")) 
    {
        System.out.println("Du får komma in");
    }
    else
    {
        System.out.println("Du får inte komma in");
    }*/


    System.out.println("Användarnamn: ");
    String användarnamn = tb.nextLine();

    System.out.println("Password: ");
    String password = tb.nextLine();

    boolean användarnamn1 = false;
    boolean password1 = false;

    if(användarnamn.equals("root"))
    {
        användarnamn1 = true;
    }

    if(password.equals("passwd"))
    {
        password1 = true;
    }

    if(användarnamn1 && password1)
    {
        System.out.println("RÄTT");
    }
    else
    {
        System.out.println("FEL");
    }


}
}