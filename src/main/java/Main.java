import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        List emails = new ArrayList();
        emails.add("user@domain.com");
        emails.add("user@domain.co.in");
        emails.add("user.name@domain.com");
        emails.add("user_name@domain.com");
        emails.add("username@yahoo.corporate.in");

//Invalid emails
        emails.add(".username@yahoo.com");
        emails.add("username@yahoo.com.");
        emails.add("username@yahoo..com");
        emails.add("username@yahoo.c");
        emails.add("username@yahoo.corporate");

        emails.add("A.ser_name@domain.com");
        emails.add("A123456789123456789123456789@1231231231231231231231231323domain.com");

        String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        String dlugosc = "";
//        String regex = "^ [A-Za-z0-9]*@+[]$";

//        String regex = "^([\\w-]+(\\.[\\w-]+)){2,64}*@([\\w-]+\\.)+[a-zA-Z]{2,7}$";

        String regex2 = "^([a-zA-Z0-9]+([\\w-]?))+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z0-9]{2,7}$";


        Pattern pattern = Pattern.compile(regex2);


        for (Object email : emails) {

            Matcher matcher = pattern.matcher((CharSequence) email);
            dlugosc = (String) email;

            if (dlugosc.length() < 65) {
                System.out.println(email + " : " + matcher.matches() + " Długość maila: " + dlugosc.length());
            } else {
                System.out.println("Email: " + email + " jest za długim składa się z: " + dlugosc.length() + " znaków.");
                System.out.println("Dozwolona długość adresu email to 64 znaki");
            }
        }

    }
}
