class Solution {
    public int minMoves(String[] classroom, int energy) {
        int n = classroom.length, m = classroom[0].length();
        Queue<int[]> q = new ArrayDeque<>();
        int[][] litterx = new int[n][m];
        for (int[] row : litterx) {
            Arrays.fill(row, -1);
        }
        int[][] dir = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
        int litter = 0, sr = -1, sc = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (classroom[i].charAt(j) == 'S') {
                    sr = i;
                    sc = j;
                    q.offer(new int[] { i, j, energy, 0, 0 });
                } else if (classroom[i].charAt(j) == 'L') {
                    litterx[i][j] = litter++;
                }
            }
        }
        boolean[][][][] visited = new boolean[n][m][energy + 1][1 << litter];
        visited[sr][sc][energy][0] = true;
        if (litter == 0) {
            return 0;
        }
        int fullmask = (1 << litter) - 1;
        int ans = 0;
        while (!(q.isEmpty()) && litter > 0) {
            int[] v = q.poll();
            int r = v[0], c = v[1], e = v[2], mask = v[3], move = v[4];
            if (fullmask == mask) {
                return move;
            }

            for (int i = 0; i < 4; i++) {
                int rr = v[0] + dir[i][0];
                int rc = v[1] + dir[i][1];
                if ((rr >= 0 && rc >= 0) && (rr < n && rc < m)
                        && (classroom[rr].charAt(rc) != 'X' && e > 0)) {
                    int newE = e - 1;
                    if (classroom[rr].charAt(rc) == 'R') {
                        newE = energy;
                    }
                    int nextMask = mask;
                    if ((classroom[rr].charAt(rc) == 'L') && litterx[rr][rc] != -1) {
                        nextMask |= (1 << litterx[rr][rc]);
                    }

                    if (!visited[rr][rc][newE][nextMask]) {
                        visited[rr][rc][newE][nextMask] = true;
                        q.offer(new int[] { rr, rc, newE, nextMask, move + 1 });
                    }

                }
            }

        }
        return -1;
    }
}