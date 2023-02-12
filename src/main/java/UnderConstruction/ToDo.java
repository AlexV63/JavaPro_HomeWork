//package UnderConstruction;
//
//public class ToDo {
//
////     hw_21_12_2022.Ex10;
//
//import java.util.Arrays;
//import java.util.Scanner;
//import java.util.stream.IntStream;
//import java.util.stream.Stream;
//
//    public class Ex10 {
//        public static void main(String[] args) {
//            String r = "otiwuklf";
//
//            char[] res = r.toCharArray();
//            System.out.println(Arrays.toString(res));
//
//            Scanner input = new Scanner(System.in);
//            System.out.println("Enter char ");
//            char x = input.next().charAt(0);
//
//
//            int a = IntStream.range(0, res.length)
//                    .filter(i -> x == res[i])
//                    .findFirst()
//                    .orElse(-1);
//
//            if (a != -1) {
//                System.out.println(a);
//            }else System.out.println("this character is missing");
//        }
//    }
//
//    //ex12
//    public static void main(String[] args) {
//        String s = "my name is big bob";
//
//        System.out.println(ex(s));
//    }
//
//    private static String ex(String s) {
//        String[] arrS = StringUtils.split(s);
//        String x = new String();
//        for (int i = arrS.length-1; i >= 0 ; i--) {
//            x = x + (arrS[i]) + " ";
//        }
//        return x;
//    }
//}
//}
