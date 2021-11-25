public class GreatCircle{
        public static void main (String[] args){
                double x1 = Math.toRadians(Double.parseDouble(args[0]));
                double y1 = Math.toRadians(Double.parseDouble(args[1]));
                double x2 = Math.toRadians(Double.parseDouble(args[2]));
                double y2 = Math.toRadians(Double.parseDouble(args[3]));
                double dist, s1, s2, s0;
                double r = 6371.0;
                s1 = Math.sin((x2 - x1) / 2);
                s2 = Math.sin((y2 - y1) / 2);
                s0 = Math.sqrt((s1*s1) + (Math.cos(x1) * Math.cos(x2)*s2*s2));
                dist = 2*r*Math.asin(s0);
                System.out.println(dist + " kilometers");
        }
}
