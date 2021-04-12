/**************************************
Program Name:Age
Name: David Bierbrauer
Course:CSC 101-105 Introduction to Computer Science
Due Date: Febuary 26th 2016
Program Description:This program takes the age of a person on earth and calculates how old they would be on Murcury, Venus, Jupiter, and Saturn
**************************************/

import javax.swing.*;

class Age
{//The number of earth days in the planet's one year
private static final int EARTH_DAYS_IN_MURCURY_YEAR =  88;
private static final int EARTH_DAYS_IN_VENUS_YEAR   =  225;
private static final int EARTH_DAYS_IN_JUPITER_YEAR =  4380;
private static final int EARTH_DAYS_IN_SATURN_YEAR  =  10767;
private static final int EARTH_DAYS_IN_EARTH_YEAR   =  365;


   public static void main (String []args)
   {
      int        ageOnEarth;
      int        ageOnMercury;
      int        ageOnVenus;
      int        ageOnJupiter;
      int        ageOnSaturn;
   
   
   //get input and verify the input is numeric
   ageOnEarth =Integer.parseInt
   (JOptionPane.showInputDialog( null,"Enter your age on Earth (e.g.20):"));
   
   ageOnMercury = (ageOnEarth * EARTH_DAYS_IN_EARTH_YEAR) / EARTH_DAYS_IN_MURCURY_YEAR;
   ageOnVenus = (ageOnEarth * EARTH_DAYS_IN_EARTH_YEAR) / EARTH_DAYS_IN_VENUS_YEAR;
   ageOnJupiter = (ageOnEarth * EARTH_DAYS_IN_EARTH_YEAR) / EARTH_DAYS_IN_JUPITER_YEAR;
   ageOnSaturn = (ageOnEarth * EARTH_DAYS_IN_EARTH_YEAR) / EARTH_DAYS_IN_SATURN_YEAR;
   
   JOptionPane.showMessageDialog( null,"Input - \n"+"Age on earth:"+ageOnEarth
   +" years old. \n\n" +"Output - \n"
   +"Age on mercury:" + ageOnMercury + " years old. \n"
   +"Age on venus:" + ageOnVenus + " years old. \n"
   +"Age on jupiter:" + ageOnJupiter + " years old. \n"
   +"Age on saturn:" + ageOnSaturn + " years old. \n");
   
   System.exit(0);
   }
   }