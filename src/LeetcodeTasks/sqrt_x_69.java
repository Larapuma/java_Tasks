package LeetcodeTasks;

public class sqrt_x_69 {
    public static void main(String[] args) {
        System.out.println(sqrt_x(2147395599));

    }

    public static int sqrt_x(int x) {
        if (x <= 1) return x;

        double y_0 = 0;
        double y_new = 12;
        double eps = 0.00001;
        while (Math.abs(y_new - y_0) > eps) {
            y_0 =y_new;
            y_new  = (y_new + x/y_new)/2;

        }


        return (int) y_new;

    }
}
