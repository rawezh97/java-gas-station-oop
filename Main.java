import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nrx_muhasan = 1125;
        int nrx_normal = 950;
        int nrx_supper = 1250;
        gasstation gs = new gasstation();

        System.out.println("welcome to abas gas station");
        System.out.println("\n=========== nrxi amroy banzin ========== \nmuhasan : "+nrx_muhasan+"\nnormal : "+nrx_normal+"\nsupper : "+nrx_supper+" \n");
        System.out.println("am jora banzinana bardastn la 3estada \n1.muhasan\n2.normal\n3.supper");

        while (true) {
            System.out.print("\nzhmara daxl bka [1,2,3, 0 for quit] :");
            int option = sc.nextInt();
            if (option == 1) {
                System.out.println("{ muhasan selected }");
                System.out.print("chan litrt dawet :");
                int ltr = sc.nextInt();
                gs.values(ltr, nrx_muhasan);
                gs.show();

            } else if (option == 2) {
                System.out.println("{ Normal selected }");
                System.out.print("chan litrt dawet :");
                int ltr = sc.nextInt();
                gs.values(ltr, nrx_normal);
                gs.show();

            } else if (option == 3) {
                System.out.println("{ supper selected }");
                System.out.print("chan litrt dawet :");
                int ltr = sc.nextInt();
                gs.values(ltr, nrx_supper);
                gs.show();

            }

            else if (option == 0){
                break;
            }
            else {
                System.out.println("[ ! ] invalid input");
            }
        }
    }
}
class gasstation{
    private int nrxe_dolar;
    private int nrxe_litr;
    private int litr;
    private int distance;


    public gasstation(){
        litr = 0;
        nrxe_dolar = 0;
        nrxe_litr = 0;
    }
    public void show(){
        System.out.println("=============================================");
        System.out.println(purches());
        System.out.println(distanse());
        System.out.println("=============================================");
    }

    public void values(int bry_litr , int nrx){
        litr = bry_litr;
        nrxe_dolar = 150000;
        nrxe_litr = nrx;
    }

    public String purches(){
        int result = litr * nrxe_litr ;
        String value = "for the "+litr+" Litr we need :"+result+" hazar";
        return value;
    }
    public String distanse(){
        double maway_bashkrdn = litr * 1.75;
        String value = "ba "+litr+" litr banzin datwanen maway : "+maway_bashkrdn+"km bbryn";
        return value;
    }
}