
 /*NAME : GARIMA CHOUDHARY
   CLASS: CISC 3130-TY2-FALL 2019
   DATE SUBMITTED: 11/30/2019
   Decription:In our solution code we are going to use HashMap.Java HashMap is a hash table based implementation of Java's Map interface. A Map,is a collection of key-value pairs.
   Java HashMap allows null values and the null key. HashMap is an unordered collection. It does not guarantee any specific order of  the elements
   Assignment3
  */
import java.util.*;
import java.io.*;

public class WordCount{

   private static HashMap<String, Integer> frequency = new HashMap<>();

   //function to add the data into HashMap
   //convert the words to upper case to remove case sensitivity, then replace all spaces with ',' and then split by ','
   //If word exists in the map, increase the count or add it to the map
   public static void countTheWords(String lyrics){

       String[] words = lyrics.toUpperCase().replace(" ", ",").trim().split(",");
       for(String word : words){
           Integer n = frequency.get(word);
   n = (n == null) ? 1 : ++n;
   frequency.put(word, n);
       }
       frequency.remove("");
   }

   //function to print the map
   public static void printTheWords(){
       for(Map.Entry<String, Integer> entry : frequency.entrySet()){
           System.out.println(entry.getKey()+" "+entry.getValue());
       }
   }

   public static void main(String[] args){

       File file = new File("C:\\Users\\Dell\\Desktop\\CISC3130\\Assignement 3\\lyrics.txt");
       try{
           Scanner sc = new Scanner(file);
           String lyrics;
           while(sc.hasNextLine()){
               lyrics = sc.nextLine();
               countTheWords(lyrics);
           }
           printTheWords();
       }
       catch(FileNotFoundException E){
           System.out.println("File not found");
       }
   }
}
/* OUTPUT:
 
  ----jGRASP exec: java WordCount
 PROLLY 1
 A 1
 ALL 1
 DOWN 1
 PICK 1
 MODE 1
 LOUIS 1
 I 2
 DO 1
 WE 1
 JUST 1
 'EM 2
 THE 1
 HERE 1
 DAWG 1
 DON'T 1
 BELT 1
 WINTER'S 1
 ELSE 1
 WOULD 1
 YEAH 6
 SHOW 2
 ROLL 1
 THAT'S 2
 ON 1
 SICKO 1
 IN 1
 KNOW 3
 FOR 1
 IS 1
 IT 1
 MY 1
 TRIED 2
 SUN 1
 WITH 1
 FREEZIN' 1
 HOW 1
 ALREADY 1
 YOUNG 1
 AND 1
 COLD 1
 NOTHIN' 1
 TO 2
 LAFLAME 1
 HE 3
 GONE 1
 YOU 1
 
  ----jGRASP: operation complete.
 

*/