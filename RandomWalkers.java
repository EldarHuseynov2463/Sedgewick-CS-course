public class RandomWalkers{
        public static void main(String[] args){
                int r = Integer.parseInt(args[0]);
                int trials = Integer.parseInt(args[1]);
                double average = 0;
                for (int i = 1; i <= trials; i++){
                        int x = 0, y = 0;
                        int x1 = 0, y1 = 0, x2 = 0, y2 = 0;
                        int steps = 0;
                        while (Math.abs(-x2) + Math.abs(-y2) != r){
                                 double rand = Math.random();
                                 if (rand < 0.25){
                                          x1++;
                                          x2 = x1;}
                                 else if (rand < 0.5){
                                          y1--;
                                          y2 = y1;}
                                 else if (rand < 0.75){
                                          x1--;
                                          x2 = x1;}
                                 else if (rand < 1){
                                          y1++;
                                          y2 = y1;}
                                 steps++;
                        }
                        System.out.println("steps = " + steps);
                        average += steps;
                }
                System.out.println("average number of steps = " + average / trials);
        }
}
