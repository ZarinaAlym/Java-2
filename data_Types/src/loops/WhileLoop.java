package loops;

public class WhileLoop {
    public static void main(String[] args) {
        // while loop only Boolean
        int n = 1; //1
        // 1<5  (true)  priтt 1
        // 2<5  (true)  print 2
        // 3<5  (true)  print 3
        // 4<5  (true)  print 4
        // 5<5 выходит из цикла

        // количество итераций не тзвестно
        while (n < 5) { //2
            System.out.println(n);
            n++;//3

        }
        // количество итераций известно
        for (int m = 1; m < 5; m++) {
            System.out.println(m);
        }
        int days = 0;
        int savings = 0;
        int som = 1000;

        while (savings < 100000) {
            savings += som; // savings + som---> savings+= som
            days += 2; //через день копим пн - ср - пт - вс
        }
        System.out.println("нам потребуется " + days + " дней");

        int days1 = 0;
        int savings1 = 0;
        int som1 = 1000;
        for (days1 = 0; savings1 < 100000; days1++) {
            savings1 += som1;
        }
        System.out.println("нам потребуется " + days + " дней");

        // do- while loop
        int q = 20;
        do {
            System.out.println(q);
            q++;
        }
        // false
        while (q < 5);
    }

}
