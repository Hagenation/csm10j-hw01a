import java.io.*;
import java.util.*;


public class Hw01a
    {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException
        {
        Scanner inFile = new Scanner(new FileReader("stocks.txt"));
    
        String FirstStock, SecondStock, InputStock;
        double FirstStockPrice, SecondStockPrice, InputPrice;
        int InputChoice;
        FirstStock = inFile.next();
        FirstStockPrice = inFile.nextDouble();
        SecondStock = inFile.next();
        SecondStockPrice = inFile.nextDouble();
            
        System.out.println("Enter '1' to get price by stock ticker");
        System.out.println("Enter '2' to get stocks greater than or equal to specified price");
        System.out.println("Enter '3' to quit");
        System.out.print("Your choice: ");
        InputChoice = console.nextInt();

        
        switch(InputChoice)
            {
            case 1:
                System.out.print("Enter a stock ticker: ");
                InputStock = console.next();
                if (FirstStock.equalsIgnoreCase(InputStock))
                    {
                        System.out.printf(FirstStock + " current price is %.2f %n", FirstStockPrice);
                    }
                else 
                    {                                
                        System.out.printf(SecondStock + " current price is %.2f %n", SecondStockPrice);
                    }         
                break;
            case 2:
                System.out.print("Enter a price: ");
                InputPrice = console.nextDouble();
                if (InputPrice <= FirstStockPrice)
                    {
                        System.out.printf(FirstStock + " is more than %.2f %n", InputPrice);
                        if (InputPrice <= SecondStockPrice)
                        {
                            System.out.printf(SecondStock + " is more than %.2f %n", InputPrice);
                        }
                        
                    }
                break;
            case 3:
                System.out.println("Goodbye");
            default:
                System.out.println("Unrecognized menu option, exiting");
            }
            
        }
            
    
    }
