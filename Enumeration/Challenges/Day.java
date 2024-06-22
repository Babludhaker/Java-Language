package Enumeration.Challenges;

public enum Day {
    Monday (true),
    Tuesday(true),
    Wednesday(true),
    Thursday(true),
    Friday(true),
    Saturday(false),
    Sunday(false);

    private final boolean isWeekDay;

     Day(boolean isWeekDay){
        this.isWeekDay = isWeekDay;
    }

    public String GetType(){
         return isWeekDay ? "WeekDay" : "Weekend";
    }
}
