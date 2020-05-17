package pro;
import ject.ok;

import java.util.Date;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
abstract class q{
    String s="WELCOME TO MORTGAGE ";
    abstract void display();
    abstract void hospital();
    String r="REQUEST ACCEPTED";
    String adhar="123456789012";
    String pan="qwertyuiop";
    String kissan="12345";
    static String hospi;
    public Date paymentDate;

    Scanner hos=new Scanner(System.in);


    int tol_far_loan =0, tol_sergery =0,count=0,amount=0, trans_store =0, no_of_seed =0, tol_hos_loan =0, tol_dailysis=0;

    void Farmer()

    {

        System.out.println("-------------"+s+"-------------");
        System.out.println("PLEASE ENTER YOUR CHOICE ");
        System.out.println("----->");
        System.out.println("       1. SEEDS AND PESTICIDE LOON ");
        System.out.println("       2. TRANSPORTATION AND STORAGE LOON ");
        Scanner f=new Scanner(System.in);
        int i=f.nextInt();

        switch(i)
        {

            case 1: System.out.println(r); no_of_seed++; amount=amount+1000; count++;
                break; case 2:
            System.out.println(r); trans_store++; amount=amount+2000; count++;
            break;

        }

    }}

class r extends q{
    String x;

    void Farmer()
    {
        paymentDate=new Date();
        String s="WELCOME TO THE FARMER'S PORTAL ";
        String ss=s.concat(" YOU ARE THE BACKBONE OF OUR COUNTRY ");
        System.out.println(super.s);
        System.out.println(ss);
        System.out.println("PLEASE ENTER YOUR CHOICE");
        System.out.println("----->");
        System.out.println("       1. SEEDS AND PESTICIDE LOON        -> ₹ 20000 ");
        System.out.println("       2. TRANSPORTATION AND STORAGE LOON -> ₹ 30000");
        Scanner f=new Scanner(System.in);
        int i=f.nextInt();
        switch(i)

        {

               case 1: System.out.println(super.r);
                         if(no_of_seed==2)
                         {
                             System.out.println("YOU HAVE ALREADY CROSSED THE LIMIT TO TAKE LOAN ");
                             System.out.println("      KINDLY PLEASE TRY FOR OTHER LOANS   ");
                         }
                         else {
                             no_of_seed++;
                             amount = amount + 20000+800;
                             count++;
                              }
                         break;
                case 2: System.out.println(super.r);
                    if(trans_store==2)
                    {
                        System.out.println("YOU HAVE ALREADY CROSSED THE LIMIT TO TAKE LOAN ");
                        System.out.println("      KINDLY PLEASE TRY FOR OTHER LOANS   ");
                    }
                    else {
                        trans_store++;
                        amount = amount + 30000+1200;
                        count++;
                        }
                         break;
        }
    }

    void hospital()
    {

        System.out.println(super.s);
        paymentDate=new Date();
        System.out.println(" ");
        System.out.println("PLEASE ENTER YOUR HOSPITAL NAME");

         hospi=hos.next();
        System.out.println("ENTER YOUR CHOICE");
        System.out.println("----->");
        System.out.println("1.    SURGERY LOAN  -> ₹ 50000");
        System.out.println("2.    DIALYSIS LOAN -> ₹ 20000");
        Scanner f=new Scanner(System.in);
        int i=f.nextInt();

        switch(i)

        {

            case 1: System.out.println(super.r);
                if(tol_sergery==2)
                {
                    System.out.println("YOU HAVE ALREADY CROSSED THE LIMIT TO TAKE LOAN ");
                    System.out.println("      KINDLY PLEASE TRY FOR OTHER LOANS   ");
                }
                else {
                    tol_sergery++;
                    amount = amount + 50000+3000;
                    count++;
                }
                    break;

                    case 2: System.out.println(super.r);
                            if(tol_dailysis==2)
                            {
                                System.out.println("YOU HAVE ALREADY CROSSED THE LIMIT TO TAKE LOAN ");
                                System.out.println("      KINDLY PLEASE TRY FOR OTHER LOANS   ");
                            }
                            else {
                                tol_dailysis++;
                                amount = amount + 20000+1200;
                                count++;
                            }
                                 break;

        }}

       /* void interest()
        {
            System.out.print("THE INTEREST RATES ON ALL FARMER PACKAGES PER YEAR IS   : ");
            System.out.println("4%");
            System.out.println("--------------------");
            System.out.print("THE INTEREST RATES ON ALL HOSPITAL PACKAGES PER YEAR IS : ");
            System.out.println("6%");
        }

        */

    void review()
    {
        Random r=new Random();
        int p=(int) (5*r.nextDouble());
        if(p==1)
        System.out.println("feedback is ::BAD");
        else if(p==2)
        System.out.println("feedback is ::OK");
        else if(p==3)
        System.out.println("feedback is ::SATISFACTION");
        else if(p==4)
        System.out.println("feedback is ::GOOD");
        else if(p==5)
        System.out.println("feedback is ::EXCELLENT");
        else if(p==0)
        System.out.println("NEED MORE IMPROVEMENT");
    }

