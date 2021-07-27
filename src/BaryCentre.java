/**
 * In a two-body system, the barycenter is the center of gravity about which the two celestial bodies orbit each other.
 * Given the masses m1 and m2 of two bodies, and the shortest distance a between the two bodies,
 * write a program to compute the distance from the center of the first (more massive) body to
 * the barycenter: r1 = a m2 / (m1 + m2).
 * Note that if r1 is less than the radius of the first body R1, then the barycenter lies within the first body.
 *
 * Earth-moon: m1 = 1, m2 = .0123, a = 384,000, r1 = 4,670, R1 = 6,380.
 *
 * Pluto-Charon: m1 = .0021, m2 = .000254, a = 19,600, r1 = 2,110, R1 = 1,150.
 *
 * Sun-Earth: m1 = 333,000, m2 = 1, a = 150,000,000, r1 = 449, R1 = 696,000.
 */

public class BaryCentre
{
    void EarthMoon() {
        double R1 = 6380.0;
        double m1 = 1.0;
        double m2 = .0123;
        double a = 384000.0;
        double d = m1 + m2;
        double r1 = a * (m1/d);
        System.out.println("R1 between Earth and Moon is :" + R1);
        System.out.println("r1 between Earth and Moon is :" + r1);
        System.out.println("==========================================================");
        String G;

             if (r1 < R1) {
            G = "Earth";
            System.out.println("Bary center between Earth and Moon is :" + G);
                 System.out.println("==========================================================");
             } else {
            G = "Moon";
            System.out.println("Bary center between Earth and Moon is :" + G);
                 System.out.println("==========================================================");
             }
    }

        public void PlutoCharon () {
            double R1 = 6380.0;
            double m1 = 333000.0;
            double m2 = 1;
            double a = 150000000.0;
            double d = m1 + m2;
            double r1 = a * (m1 / d);
            System.out.println("R1 between Pluto and Charon is :" + R1);
            System.out.println("r1 between Pluto and Charon is :" + r1);
            System.out.println("==========================================================");

            String D;
            if (r1 < R1) {
                D = "Pluto";
                System.out.println("Bary center between Pluto and Charon is :" + D);
                System.out.println("==========================================================");

            } else {
                D = "Charon";
                System.out.println("Bary center between Pluto and Charon is :" + D);
                System.out.println("==========================================================");

            }
        }


            public void SunEarth ()
            {
                double R1 = 696000.0;
                double m1 = .0021;
                double m2 = .000254;
                double a = 19600.0;
                double d = m1 + m2;
                double r1 = a * (m1 / d);
                String E;
                System.out.println("R1 between Sun and Earth is :" + R1);
                System.out.println("r1 between Sun and Earth is :" + r1);
                System.out.println("==========================================================");

                if (r1 < R1) {
                    E = "Sun";
                    System.out.println("Bary center between Sun and Earth  is :" + E);
                    System.out.println("==========================================================");
                } else {
                    E = "Earth";
                    System.out.println("Bary center between Earth and Moon is :" + E);
                    System.out.println("==========================================================");
                }
            }


            public static void main (String[]args)

            {
                BaryCentre aobj = new BaryCentre();
                aobj.EarthMoon();
                aobj.SunEarth();
                aobj.PlutoCharon();
                System.out.println();
            }


}


