public class Nuton {
    double ton(double a, double b) {
        double c = (a + b) / 2;
        if (b - a < 0.0000000001) {
            return (a + b)/2;
        } else {
            if ( (Math.cos(Math.pow(a, 5)) + Math.pow(a, 4) - 345.3 * a - 23) *  (Math.cos(Math.pow(c, 5)) + Math.pow(c, 4) - 345.3 * c - 23) < 0 ) {
                return this.ton(a, c);
            } else {
                return this.ton(c, b);
            }
        }
    }
}

