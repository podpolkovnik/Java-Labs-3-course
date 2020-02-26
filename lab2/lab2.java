package lab2;

class Calendar2 {
    public static String[] getWeekDays(int shift) {
        String[] weekdays = {
            "",
            "S", "M", "Tu", "W", "Th", "F", "S"
        };

        String[] newWeekDays = new String[8];
        newWeekDays[0] = "";
        int startingWeekday = shift + 1;
        int current = 1;
        for(int i = startingWeekday; i < 8; ++i, ++current) {
            newWeekDays[current] = weekdays[i];
        }
        for(int i = 1; i < startingWeekday; ++i, ++current) {
            newWeekDays[current] = weekdays[i];
        }

        return newWeekDays;
    }

    public static void printWeekDays(int shift) {
        String[] blanks = { 
            "", " ", "  ", " ", "  ", " ", "  ", "  "
         };
        String[] weekdays = getWeekDays(shift);
        for(int i = 0; i < weekdays.length; ++i) {
            System.out.print(blanks[i]);
            System.out.print(weekdays[i]);
        }
        System.out.println();
    }

     public static int day(int M, int D, int Y) {
         int y = Y - (14 - M) / 12;
         int x = y + y/4 - y/100 + y/400;
         int m = M + 12 * ((14 - M) / 12) - 2;
         int d = (D + x + (31*m)/12) % 7;
         return d;
     }
 
     public static boolean isLeapYear(int year) {
         if  ((year % 4 == 0) && (year % 100 != 0)) return true;
         if  (year % 400 == 0) return true;
         return false;
     }
 
     public static void main(String[] args) {
         int startingWeekday;
         if(args.length == 0)
            startingWeekday = 1;
        else 
            startingWeekday = Integer.parseInt(args[0]);
         for(int M = 1; M < 13; ++M) {
            int Y = 2020;
            int shift = startingWeekday - 1;
            
            String[] months = {
                "",
                "January", "February", "March",
                "April", "May", "June",
                "July", "August", "September",
                "October", "November", "December"
            };
            
            int[] days = {
                0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
            };
    
            
            if (M == 2 && isLeapYear(Y)) days[M] = 29;

            System.out.println("   " + months[M] + " " + Y);
            printWeekDays(shift);
    
            int d = day(M, 1, Y);
            d -= shift;
            if (d < 0) {
                d = 7 + d;
            }

            for (int i = 0; i < d; i++)
                System.out.print("   ");
            for (int i = 1; i <= days[M]; i++) {
                System.out.printf("%2d ", i);
                if (((i + d) % 7 == 0) || (i == days[M])) System.out.println();
            }
            System.out.println();
        }
     }
 }