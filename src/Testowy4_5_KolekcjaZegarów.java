import java.util.*;

public class Testowy4_5_KolekcjaZegarów {
    public static void main(String[] args) {

        class Clock {
            int hour;
            int min;

            public Clock(int hour, int min) {

                this.hour = hour;
                this.min = min;
            }

            @Override
            public String toString() {
                return hour + " : " + min;
            }

            public int getMin() {
                return min;
            }

            public void setMin(int min) {
                this.min = min;
            }

            public void add1Min() {
                min = min + 1;
                if (min == 60) {

                    hour = hour + 1;
                    if (hour == 24) {

                        hour = 0;
                    }
                    min = 0;
                }

            }
        }


        List<Clock> clock = new LinkedList<>();

        clock.add(new Clock(4, 20));
        clock.add(new Clock(12, 58));
        clock.add(new Clock(23, 58));

        for (int i = 0; i < clock.size(); i++) {

            System.out.print("Clock nr " + (i + 1) + ": " + clock.get(i) + "   ");

        }
        System.out.println("");
        for (int n = 0; n < clock.size(); n++) {

            clock.get(n).setMin(clock.get(n).getMin() + 1);

        }

        for (int i = 0; i < clock.size(); i++) {

            System.out.print("Clock nr " + (i + 1) + ": " + clock.get(i) + "   ");
        }
        System.out.println("");

        for (int n = 0; n < clock.size(); n++) {

            clock.get(n).add1Min();
            System.out.print("Clock nr " + (n + 1) + ": " + clock.get(n) + "   ");
        }
        System.out.println("");

        for (int n = 0; n < clock.size(); n++) {

            clock.get(n).add1Min();
            System.out.print("Clock nr " + (n + 1) + ": " + clock.get(n) + "   ");

        }

    }
}
