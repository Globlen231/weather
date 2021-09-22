/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package massiv;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author pupil
 */
public class Massiv {
    private static Object months;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //min i max temp
        int min=-30, max=30;
        //zub4atqi massiv 12 strok
        int[][] dayTempInYear = new int [12][];
        dayTempInYear[0] = new int[31]; //janvar
        dayTempInYear[1] = new int[28]; //fevral
        dayTempInYear[2] = new int[31]; //mart
        dayTempInYear[3] = new int[30]; //aprel
        dayTempInYear[4] = new int[31]; //mai
        dayTempInYear[5] = new int[30]; //ijun
        dayTempInYear[6] = new int[31]; //ijul
        dayTempInYear[7] = new int[31]; //avgust
        dayTempInYear[8] = new int[30]; //sentabr
        dayTempInYear[9] = new int[31]; //oktabr
        dayTempInYear[10] = new int[30]; //nojabr
        dayTempInYear[11] = new int[31]; //dekabr
        Random random = new Random();
        for(int i=0;i<dayTempInYear.length; i++){
            for(int j =0; j<dayTempInYear[i].length; j++){
                if((i==11 || i==0 || i==1)){
                    min=-30;
                    max=0;
                }else if(i==2 || i==3 || i==4){
                    min=5;
                    max= 15;
                }else if(i==5 || i==6 || i==7){
                    min = 10;
                    max = 30;
                }else if(i==8 || i==9 || i==10){
                    min= -10;
                    max =10;
                }
                dayTempInYear[i][j]=random.nextInt(max-min+1)+min;
            }
        }
        for(int i =0; i<dayTempInYear.length; i++){
            for(int j =0; j<dayTempInYear[i].length; j++){
                System.out.printf("%4d",dayTempInYear[i][j]);  
    }
            System.out.println();
    }
        double []averageTemperaturInMonth=new double[12];
        for(int i=0;i<dayTempInYear.length;i++){
            int daysInMonth = 0;
            for(int j=0;j<dayTempInYear[i].length;j++){
                averageTemperaturInMonth[i]+=(double)dayTempInYear[i][j];
                daysInMonth=j+1;
            }
            averageTemperaturInMonth[i]=averageTemperaturInMonth[i]/daysInMonth;
        }
        System.out.println("sredjaa temp po mesjacam");
        for(int i=0;i<averageTemperaturInMonth.length;i++){
            switch (i){
                case 0:
                    System.out.printf("janvar: %-4.2f%n",averageTemperaturInMonth[i]);
                    break;
                case 1:
                    System.out.printf("fevral: %-4.2f%n",averageTemperaturInMonth[i]);
                    break;
                case 2:
                    System.out.printf("mart: %-4.2f%n",averageTemperaturInMonth[i]);
                    break;
                case 3:
                    System.out.printf("aprel: %-4.2f%n",averageTemperaturInMonth[i]);
                    break;
                case 4:
                    System.out.printf("mai: %-4.2f%n",averageTemperaturInMonth[i]);
                    break;
                case 5:
                    System.out.printf("ijun: %-4.2f%n",averageTemperaturInMonth[i]);
                    break;
                case 6:
                    System.out.printf("ijul: %-4.2f%n",averageTemperaturInMonth[i]);
                    break;
                case 7:
                    System.out.printf("avgust: %-4.2f%n",averageTemperaturInMonth[i]);
                    break;
                case 8:
                    System.out.printf("sentabr: %-4.2f%n",averageTemperaturInMonth[i]);
                    break;
                case 9:
                    System.out.printf("oktabr: %-4.2f%n",averageTemperaturInMonth[i]);
                    break;
                case 10:
                    System.out.printf("nojabr: %-4.2f%n",averageTemperaturInMonth[i]);
                    break;
                case 11:
                    System.out.printf("dekabr: %-4.2f%n",averageTemperaturInMonth[i]);
                    break;
                   
            }
        }
    }
}