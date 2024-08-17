package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BookOrganize1434 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int n_sum = 0 , m_sum = 0;

        st = new StringTokenizer(br.readLine());
        for (int i =0; i<n; i++){
            n_sum += Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i =0; i<m; i++){
            m_sum += Integer.parseInt(st.nextToken());
        }

        System.out.println(n_sum - m_sum);

    }
}
