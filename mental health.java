import java.util.*;
import java.util.Scanner;
public class MyClass {
    
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in); 
         String[] names = new String[2];
         String[] lastnames = new String[2];
         String[] date = new String[2];
         String[] doctornames = new String[2];
         int[] sccores = new int[2];
         
        
        for (int i = 0; i < names.length; i++) { 
            System.out.print("please Enter your name " + (i + 1) + ": "); 
            names[i] = scanner.nextLine(); 
            System.out.print("please Enter your lastname " + ": "); 
            lastnames[i] = scanner.nextLine();
            System.out.print("please Enter date " + ": "); 
            date[i] = scanner.nextLine();
            System.out.print("please Enter your doctor names " + (i + 1) + ": "); 
            doctornames[i] = scanner.nextLine();
        }
        
        for (int i = 0; i < names.length; i++) {
            int score = 0;
            System.out.print("please answer all the quastion with yes or no "+names[i]+ "\r\n");

            while (true) {
            System.out.print("are you happy in your life ? ");
            String answer = scanner.nextLine();
           
            if(answer.equals("yes")){
                score +=20;
                break;
            }else if(answer.equals("no")){
                break;
            }
            else{
              System.out.print("wrong answer!!!" + "\r\n");
            }
            }
            while (true) {
            System.out.print("Do you have many friends ? ");
            String answer = scanner.nextLine();
           
            if(answer.equals("yes")){
                score +=20;
                break;
            }else if(answer.equals("no")){
                break;
            }
            else{
              System.out.print("wrong answer!!!" + "\r\n");
            }
            }
            while (true) {
            System.out.print("Are you strong in your relationships with other people ? ");
            String answer = scanner.nextLine();
           
            if(answer.equals("yes")){
                score +=20;
                break;
            }else if(answer.equals("no")){
                break;
            }
            else{
              System.out.print("wrong answer!!!" + "\r\n");
            }
            }
            while (true) {
            System.out.print("Can you rest well ? ");
            String answer = scanner.nextLine();
           
            if(answer.equals("yes")){
                score +=20;
                break;
            }else if(answer.equals("no")){
                break;
            }
            else{
              System.out.print("wrong answer!!!" + "\r\n");
            }
            }
            while (true) {
            System.out.print("Do you have a beautiful past in your life ? ");
            String answer = scanner.nextLine();
           
            if(answer.equals("yes")){
                score +=20;
                break;
            }else if(answer.equals("no")){
                break;
            }
            else{
              System.out.print("wrong answer!!!" + "\r\n");
            }
            }
            
            sccores[i] = score;
        }
        
        for(int i = 0; i < names.length;i++)
        {
            if(sccores[i]==0){
                System.out.print(names[i] +" "+lastnames[i]+ " your mental health is so bad you must see a doctor"+"\r\n");
            }
            else if(sccores[i]==20){
                System.out.print(names[i] +" "+lastnames[i]+ " your mental health is so bad"+"\r\n");
            }
             else if(sccores[i]==40){
                System.out.print(names[i] + " "+lastnames[i]+" your mental health is good"+"\r\n");
            }
            else if(sccores[i]==60){
                System.out.print(names[i] + " "+lastnames[i]+" your mental health is very good"+"\r\n");
            }
            else if(sccores[i]==80){
                System.out.print(names[i] + " "+lastnames[i]+" your mental health is wonderful"+"\r\n");
            }
            else if(sccores[i]==100){
                System.out.print(names[i] + " "+lastnames[i]+" Your mental health is very well"+"\r\n");
            }
        }
        
        
        
    }
}