import java.io.*;  
public class Necklace{  
public static void main(String args[])throws Exception{  
  
   InputStreamReader r=new InputStreamReader(System.in);  
   BufferedReader br=new BufferedReader(r); 


   String num1="";
   String num2="";
   int firstNum=0;
   int secNum=0;
   int latestVal=0;
   int pastVal=0;
   int sumVal=0;
   int count=1;
   boolean timeToEnd = false;
  
 
   System.out.println("Enter first number: ");
   num1=br.readLine();

   System.out.println("Enter second number: ");
   num2=br.readLine();
 
   firstNum = Integer.valueOf(num1);
   secNum = Integer.valueOf(num2);
  System.out.print(" "+firstNum);
  System.out.print(" "+secNum);
   
   pastVal = firstNum;
   latestVal = secNum;

 //  while ((count < 2) || (pastVal != firstNum && latestVal != secNum)){    // fails 
 // while ((count < 2) || (( pastVal != firstNum) && (latestVal != secNum))){    
  //  while (count < 2 || (( pastVal != firstNum) && (latestVal != secNum))){
  // while (count < 2 || (((!(pastVal == firstNum)) && (!(latestVal == secNum))))){  //fails
    while (!(pastVal == firstNum && latestVal == secNum) || count < 2){ 
      
     
    
      
//      System.out.println("firstNum : "+firstNum+" secNum : "+secNum);
//      System.out.println("pastVal : "+pastVal+" latestVal : "+latestVal);

      sumVal = pastVal + latestVal;
//      System.out.println(sumVal+" "+pastVal+" "+latestVal+" "+count);
      if (sumVal > 9){
         sumVal = sumVal - 10;
      }

//      System.out.println(" "+sumVal+" latest value");
      System.out.print(" "+sumVal);
      
      pastVal = latestVal;
      latestVal = sumVal;
//      System.out.println("sumVal    pastVal     latestVal     count     loop end");
//      System.out.println(sumVal+" "+pastVal+" "+latestVal+" "+count+" loop end");
//      System.out.println("firstNum : "+firstNum+" secNum : "+secNum);
//      System.out.println("pastVal : "+pastVal+" latestVal : "+latestVal);
      timeToEnd = (pastVal != firstNum && latestVal != secNum) ? false : true;
//      System.out.println("timeToEnd : "+timeToEnd);
      count++;
      
   }
   System.out.println("");
   System.out.println(count);
  
 br.close();
 r.close();
 }
}
