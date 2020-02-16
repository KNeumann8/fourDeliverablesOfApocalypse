import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateTimes {

    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("ddMMyyyy");


        LocalDate theJoshuaTree = LocalDate.of(1987,3,9);
        LocalDate rattleAndHum = LocalDate.of(1988,10,10);
        LocalDate now = LocalDate.now();

        //#2
        Period dif = Period.between(theJoshuaTree,rattleAndHum);

        System.out.println(dif.getYears()+" years, "+dif.getMonths()+" months and "+dif.getDays()+" days are between the two albums.");

        //#1
        Period dif2 = Period.between(theJoshuaTree,now);

        System.out.println(dif2.getYears()+" years, "+dif2.getMonths()+" months and "+dif2.getDays()+" days have elapsed since the joshua tree.");

        //#3
        LocalDate future = rattleAndHum.plus(dif);

        System.out.println("On "+future.getMonthValue()+"/"+future.getDayOfMonth()+"/"+future.getYear()+" the prophecy predicts the coming of a new album.");


    }

}
