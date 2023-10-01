import java.util.Scanner;

public class PemihilihanPercobaan225 {

    public static void main(String[] args) {
        Scanner input25 = new Scanner(System.in);
        System.out.print("nilai uas     :");
        float uas = input25.nextFloat();
        System.out.print("nilai uts :");
        float uts = input25.nextFloat();
        System.out.print("nilai kuis    :");
        float kuis = input25.nextFloat();
        System.out.print("nilai tugas   :");
        float tugas = input25.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F)  + (kuis * 0.2F) + (tugas * 0.1F);

        String message = total < 65 ? "remidi"  :   "tidak remedi";
        System.out.println("nilai akhir = " +total+ " sehingga " + message);

        if (total >= 80) 
            System.out.println("A/sangat baik");
           else if (total >= 73) 
                System.out.println("B+/lebih dari baik");
             else   if (total >= 65) 
                    System.out.println("B/baik");
                else    if (total >= 60) 
                        System.out.println("C+lebih dari cukup");
                  else    if (total >= 50) 
                        System.out.println("C/cukup");
                    else  if (total >= 39 ) 
                            System.out.println("D/kurang");
                            else if (total <= 39 ) 
                                System.out.println("E/gagal");
        }

    }