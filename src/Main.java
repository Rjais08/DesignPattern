import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");

       System.out.println(getForeignCurrencyFormatWithDecimal(BigDecimal.valueOf(240000), "JO", "AR"));
    }

    private static String getForeignCurrencyFormatWithDecimal(BigDecimal amount, String countryCode, String langCode){
        String formattedAmount = null;

        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale(langCode, countryCode));


        DecimalFormatSymbols symbols = ((DecimalFormat)formatter).getDecimalFormatSymbols();
        symbols.setCurrencySymbol("");
        ((DecimalFormat)formatter).setDecimalFormatSymbols(symbols);


        if(true){
            formatter.setMaximumFractionDigits(8);
            formatter.setMinimumFractionDigits(8);
        }
        if(amount != null && amount.scale() > 0){
            formattedAmount = formatter.format(Double.valueOf(amount.toPlainString()));
        }
        else if (amount != null){
            formattedAmount = formatter.format(Long.valueOf(amount.toPlainString()));
        }

        formattedAmount = formattedAmount.replace(" ", "");
        return formattedAmount;
    }
}