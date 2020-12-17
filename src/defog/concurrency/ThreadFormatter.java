package defog.concurrency;

import java.text.SimpleDateFormat;

public class ThreadFormatter {
    public static ThreadLocal<SimpleDateFormat> dateFormatThreadLocal = new ThreadLocal<SimpleDateFormat>(){

        @Override
        public SimpleDateFormat initialValue(){
            return new SimpleDateFormat("yyyy-MM-dd");
        }
        @Override
        public SimpleDateFormat get(){
            return super.get();
        }
    };

}
