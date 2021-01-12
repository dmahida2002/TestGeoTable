
// Deeshan  M. Period 2 AP CompSci
// Completed on October 29 2020
// Updated on November 9 2020

import java.util.*;
public class TestGeoClass {
    public static void main(String args[]) {
     
      int count = 0;
      int upper = 8;
      int lower = 2;
      int sentinel = 0;
      int trigger = 0;
      int tries = 0;
      int cylinderCount = 0;
      int rectangularCount = 0;
      
      double inputHeightUpper = 20;
      double inputHeightLower = 2;
      double inputRadiusUpper = 10;
      double inputRadiusLower = 1;
      double inputWidthUpper = 30;
      double inputWidthLower = 8;
      double inputLengthUpper = 15;
      double inputLengthLower = 3;
      
      ArrayList<Double> arraySA = new ArrayList<>();
      ArrayList<Double> arrayV = new ArrayList<>();
      
      ArrayList<Double> arraySAC = new ArrayList<>();
      ArrayList<Double> arraySAR = new ArrayList<>();
      ArrayList<Double> arrayVC = new ArrayList<>();
      ArrayList<Double> arrayVR = new ArrayList<>();
      
      sentinel = (int)(Math.random()*(upper - lower + 1) + lower);
     
      while(sentinel != trigger) {
         
          count = count + 1;
         
          GeoSolid GS = new GeoSolid(inputHeightUpper, inputHeightLower, inputRadiusUpper, inputRadiusLower, inputWidthUpper, inputWidthLower, inputLengthUpper, inputLengthLower);
          
          trigger = (int)(Math.random()*(upper - lower + 1) + lower);
          
          System.out.println(count + ") " + GS);
          
          if(GS.solidType == 0) {
              
              cylinderCount = cylinderCount + 1;
              
              arraySAC.add(GS.getArea());
              arrayVC.add(GS.getVolume());
          }//end if
          
          else if(GS.solidType == 1) {
              
              rectangularCount = rectangularCount + 1;
              
              arraySAR.add(GS.getArea());
              arrayVR.add(GS.getVolume());
          }//end else if
          
          arraySA.add(GS.getArea());
          arrayV.add(GS.getVolume());
          
          tries = tries + 1;
      }//end while
      
      MiscUtils MU = new MiscUtils();
      
      System.out.println("\nThe trigger was: " + trigger);
      System.out.println("The sentinel has the final answer of: " + sentinel);
      System.out.println("It took " + tries + " attempts to activate the trigger\n\n");
      
      MU.FindAvgs(arraySAC, arrayVC, arraySAR, arrayVR, cylinderCount, rectangularCount);
      MU.FindSTDDev(arraySAC, arrayVC, arraySAR, arrayVR, cylinderCount, rectangularCount);
      
    }//end main
}//end TestGeoClass