    void display()
    {
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("-                                     YOUR LOAN RECEIPT                                        -");
        System.out.println("-                                          DETAILS                                             -");
        System.out.println("- DATE : "+paymentDate);
        System.out.println("-");
        System.out.println("- ADHAR CARD NO OF USER : "+adhar+   "  " +"    "    +   "   "   +"   "+"  " +  "  " +"PAN CARD NO OF USER : "+pan );
        System.out.println("-");
        System.out.println("-                                    FARMER LOAN DETAILS                                       -");
        if(no_of_seed>0 || trans_store>0)
        {
            System.out.println("- KISSAN CARD : "+kissan);
        }
        else
        {

            System.out.println("- KISSAN CARD : NULL");
        }
        System.out.println("- NO OF SEEDS PACKAGE TAKEN OF ₹ 20000  = "+ no_of_seed);
        System.out.println("- NO OF STORAGE PACKAGE TAKEN OF ₹30000 = "+ trans_store);
        System.out.println("-");
        System.out.println("-                                    HOSPITAL LOAN DETAILS                                     -");
        System.out.println("- HOSPITAL NAME : "+hospi                                         +"\n"                            );
        System.out.println("- NO OF SURGERY PACKAGE TAKEN OF  ₹ 50000 = "+ tol_sergery);
        System.out.println("- NO OF DIALYSIS PACKAGE TAKEN OF ₹ 20000 = "+ tol_dailysis);
        System.out.println("-");
        System.out.println("- FINAL RESULT  ");
        System.out.println("- TOTAL NO OF PACKAGES TAKEN : "+count);
        System.out.println("- THE TOTAL AMOUNT TO BE PAID AFTER 1 YEAR INCLUDING ALL INTERESTS = ₹ "+amount);

        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("TO KNOW ABOUT INTEREST RATES KINDLY CHECK ->KNOW ABOUT INTERESTS RATES");

    }

    void display(String i)

    {
        x=i;
        System.out.println("THE UPCOMING SERVICES "+x);
    }

    void startpoint()
    {

        int y;
        int f;
        System.out.println();
        System.out.println("---------------WELCOME TO MORTGAGE-------------- ");
        System.out.println("           WHERE WE UNDERSTAND YOUR NEEDS ");
        System.out.println();
        System.out.println("PLEASE ENTER YOUR DETAILS BELOW -> ");
        Scanner input=new Scanner(System.in);
        System.out.println(" ");
        do
        {
            System.out.println(" ENTER YOUR ADHAR CARD NO:");
            String ad = input.next();
            System.out.println(" ENTER YOUR PAN CARD NO  :");
            String pa = input.next();
            if(ad.equals(adhar)&&pa.equals(pan))
            {
                System.out.println("DETAILS VERIFIED");
                f=0;
            }
            else
            {
                System.out.println("INVALID DETAILS");
                System.out.println("-------ENTER AGAIN---------");
                f = 1;
                System.out.println(" ");
            }
        }while(f==1);

        do
        {
            System.out.println("HERE IS A LIST :");
            System.out.println("------>");
            System.out.println("       1. FARMER'S LOAN");
            System.out.println("       2. HOSPITAL LOAN");
            System.out.println("       3. KNOW ABOUT INTEREST RATES");
            System.out.println("       4. DISPLAY RECEIPT ");
            System.out.println("       5. FUTURE COMING SERVICES");
            System.out.println("       6. REVIEW");
            //System.out.println("");
            Scanner ch=new Scanner(System.in);
            System.out.print("ENTER YOUR CHOICE HERE: ");
            int a=ch.nextInt();
            switch(a)
        {

            case 1:
                System.out.println("ENTER YOUR KISSAN CARD NO");
                String kiss=hos.next();
               
                if(kiss.equals(kissan))
                {
                    Farmer();

                }
                else {
                    System.out.println("WRONG KISSAN CARD ENTERED");
                    System.out.println("****  PLEASE START AGAIN FOR SECURITY REASONS  *****");

                }
            break;
            case 2: hospital();
            break;
            case 3:ok k=new ok();
                   k.interest();
            break;
            case 4: display();
            break;
            case 5:
            display(" EDUCATIONAL LOAN");
            break;
            case 6:
            review();
            break;
            default: System.out.println("DO YOU WANT TO QUIT"+ " -------> PRESS 2 TO QUIT ");

        }

            Scanner r=new Scanner(System.in);
            System.out.println("...........................");
            System.out.print(" ->PRESS 1 TO CONTINUE  : ");
            y=r.nextInt();
        }

        while(y==1);
    }}

  class th1 extends Thread{ void det()
{


    System.out.println("               MISSIONS");
    System.out.println("TO PROVIDE BEST POSSIBLE HELP FOR NEEDY");
    try{
    Thread.sleep(100);
}
catch(InterruptedException e)
{
    System.out.println(e);
}

}
public void run()
 {
     det();
    }
}

class th2 extends Thread{
    void show()
{
    System.out.println("                 ----->>> THANKS FOR GIVING US OPPORTUNITY TO SERVE YOU                           ");
    System.out.println("                                                                            @team_MORTGAGE             ");

    try{
    Thread.sleep(10000);
}

catch(InterruptedException e)

{
    System.out.println(e);
}
}
    public void run()
    {
        show();
    }

}



class project {

    public static void main(String[] arg) {
        FileInputStream instream = null;
        FileOutputStream outstream = null;
        try {
            File infile = new File("D:\\pro.project\\filein.txt");
            File outfile = new File("D:\\pro.project\\fileout.txt");
            instream = new FileInputStream(infile);
            outstream = new FileOutputStream(outfile);
            byte[] buffer = new byte[1024];
            int len;

            while ((len = instream.read(buffer)) > 0) {
                outstream.write(buffer, 0, len);
            }
            instream.close();
            outstream.close();
            System.out.println("        LOOKING FOR SOME MONEY            " + "\n" + "      YOU HAVE COME TO RIGHT PLACE");

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        th1 tread1 = new th1();
      //  th2 tread2 = new th2();
        tread1.start();
        r obj = new r();
        obj.startpoint();
        th2 tread2 =new th2();
        tread2.start();
    }
}



//TODO: 15-04-2020