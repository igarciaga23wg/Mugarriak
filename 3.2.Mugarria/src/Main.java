import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Aukeratu eragiketa bat:");
        System.out.println("1. Batuketa \t2. Kenketa");
        System.out.println("3. Biderketa \t4. Zatiketa");
        System.out.println("5. Berreketa \t6. Hondarra");
        int aukera = sc.nextInt();

        System.out.println("Sartu lehen zenbakia (hamartarra izan daiteke):");
        float zenb1 = sc.nextFloat();

        System.out.println("Sartu bigarren zenbakia (hamartarra izan daiteke):");
        float zenb2 = sc.nextFloat();
        sc.close();

        switch (aukera) {
            case(1):
                float batu = batuketa(zenb1,zenb2);
                System.out.println("Eragiketaren emaitza "+batu+" da.");

            case(2):
                float kenk = kenketa(zenb1,zenb2);
                System.out.println("Eragiketaren emaitza "+kenk+" da.");

            case(3):
                float bider = biderketa(zenb1,zenb2);
                System.out.println("Eragiketaren emaitza "+bider+" da.");

            case(4):
                float zati = zatiketa(zenb1,zenb2);
                System.out.println("Eragiketaren emaitza "+zati+" da.");

            case(5):
                double ber = berreketa(zenb1,zenb2);
                System.out.println("Eragiketaren emaitza "+ber+" da.");

            case(6):
                float hond = hondarra(zenb1,zenb2);
                System.out.println("Eragiketaren emaitza "+hond+" da.");
        }
    }

    public static float batuketa(float zenbA , float zenbB) {
        float emaitza = 1;
        emaitza= zenbA+zenbB;
        return emaitza;
    }
    public static float kenketa(float zenbA , float zenbB) {
        float emaitza = 1;
        emaitza= zenbA-zenbB;
        return emaitza;
    }
    public static float biderketa(float zenbA , float zenbB) {
        float emaitza = 1;
        emaitza= zenbA*zenbB;
        return emaitza;
    }
    public static float zatiketa(float zenbA , float zenbB) {
        float emaitza = 1;
        emaitza= zenbA/zenbB;
        return emaitza;
    }
    public static double berreketa(double zenbA , double zenbB) {
        double emaitza = 1;
        double ber=0;
        for(int i=0; i<=zenbB;i++){
            ber= ber*zenbA;
        }
        return emaitza;
    }
    public static float hondarra(float zenbA , float zenbB) {
        float emaitza = 1;
        emaitza= zenbA%zenbB;
        return emaitza;
    }
}