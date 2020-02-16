import java.math.BigDecimal;

public class bigDecimals {

    public static void main(String[] args) {

        BigDecimal wisc = new BigDecimal(5726398);
        BigDecimal cala = new BigDecimal(38041430);
        BigDecimal texa = new BigDecimal(26059203);
        BigDecimal cost = new BigDecimal("3.23");

        BigDecimal lettersWriten = wisc.multiply(cala);
        BigDecimal copiesLetters =lettersWriten.multiply(texa);
        BigDecimal costCopies = cost.multiply(copiesLetters);

        System.out.println("If everyone in Wisconsin and California wrote eachother a letter, there would be "+lettersWriten+" letters");
        System.out.println("If every Texan wanted a copy of each letter there would be "+copiesLetters+" letters");
        System.out.println("If each letter cost $3.23, then it would cost "+costCopies+" dollars");


    }

}
