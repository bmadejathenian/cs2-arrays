class Main {
    public static double average(int[] ages) {
        int sum = 0;
        for (int i = 0; i < ages.length; i++) {
            sum += ages[i];
        }
        double average = ((double) sum ) / ((double) ages.length);
        return average;
    }

    public static int minimum(int[] ages) {
        int min = ages[0];
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < min) {
                min = ages[i];
            }
        }
        return min;
    }

    public static int maximum(int[] ages) {
        int max = ages[0];
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < max) {
                max = ages[i];
            }
        }
        return max;
    }

    static void main(String[] args) {
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

        System.out.println(average(ages));
        System.out.println(minimum(ages));
        System.out.println(maximum(ages));
    }
}
