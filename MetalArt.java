/***********************************************
 * Java Program Name: MetalArt.java
 ***********************************************
 * Project description: This project displays the area and costs of building a model sculpture 
 * based on user input for the size of the pyramids and rectangular prism.
 * ______________________________________________
 * Cuong Ngo
 * Version Date: 02/08/19
 * CMSC-255-002
 **********************************************/
import java.util.Scanner;
import java.lang.Math;


public class MetalArt
{
   public static void main(String[] args)
   {
	   // The following lines of code will display some information about this project 
      
	  System.out.println("Cuong Ngo");
      System.out.println("Project 2 - MetalArt");
	  System.out.println("This project displays the area and costs of building a model sculpture based on user input for the size of the pyramids and rectangular prism.");
      System.out.println("February 08, 2019");
	  System.out.println("CMSC 255 Section 002");
	  System.out.println(" ");
	  
	  Scanner scnr = new Scanner (System.in);
	  
	  /* The following lines of code will first ask the user to input their Pentagon name, 
	   * the length of the base of the first, and second pyramid, 
	   * the height of the first, and second pyramid,
	   * the height of the rectangular prism,
	   * the length of the rectangular prism,
	   * and the width of the rectangular prism.
	   * All the inputs above will be in inches except for the name of the Pentagon input.
	  */
	  
	  String pentName;
	  System.out.print("Enter the name of the pentagon: ");
	  pentName = scnr.nextLine();
	  
	 
	  double firstBase;
	  System.out.print("Enter the length of the base of the first pyramid (inches): ");
	  firstBase = scnr.nextDouble();
	  
	  double firstHeight;
	  System.out.print("Enter the height of the first pyramid (inches): ");
	  firstHeight = scnr.nextDouble();
	  
	  double secondBase;
	  System.out.print("Enter the length of the base of the second pyramid (inches): ");
	  secondBase = scnr.nextDouble();
	  
	  double secondHeight;
	  System.out.print("Enter the height of the second pyramid (inches): ");
	  secondHeight = scnr.nextDouble();
	  
	  double prismHeight;
	  System.out.print("Enter the height of the rectangular prism (inches): ");
	  prismHeight = scnr.nextDouble();
	  
	  double prismLength;
	  System.out.print("Enter the length of the rectangular prism (inches): ");
	  prismLength = scnr.nextDouble();
	  
	  double prismWidth;
	  System.out.print("Enter the width of the rectangular prism (inches): ");
	  prismWidth = scnr.nextDouble();
	  
	  System.out.println(" ");
	  
	  
	  /* The following lines of code will calculate, based on the user's inputs:
       * the area of the base of the first and second pyramid,
       * the slant length of the first and second pyramid,
       * the surface area of both pyramids,
       * the surface area of the rectangular prism,
	   * the total surface area
	  */
	  
	  //First pyramid's base area
	  double firstBaseArea;
	  firstBaseArea = (0.5) * firstBase * Math.sqrt((Math.pow(firstBase, 2)) - (Math.pow(((0.5) * firstBase), 2))); // Calculates base area of first pyramid
	
	  
	  //Second pyramid's base area
	  double secondBaseArea;
	  secondBaseArea = (0.5) * secondBase * Math.sqrt((Math.pow(secondBase, 2)) - (Math.pow(((0.5) * secondBase), 2))); // Calculates base area of second pyramid

	  
	  //First pyramid's slant height
	  double firstSlant;
	  firstSlant = Math.sqrt((Math.pow((0.5) * firstBase, 2) + Math.pow(firstHeight, 2))); //Calculates slant length of first pyramid 
	 
	  
	  //Second pyramid's slant height
	  double secondSlant;
	  secondSlant = Math.sqrt((Math.pow((0.5) * secondBase, 2) + Math.pow(secondHeight, 2))); //Calculates slant length of second pyramid 
	  
	  
	  //Surface Area of the first pyramid
	  double firstSA;
	  firstSA = firstBaseArea + 0.5 * (3 * firstBase * firstSlant);
	  
	  
	  //Surface Area of the second pyramid
	  double secondSA;
	  secondSA = secondBaseArea + 0.5 * (3 * secondBase * secondSlant);
	  
	  
	  //Surface Area of the rectangular prism
	  double prismSA;
	  prismSA = (2 * prismLength * prismWidth) + (2 * prismLength * prismHeight) + (2 * prismWidth * prismHeight);
	
	  
	  //Total Surface Area
	  double totalSA;
	  totalSA = firstSA + secondSA + prismSA;
	  
	  
	  //The following lines of code will calculate the total cost of the material to build user's pentagon
	  double totalCost;
	  totalCost = 1.67 * totalSA;
	  
	  
	  
	  
	  /* The following lines of code will display the calculations based on the inputs. They will show, in inches:
	   * The surface area of the first pyramid, the surface area of the second pyramid,
	   * the surface area of the rectangular prism,
	   * the total surface area,
       * and finally, the total cost of the material to build the Pentagon. 
      */	   
	  
	  
	  System.out.println("The " + pentName + " surface area calculations are: ");
	  
      // The lines below prints the surface area of the first pyramid
	  System.out.print("     Surface area of the first pyramid: ");
	  System.out.printf("%,2.2f", firstSA); 
	  System.out.println(" square inches");
	  
	  // The lines below prints the surface area of the second pyramid
	  System.out.print("     Surface area of the second pyramid: "); 
	  System.out.printf("%,2.2f", secondSA);
	  System.out.println(" square inches");
	  
	  // The lines below prints the surface area of the rectangular prism
	  System.out.print("     Surface area of the rectangular prism: ");
	  System.out.printf("%,2.2f", prismSA);
	  System.out.println(" square inches");
	  
	  // The lines below prints the total surface area 
	  System.out.print("     Total Surface area: ");
	  System.out.printf("%,2.2f", totalSA);
	  System.out.println(" square inches");
	  
	  // The lines below prints the total material cost
	  System.out.print("The total cost of the material to build " + pentName + " is $");
	  System.out.printf("%,2.2f", totalCost);
	 
	  
	  
	  
	  
	  
	  
	}
}	
	