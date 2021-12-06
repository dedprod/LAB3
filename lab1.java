import java.util.regex.*;
import java.util.Scanner;

public class lab1 {
    public static void main(String args[]) {
        String pattern = "(0[1-9]|[12]\\d|3[01])/(0[1-9]|1[012])/(19|[2-9][0-9])\\d\\d";
        Pattern p = Pattern.compile(pattern);
        Scanner data = new Scanner(System.in);
        System.out.println("Введите дату");
        String text = data.next();
        data.close();
        Matcher m = p.matcher(text);
        if (m.matches() == true) {
            System.out.println("Данная строка является датой типа dd/mm/yyyy и соответствует заданному диапазону");
        } else {
            System.out.println("Данная строка НЕ является датой типа dd/mm/yyyy и НЕ соответствует заднному диапазону");
        }
    }
}