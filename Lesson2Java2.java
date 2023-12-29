package lesson2Java2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson2Java2 {
public static void main(String... args){
scan();
}
//try {
//        mathematic(2, 0);
//    } catch (ArithmeticException e)
//    {System.out.print("/ by ZERO"); e.printStackTrace();}
public static void mathematic(int a, int b){
int q=a/b;}
public static void scan(){
   try{ Scanner scanner= new Scanner(new File("src/proba.txt"));
    while (scanner.hasNextLine()){
        System.out.print(scanner.nextLine());
    }
}catch (FileNotFoundException e){
       System.out.println("file not found");
       e.printStackTrace();
   }
}
    public static void scanTrows() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/proba.txt"));
            while (scanner.hasNextLine()) {
                System.out.print(scanner.nextLine());
            }
//        }catch (FileNotFoundException e){
//            System.out.println("file not found");
//            e.printStackTrace();

        }
        public static void generateMegaDangerosExeption(){
    throw new MyMegaDangerousExeption("danger!!!");
        }
    public static void scanTry(){
        try (Scanner scanner= new Scanner(new File("src/proba.txt"));){
            while (scanner.hasNextLine()){
                System.out.print(scanner.nextLine());}
            }
        catch (FileNotFoundException e){
            System.out.println("file not found");
            e.printStackTrace();
        }
    }
}
