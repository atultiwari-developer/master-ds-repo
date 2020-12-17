package defog.concurrency;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadFormatterDemo {

    public static void main(String[] args) {
 /// whatever the execution code should be witten here
    }

    public String bithDate(int userid){
        Date birthDate = new Date();
        final SimpleDateFormat df = ThreadFormatter.dateFormatThreadLocal.get();
        return df.format(birthDate);
    }

}
