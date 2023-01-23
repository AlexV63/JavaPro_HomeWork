public class OptimalPass {
    private static int minimalCoast(int[][] costs, int i, int j) {
        if (i >= costs.length || j >= costs[0].length) return 1000000000;
        if (i == costs.length - 1 && j == costs[0].length - 1) return costs[i][j];
        int minCoast = costs[i][j] + Math.min(minimalCoast(costs, i+1 , j), minimalCoast(costs, i, j +1));
        return minCoast;
    }

    private static int minimalCoast1(int[][] costs, int im, int jm) {
        if (im >= costs.length || jm >= costs[0].length) return 1000000000;
        if (im == costs.length - 1 && jm == costs[0].length - 1) return costs[im][jm];
        int minCoast = costs[im][jm];
//        System.out.println(minCoast);
        for (int i = im; i < costs.length - 1; i++) {
            for (int j = jm; j < costs.length - 1; j++) {
                if (i > 0 && j > 0) {
                    minCoast = minCoast + Math.min(costs[i + 1][j], costs[i][j + 1]);
                } else {
                    if (i > 0) {
                        minCoast = minCoast + costs[i + 1][j];
                    } else if (j > 0) {
                        minCoast = minCoast + costs[i][j + 1];
                    }
                }
            }
        }
        return minCoast;

    }

    public static void main(String[] args) {
        int[][] costs = new int[][]{
                {1, 3, 1},
                {2, 9, 4},
                {0, 2, 4},

        };
        System.out.println(minimalCoast(costs, 0, 0));
        System.out.println("*********************");
        System.out.println(minimalCoast1(costs, 0, 0));
    }
}