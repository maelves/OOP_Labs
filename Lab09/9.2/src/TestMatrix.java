public class TestMatrix {
        public static void main(String[] args) {

            Float[][] m1 = new Float[][]{{Float.valueOf(1), Float.valueOf(2), Float.valueOf(3)}, {Float.valueOf(4), Float.valueOf(5), Float.valueOf(6)}, {Float.valueOf(1), Float.valueOf(1), Float.valueOf(1)}};
            Float[][] m2 = new Float[][]{{Float.valueOf(1), Float.valueOf(1), Float.valueOf(1)}, {Float.valueOf(2), Float.valueOf(2), Float.valueOf(2)}, {Float.valueOf(0), Float.valueOf(0), Float.valueOf(0)}};

            FloatMatrix floatMatrix = new FloatMatrix();
            System.out.println("\nm1 + m2 is ");
            GenericMatrix.printResult(m1, m2, floatMatrix.addMatrix(m1, m2), '+');
            System.out.println("\nm1 * m2 is ");
            GenericMatrix.printResult(m1, m2, floatMatrix.multiplyMatrix(m1, m2), '*');


            Double[][] d1 = new Double[][]{{1.1, 2.3, 3.4}, {4.6, 5.6, 6.7}, {1.9, 1.8, 1.7}};
            Double[][] d2 = new Double[][]{{0.0, 2.35, 1.56}, {2.22, 6.67, 90.0}, {0.0, 0.0, 0.78}};

            DoubleMatrix doubleMatrix = new DoubleMatrix();
            System.out.println("\nm1 + m2 is ");
            GenericMatrix.printResult(d1, d2, doubleMatrix.addMatrix(d1, d2), '+');
            System.out.println("\nm1 * m2 is ");
            GenericMatrix.printResult(d1, d2, doubleMatrix.multiplyMatrix(d1, d2), '*');
        }
}
