 public class SleepIn {

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public static void main(String[] args) {
        SleepIn sleep = new SleepIn();
        System.out.println("Vacation(false, false) =" + sleep.sleepIn(false,false));
        System.out.println("Vacation(true, false) =" + sleep.sleepIn(true,false));
        System.out.println("Vacation(false, true) =" + sleep.sleepIn(false,true));
    }
}
