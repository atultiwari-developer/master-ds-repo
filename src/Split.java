import java.util.*;

public class Split {

    public static void main(String[] args) {
        String str = "\"Sun 10:00-20:00\n" +
                "Fri 05:00-10:00\n" +
                "Fri 16:30-23:50\n" +
                "Sat 10:00-24:00\n" +
                "Sun 01:00-04:00\n" +
                "Sat 02:00-06:00\n" +
                "Tue 03:30-18:15\n" +
                "Tue 19:00-20:00\n" +
                "Wed 04:25-15:14\n" +
                "Wed 15:14-22:40\n" +
                "Thu 00:00-23:59\n" +
                "Mon 05:00-13:00\n" +
                "Mon 15:00-21:00\"";
        String[]arr = str.split("\\n");
        System.out.println(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        Map<String, List<String>> map = initiaLizeDayMap();
        for(int i=0;i< arr.length;i++){
            String dayStr = arr[i];
            String day = arr[i].substring(0,4);
            day = day.replaceAll("^\"+|\"+$", "");
            day = day.replace(" ","");
            String time = arr[i].substring(4,arr[i].length());
            System.out.println(day);
            time =  time.replaceAll("^\"+|\"+$", "");
            System.out.println(time);
            if(map.containsKey(day) && map.get(day) != null){
                List<String> timeList = map.get(day);
                timeList.add(time);
            }
            else{
                List<String> timeList = new ArrayList<>();
                timeList.add(time);
                map.put(day,timeList);

            }
        }
        System.out.println(map);
      int res = calculateFinalDiff(map);
        System.out.println("res is"+res);
    }

 public  static Map<String,List<String>>initiaLizeDayMap(){
     Map<String,List<String>> map = new LinkedHashMap<String,List<String>>();
     //List<String> dayList = new ArrayList<>();
     map.put("Mon",null);
     map.put("Tue",null);
     map.put("Wed",null);
     map.put("Thu",null);
     map.put("Fri",null);
     map.put("Sat",null);
     map.put("Sun",null);
     return map;


 }
 public static int calculateFinalDiff(Map<String, List<String>> map){
        int res = 0;
     String previousday = "";
     String lastTimeSlotForADay = "";
     for(Map.Entry<String,List<String>> entry:map.entrySet()){
            String day = entry.getKey();
            List<String> timeList = entry.getValue();
            String firstTime = timeList.get(0);
            String []timeArr = firstTime.split("-");
            String firstTimeSlot = timeArr[1];
            String firstTimeSlotForADay = timeArr[0];

            if(previousday.equals(day)==false && !lastTimeSlotForADay.isEmpty()){
                int timedif = totalTimeDiffNextDay(firstTimeSlotForADay,lastTimeSlotForADay);
                 if(res<timedif){
                     res = timedif;
                 }
            }

            for(int i=1;i<timeList.size();i++){
               String  secondTime = timeList.get(i);
               String[] secondArr2 = secondTime.split("-");
               String secondTimeSlot = secondArr2[0];
                int timedif = totalTimeDiff(firstTimeSlot,secondTimeSlot);
                if(res<timedif){
                    res = timedif;
                }

                lastTimeSlotForADay = secondArr2[1];
                previousday = day;
            }

          }
        return res;
 }

 public static int totalTimeDiff(String firstTimeSlot,String secondTimeSlot){
        String[]arr = firstTimeSlot.split(":");
        int hour1 = Integer.parseInt(arr[0]);
        int min1 = Integer.parseInt(arr[1]);
     String[]brr = secondTimeSlot.split(":");
     int hour2 = Integer.parseInt(brr[0]);
     int min2 = Integer.parseInt(brr[1]);
     return getTimeDiffrence(hour1,min1,hour2,min2);
 }
    public static int totalTimeDiffNextDay(String firstTimeSlot,String secondTimeSlot){
        int daylastHour  = 24;
        int dayLastMinute = 0;
        int diff = 0;
        String[]arr = firstTimeSlot.split(":");
        int hour1 = Integer.parseInt(arr[0]);
        int min1 = Integer.parseInt(arr[1]);
        String[]brr = secondTimeSlot.split(":");
        int hour2 = Integer.parseInt(brr[0]);
        int min2 = Integer.parseInt(brr[1]);
        if(min2>dayLastMinute){
            daylastHour = daylastHour-1;
            dayLastMinute = dayLastMinute+60;
            dayLastMinute = dayLastMinute-min2;
            diff = dayLastMinute;
        }
        diff = diff + (daylastHour-hour2)*60;
        diff = diff + min1;
        diff = diff + hour1* 60;
        return diff;
    }



    public static int getTimeDiffrence(int hour1,int min1,int hour2,int min2){
        int diff = 0;
        if(min2>min1){
           diff = min2-min1;
        }
        else if(min2<min1){
            hour2 = hour2-1;
            min2 = min2+60;
            min2 = min2-min1;
            diff = min2;
        }
        if(hour2>hour1){
            hour2 = hour2 - hour1;
            diff = hour2 *60;
        }
        return diff;

 }

    public static int getTimeDiffrenceDay(int hour1,int min1,int hour2,int min2){
        int diff = 0;
        if(min2>min1){
            diff = min2-min1;
        }
        else if(min2<min1){
            hour2 = hour2-1;
            min2 = min2+60;
            min2 = min2-min1;
            diff = min2;
        }
        if(hour2>hour1){
            hour2 = hour2 - hour1;
            diff = hour2 *60;
        }
        return diff;

    }


}
