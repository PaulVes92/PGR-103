
// Time class defining the time object
class Time {
    int hours, minutes, seconds;
}

// Main class that converts given seconds to hours, minutes and seconds
class Task1 {

    public static void main(String[] args) {
        Time timeobj = convertSeconds(3099);
        System.out.println(timeobj.hours + ":" + timeobj.minutes + ":" + timeobj.seconds);
    }


        static Time convertSeconds(int seconds){
            Time t = new Time();

            t.hours = seconds / 3600;
            seconds %= 3600;

            t.minutes = seconds / 60;
            seconds %= 60;

            t.seconds = seconds;

            return t;
        }
}


