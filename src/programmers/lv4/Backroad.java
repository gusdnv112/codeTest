package programmers.lv4;

public class Backroad {
    public static void main(String[] args) {
        int[][] puddles  = {{2, 2}};
        System.out.println(solution(4, 3, puddles));
    }
    public static int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        int[][] routes = new int[n+1][m+1];
        for(int i=0; i<puddles.length; i++) {
            routes[puddles[i][1]][puddles[i][0]] = -1;
        }
        routes[1][1] = 1;
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=m; j++) {
                if (-1 != routes[i][j]) {
                    if (0 <= routes[i][j-1] && 0 <= routes[i][j]) {
                        routes[i][j] += routes[i][j-1] %1000000007 ;
                    }
                    if (0 <= routes[i-1][j] && 0 <= routes[i][j]) {
                        routes[i][j] += routes[i-1][j] % 1000000007;
                    }
                } else {
                    continue;
                }
            }
        }
        answer = routes[n][m] % 1000000007;
        return answer;
    }
}
