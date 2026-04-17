import java.time.LocalDate;
import java.time.Month;

public class DemoDate {
  public static void main(String[] args) {
    

    LocalDate ld1 = LocalDate.of(2014, 12, 31);
    System.out.println(ld1); //2014-12-31

    System.out.println(ld1.getMonthValue());//12
    System.out.println(ld1.getYear());
    System.out.println(ld1.getDayOfWeek()); //WEDNESDAY

    LocalDate today = LocalDate.now();  //run the system run date
    LocalDate joinDate = LocalDate.now();
    LocalDate probabtionDate = joinDate.plusMonths(3L); //<--need to put double value into the blanket, no reason, the formula need
    System.out.println(probabtionDate); //2026-07-09

    LocalDate firstDateOfYear = LocalDate.of(2026, 1, 1);
    LocalDate yearEnd = firstDateOfYear.minusDays(1L);
    System.out.println(yearEnd);

    Month month = joinDate.getMonth();
    System.out.println(month); // APRIL

    //isBefore
    if (probabtionDate.isBefore(LocalDate.of(2026,7,10)));{
      System.out.println("yes.before 2026-07-10");
    }
    //isAfter
    if (probabtionDate.isAfter(LocalDate.of(2026, 7, 8)));{
      System.out.println("yes.after 2026-07-8 ");
    }
    // equals
    if(probabtionDate.equals(LocalDate.of(2026, 7, 9)));{
      System.out.println("yes.equal 2026-07-9 ");
    }

    System.out.println(LocalDate.of(2100, 1, 1).isLeapYear()); // false
    System.out.println(LocalDate.of(2004, 1, 1).isLeapYear()); // true
    System.out.println(joinDate.isLeapYear()); // false (2026)

    







  }
  
}
