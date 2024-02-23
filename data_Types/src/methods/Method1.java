//package methods;
//
//public class Methods1 {
//    public static void main(String[] args) {
//        // System.out.println(dollarToSom());
//        //System.out.println(evroToSom(100));
//        System.out.println(zum(89.7, 200, "prodaja"));
//        System.out.println(dz(89.7, 1000, "pokupka"));
//    }
//
//
//    public static double dollarToSom() {
//        double course = 89.7;
//        int doll = 100;
//        double itogo = doll * course;
//        return itogo;
//
//
//    }
//
//    public static float evroToSom(float course) {
//        int evro = 100;
//        float itogo = evro * course;
//        return itogo;
//
//    }
//
//    public static double zum(double course, int summa, String obmen) {
//        if (obmen == "pokupka") {
//            return (course - 0.05) * summa;
//        } else if (obmen == "prodaja") {
//            return (course + 0.05) * summa;
//        }
//        return summa;
//    }
//
//    public static double dz(double course, int summa, String obmen) {
//        if (obmen == "pokupka") {
//           return ((course - 0.05) * summa);
//      } else if (summa > 500) {
//         return ((course - 0.05) * summa) + ((5 * summa) / 100);
//       } else {
//            return ((course - 0.05) * summa);
//        }
//        if (obmen == "prodaja") {
//            return summa;
//        }
//        return (course+0.05)* summa;
//    }
//   }
//
//
//
