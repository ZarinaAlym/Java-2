package oop.enum1;

public class EnumMain {
    public static void main(String[] args) {
        final long ID = 2152568622L;
        System.out.println(ID);

        Day current= Day.SATURDAY;
        System.out.println(current);

        WeekDay todaysDate = new WeekDay("Saturday");
        System.out.println(todaysDate);

        Day day = Day.SATURDAY;
        switch (day){
            case MONDAY:
                System.out.println("today is Monday");
                break;
            case TUESDAY:
                System.out.println("today is tuesday");
                break;
            case WEDNESDAY:
                System.out.println("today is wednesday");
                break;
            case THURSDAY:
                System.out.println("today is trursday");
                break;
            case FRIDAY:
                System.out.println("today is friday");
                break;
            case SATURDAY:
                System.out.println("today is saturday");
                break;
            case SUNDAY:
                System.out.println("today is sunday");
                break;


        }
        System.out.println(day);

        for (Day d: Day.values()){
            System.out.println(d);
        }

    }
}
