import java.util.*;

public class Main {
    static int n, m, is, js, ifin, jfin, cnt = 1, cnt_ans = 0;
    static int[][] arr = new int[11][11];
    static int[][] v = new int[11][11];
    static int[] xx = {1, 0, -1, 0};
    static int[] yy = {0, 1, 0, -1};

    static boolean ok(int i, int j) {
        return (i >= 1 && i <= n && j >= 1 && j <= m && v[i][j] == 0 && arr[i][j] == 0);
    }

    static void back(int x, int y) {
        if (x == ifin && y == jfin)
            cnt_ans++;
        else
            for (int d = 0; d < 4; d++) {
                int xaux = x + xx[d];
                int yaux = y + yy[d];

                if (ok(xaux, yaux)) {
                    arr[xaux][yaux] = 2;
                    back(xaux, yaux);
                    arr[xaux][yaux] = 0;
                }
            }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                v[i][j] = scanner.nextInt();
            }
        }

        is = scanner.nextInt();
        js = scanner.nextInt();
        ifin = scanner.nextInt();
        jfin = scanner.nextInt();

        v[is][js] = 2;
        back(is, js);

        System.out.println(cnt_ans);
    }
}
