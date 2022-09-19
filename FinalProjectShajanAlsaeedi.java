
package finalprojectshajanalsaeedi;

import java.util.Scanner;
import java.io.*;
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class FinalProjectShajanAlsaeedi {

   
    public static void display(){
        System.out.println(" ----------------------------------------------------------------");
        System.out.println(" ----------------------------------------------------------------");
        System.out.println("\n\t      ❃ ❃  W E L C O M E TO PLANT WORLD  ❃ ❃ \t\n");
        System.out.println(" ----------------------------------------------------------------");
        System.out.println(" ----------------------------------------------------------------");
    }
    
     /** Method read from file
      * @param fileName
      * @param ord_all
      * @param eOrder
      */
    public static void ReadFile( String fileName , ArrayList<order> ord_all , order eOrder)
            throws IOException{
    
        double sum = 0;
        FileReader read = new FileReader(fileName);
        BufferedReader br = new BufferedReader(read);

        String line = br.readLine();
        // Loop until you are at the end of the file
        while (line != null) {
             
            if (fileName == "totalOrder.txt") 
            sum += Double.parseDouble(line);
          
            line = br.readLine();
        }
           
         br.close();

        if (sum != 0) {
        write("order.txt",sum);
       
        }

       
    }
    // ------------------------------------------------------------------------
    /** Method write in file .. */
    
    public static void writeInFile(String nameFile , String all)
            throws IOException {

        FileWriter fw = new FileWriter(nameFile,true);
        PrintWriter pr = new PrintWriter(fw);
        pr.println(all);
        pr.close();
    }
    //-------------------------------------------------------------------------
     /** Method write numbers in file .. */
    public static void write(String nameFile , double s)
            throws IOException {

        FileWriter fw = new FileWriter(nameFile,true);
        PrintWriter pr = new PrintWriter(fw);
        
        pr.println(s);
    
        pr.close();
    }
     /** Method write Array in file .. */
    public static void writeArray(String nameFile , ArrayList <order> ord)
            throws IOException {

        FileWriter fw = new FileWriter(nameFile,true);
        PrintWriter pr = new PrintWriter(fw);
        pr.print(ord);
        pr.close();
    }
    //--------------------------------------------------------------------------
     /** Method ask user type of plant.
      * it is call other methods to write and read files  ..
      * @param nameChoose
      * @param  p1 & p2 & p3
      * @param o1 & o2 & o3
      * @param allorder
      */
    public static void askUser(String nameChoose , plant p1 , plant p2 
            ,plant p3 ,order o1 , order o2 ,
            order o3 , ArrayList<order> allorder ) throws IOException
    {
        if (nameChoose.equalsIgnoreCase(p1.getNamePlant()))
        {
             allorder.add(o1);
            // write & read information in file.
            writeInFile("order.txt", o1.toString());
            // read from file
            ReadFile("order.txt", allorder , o1 );
            
            // get total and print it in file 
            write("totalOrder.txt", p1.getPricePlant());
            ReadFile("totalOrder.txt" , allorder , o1);
           
            // print done task ✔ ..
            System.out.println("✔|Done add the order");
            

        } else if (nameChoose.equalsIgnoreCase(p2.getNamePlant())) {

            allorder.add(o2);
            // write & read plant information in file.
            writeInFile("order.txt", o2.toString());
            ReadFile("order.txt", allorder, o2);

//            // get total and print it in file 
            write("totalOrder.txt", p2.getPricePlant());
            ReadFile("totalOrder.txt", allorder, o2);
            // print done task ✔ ..
            System.out.println("✔|Done add the order");


        } else if (nameChoose.equalsIgnoreCase(p3.getNamePlant())) {

            allorder.add(o3);
            // write & read plant information in file.
            writeInFile("order.txt", o3.toString());
            ReadFile("order.txt", allorder , o3 );

            // get total and print it in file 
            write("totalOrder.txt", p3.getPricePlant());
            ReadFile("totalOrder.txt", allorder, o3);
            // print done task ✔ ..
            System.out.println("✔|Done add the order");


         } else
            
        System.out.println("there is not found in nursery :(");
             
       
    }
    //------------------------------------------------------------------------
    
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
    Scanner keyboard = new Scanner (System.in); 
    
            int count = 0;           // counter to calculate numbers plants.
        // Objects of class "userService" .. 
        
        userService user1 = new userService("ShajanAlsaeedi", "0567077211",
                "female"); // without age .. 
        // input user information ..
        userService user2 = new userService();

        // Objects of class "nurseryOwner" .. 
        nurseryOwner sara = new nurseryOwner("sara ahmad", "0545644233", "female",
                22, "Sara Nursery", "jeddah");
        nurseryOwner ali = new nurseryOwner(" Ali ahmad", "05422244233", "male",
                27, "Ali Nursery", "jeddah");
        nurseryOwner fatemah = new nurseryOwner("fatemah", "05456443213", "female",
                33, "Fatemah Nursery", "makkah");

        // Objects of class "plant" ..
        plant p = new plant (); // deafult ..
        plant pS1 = new plant("Yucca", Size.small, 21.2);
        plant pS2 = new plant("SunFlower", Size.medium, 13.2);
        plant pS3 = new plant("Rose", Size.small, 22.2);

        plant pA1 = new plant("Lemone", Size.medium, 3.2);
        plant pA2 = new plant("Bamboo", Size.large, 11.3);
        plant pA3 = new plant("Pothos", Size.small, 4.3);

        plant pF1 = new plant("lavender", Size.large, 4.3);
        plant pF2 = new plant("Alovera", Size.small, 5.5);
        plant pF3 = new plant("violet", Size.small, 10.22);

        // Objects of class "order" .. 
        order o = new order(); // deafult.
        order orderS1 = new order(user2, sara, pS1);
        order orderS2 = new order(user2, sara, pS2);
        order orderS3 = new order(user2, sara, pS3);

        order orderAli1 = new order(user2, ali, pA1);
        order orderAli2 = new order(user2, ali, pA2);
        order orderAli3 = new order(user2, ali, pA3);

        order orderFa1 = new order(user2, fatemah, pF1);
        order orderFa2 = new order(user2, fatemah, pF2);
        order orderFa3 = new order(user2, fatemah, pF3);

        // Array list of Objects .. 
        ArrayList<nurseryOwner> allOwner = new ArrayList<>();
        ArrayList<order> orderList = new ArrayList<>();
//-----------------------------------------------------------------------------

        char returnMain = 'Y';
        String enter;
        while(returnMain != 'N'){
       
        int choice;
        // print welcome to user ..
        display();
        
        System.out.println("\nWe are provide a service for buying and selling"
         + " plants\n\tEnter (1) for buy plants.\n\tEnter (2) To only communicate "
                + "with the owners of the nurseries\n");
        choice=keyboard.nextInt();
        // input Validation
        
        while(choice!=1 && choice !=2){
         System.out.println("PLEASE TRY AGAIN .. ENTER ONLY 1 OR 2");   
         choice=keyboard.nextInt();   
        }
        
        switch(choice){
            case 1:

                try {

                    String line;

                    // ask user ..
                    System.out.println("Enter your name:");
                    user2.setName(keyboard.next());
                    line = keyboard.nextLine();
                    // ask user ..
                    System.out.println("Enter your number:");
                    user2.setNumber(keyboard.next());
                    // next line
                    line = keyboard.nextLine();
                    // ask user ..
                    System.out.println("Enter your gender:");
                    String gender = keyboard.next();
                    // input Validation gender ..
                    while (!(gender.equalsIgnoreCase("female") || 
                            gender.equalsIgnoreCase("male"))) {
                        System.out.println("please enter your gender"
                                + " (female or male)");
                        gender = keyboard.next();
                    }
                    user2.setGender(gender);

                    // ask user ..
                    System.out.println("Enter your age:");
                    int age = keyboard.nextInt();
                    // input Validation age ..
                    while (age <= 10 || age >= 90) {
                        System.out.println("please .. Enter your age correct :");
                        age = keyboard.nextInt();
                    }
                    user2.setAge(age);

                }
                catch (InputMismatchException e) {
                    System.out.println("try again,input mismatch");
                }
    
                char again = 'y';
                String input;
                String nameChoose = "";  // name of plant user choose it .

                while (again != 'n'){
                    System.out.println("please enter number nursery:"
                            + "\n\t1: ** SARA **\n\t2: ** ALI **"
                            + "\n\t3: ** FATEMAH **");
                    int choose;
                    choose = keyboard.nextInt();

    switch(choose){
        case 1:

            sara.addPlant(pS1);
            sara.addPlant(pS2);
            sara.addPlant(pS3);

            // Display list of plant Sara ..
            sara.PrintDetails();
            // Ask user input plant name.
            System.out.println("Enter name PLANT want choose it");
            nameChoose = keyboard.next();
            // take arguments to call method "askUser" 
            askUser(nameChoose, pS1, pS2, pS3, orderS1, orderS2,
                     orderS3, orderList);
          
            break;
       
        case 2:
            // Add to Arraylist "plant" of class "nurseryOwner" 
            ali.addPlant(pA1);
            ali.addPlant(pA2);
            ali.addPlant(pA3);
            // Display list of plant Ali ..
            ali.PrintDetails();
            // Ask user input plant name.
            System.out.println("Enter name PLANT want choose it");
            nameChoose = keyboard.next();
            askUser(nameChoose, pA1, pA2, pA3, orderAli1,
                     orderAli2, orderAli3, orderList);
           
            break;
            
        case 3:
            fatemah.addPlant(pF1);
            fatemah.addPlant(pF2);
            fatemah.addPlant(pF3);

            // Display list of plant Fatemah ..
            fatemah.PrintDetails();
            // Ask user input plant name.
            System.out.println("Enter name PLANT want choose it");
            nameChoose = keyboard.next();
            askUser(nameChoose, pF1, pF2, pF3, orderFa1, orderFa2,
                     orderFa3, orderList);
           
            break;
            default:
                System.out.println("NOT EXIT !");
                break;
        }
    
        System.out.println("\t\tDo you need add more plants?\t\t\n\t\t\t(enter Y / N)\t");
         input = keyboard.next().toLowerCase();
         again= input.charAt(0);
         count++;
                }
               
                  // write after read from file.
          writeArray("finalOrder.txt", orderList);
          
       System.out.println("\nThe order was successful :) in file \"finalOrder.txt\"\nTHANKS."); 
        exit(0);
                
                case 2:
                    // print all information of owners .. 
                    allOwner.add(ali);
                    allOwner.add(fatemah);
                    allOwner.add(sara);

                    for (int i = 0; i < allOwner.size(); i++) {
                        System.out.println(allOwner.get(i));
                   }
                   break;
                   
                   
            }
   
                    System.out.println("\n\t\tRETURN TO THE MAIN ( enter Y / N )\t\t");
                    enter = keyboard.next().toUpperCase();
                    returnMain = enter.charAt(0);
                
                    
                    
     
        }
       System.out.print("\n----- END  PROGRAM  THANKS ----\n");
        
        
                         /** MY PROGRAM END .. THANKS */
                        /** Shajan Abdulkhaliq Alsaeedi */
                         

          

    }
    }


    
    




    

