package main;

public class ABXCVar {
    //private Integer a, b, c, x;

    public static int[] getVarsArr(){
        boolean tf = false;
        int a, b, c, x;
        int[] vars = new int[4];
        while (tf == false) {
            a = (int) (100 - 200 * Math.random());
            b = (int) (100 - 200 * Math.random());
            x = (int) (100 * Math.random());
            c = a + b * x;
            if (c == (int) c && c <= 100 && c > 0 && (a * b * (int) c * x) != 0 && (a > 0 || b*x > 0)) {
                vars[0] = a;
                vars[1] = b;
                vars[2] = c;
                vars[3] = x;
                tf = true;
            }
        }
        return vars;
    }

}
