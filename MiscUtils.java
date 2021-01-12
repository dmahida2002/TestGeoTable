
import java.util.*;

public class MiscUtils {
    
    /*******************************************************************/
    /*                                                                 */
    /*                            FindAvgs                             */
    /*                                                                 */
    /*******************************************************************/
    
    public static String FindAvgs(ArrayList<Double> CSA, ArrayList<Double> CV, ArrayList<Double> RSA, ArrayList<Double> RV, int c, int r) {
        
        String message = "";
        String asterisks="|*******************|*******************|*******************|*******************|";
        
        double cylinderSAAverage = 0;
        double cylinderVAverage = 0;
        double rectangleSAAverage = 0;
        double rectangleVAverage = 0;
      
      for(int i = 0; i < CSA.size(); i++) {
          
          cylinderSAAverage = (cylinderSAAverage + CSA.get(i));
      }//end for
      
      cylinderSAAverage = (cylinderSAAverage / CSA.size());
      
      for(int i = 0; i < CV.size(); i++) {
          
          cylinderVAverage = (cylinderVAverage + CV.get(i));
      }//end for
      
      cylinderVAverage = (cylinderVAverage / CV.size());
      
      for(int i = 0; i < RSA.size(); i++) {
          
          rectangleSAAverage = (rectangleSAAverage + RSA.get(i));
      }//end for
      
      rectangleSAAverage = (rectangleSAAverage / RSA.size());
      
      for(int i = 0; i < RV.size(); i++) {
          
          rectangleVAverage = (rectangleVAverage + RV.get(i));
      }//end for
      
      rectangleVAverage = (rectangleVAverage / RV.size());
      
      System.out.printf("%s\n",asterisks);
      System.out.printf("|%-19s|%-19s|%15s|%-7s|\n", "      Count", "    Solid Type ", "  Avg Surface Area ", "    Avg Volume     ");
      System.out.printf("%s\n",asterisks);
      System.out.printf("|       %-12s|%-19s|     %-14s|%14s     |\n", c, "     Cylinder ", (String.format("%.4f", cylinderSAAverage)), (String.format("%.4f", cylinderVAverage)));
      System.out.printf("%s\n",asterisks);
      System.out.printf("|       %-12s|%-19s|     %-14s|%14s     |\n", r, " Rectangular Prism", (String.format("%.4f", rectangleSAAverage)), (String.format("%.4f", rectangleVAverage)));
      System.out.printf("%s\n",asterisks);
      System.out.println("\n");
        
        return message;
    }//end FindAvgs
    
    /*******************************************************************/
    /*                                                                 */
    /*                           FindSTDDev                            */
    /*                                                                 */
    /*******************************************************************/
    
    public static String FindSTDDev(ArrayList<Double> CSA, ArrayList<Double> CV, ArrayList<Double> RSA, ArrayList<Double> RV, int c, int r) {
        
        String message = "";
        String asterisks="|*******************|*******************|************************|********************|";
        
        double cylinderSASTD = 0;
        double cylinderVSTD = 0;
        double rectangleSASTD = 0;
        double rectangleVSTD = 0;
        double cylinderSAAverage = 0;
        double cylinderVAverage = 0;
        double rectangleSAAverage = 0;
        double rectangleVAverage = 0;
        
        double CSTDSA = 0;
        double CSTDV = 0;
        double RSTDSA = 0;
        double RSTDV = 0;
      
      for(int i = 0; i < CSA.size(); i++) {
          
          cylinderSAAverage = (cylinderSAAverage + CSA.get(i));
      }//end for
      
      cylinderSAAverage = (cylinderSAAverage / CSA.size());
      
      for(int i = 0; i < CV.size(); i++) {
          
          cylinderVAverage = (cylinderVAverage + CV.get(i));
      }//end for
      
      cylinderVAverage = (cylinderVAverage / CV.size());
      
      for(int i = 0; i < RSA.size(); i++) {
          
          rectangleSAAverage = (rectangleSAAverage + RSA.get(i));
      }//end for
      
      rectangleSAAverage = (rectangleSAAverage / RSA.size());
      
      for(int i = 0; i < RV.size(); i++) {
          
          rectangleVAverage = (rectangleVAverage + RV.get(i));
      }//end for
      
      rectangleVAverage = (rectangleVAverage / RV.size());
      
      for(int i = 0; i < CSA.size(); i++) {
          
          cylinderSASTD = (cylinderSASTD + Math.pow((CSA.get(i) - cylinderSAAverage), 2) / CSA.size());
      }//end for
      
      for(int i = 0; i < CV.size(); i++) {
          
          cylinderVSTD = (cylinderVSTD + Math.pow((CV.get(i) - cylinderVAverage), 2) / CV.size());
      }//end for
      
      for(int i = 0; i < RSA.size(); i++) {
          
          rectangleSASTD = (rectangleSASTD + Math.pow((RSA.get(i) - rectangleSAAverage), 2) / RSA.size());
      }//end for
      
      for(int i = 0; i < RV.size(); i++) {
          
          rectangleVSTD = (rectangleVSTD + Math.pow((RV.get(i) - rectangleVAverage), 2) / RV.size());
      }//end for
      
      CSTDSA = Math.sqrt(cylinderSASTD);
      CSTDV = Math.sqrt(cylinderVSTD);
      RSTDSA = Math.sqrt(rectangleSASTD);
      RSTDV = Math.sqrt(rectangleVSTD);
      
      System.out.printf("%s\n",asterisks);
      System.out.printf("|%-19s|%-19s|%15s|%-7s|\n", "      Count", "    Solid Type ", "  Surface Area Std Dev  ", "    Volume Std Dev  ");
      System.out.printf("%s\n",asterisks);
      System.out.printf("|       %-12s|%-19s|        %-16s|%15s     |\n", c, "     Cylinder ", (String.format("%.4f", CSTDSA)), (String.format("%.4f", CSTDV)));
      System.out.printf("%s\n",asterisks);
      System.out.printf("|       %-12s|%-19s|        %-16s|%15s     |\n", r, " Rectangular Prism", (String.format("%.4f", RSTDSA)), (String.format("%.4f", RSTDV)));
      System.out.printf("%s\n",asterisks);
        
        return message;
    }//end FindSTDDev
}//end MiscUtil
