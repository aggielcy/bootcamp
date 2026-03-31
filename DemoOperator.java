public class DemoOperator {
  public static void main(String[]args){

   int remainder = 5 % 2;
   System.out.println(remainder);//1
   System.out.println(5 % 6);//5

    int a= 10;
    a = a +1;//11
    a+=1;//12
    a++;//13
    ++a;//14
    System.out.println(a);// 14


   double hourRate = 40.5;
   int hourPerDay = 7;
   double todaySalary = hourRate * hourPerDay;
   System.out.println(todaySalary);

   int g = 10;
   g++;
   ++g;
   System.out.println(g);

   int k = g++ * 2;
   System.out.println(k); //24
   System.out.println(g); //13







  }
}