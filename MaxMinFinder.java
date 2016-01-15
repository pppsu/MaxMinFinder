class MaxMinFinder{
	 public static void main(String[] args) {
        int num;
        int min = 0;
        int max = 0;
        for (String x : args) {
            try {
                num = Integer.parseInt(x);
                if (min == 0 && max == 0) {
                    max = num;
                    min = max;
                }
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            } catch (Exception e) {
                System.out.print("");
            }
        }

        if (min % 2 == 0) {
            System.out.println("Min : " + min + " (even number)");
        } else {
            System.out.println("Min : " + min + " (odd number)");
        }
        if (max % 2 == 0) {
            System.out.println("Max : " + max + " (even number)");
        } else {
            System.out.println("Max : " + max + " (odd number)");
        }

    }
}
