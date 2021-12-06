class GeneralizedHarmonic{
        public static void main(String[] args){
                int n,i,r;
                double ordered;
                double sum = 0;
                n = Integer.parseInt(args[0]);
                r = Integer.parseInt(args[1]);
                for(i=1;i<=n;i++){
                        ordered = Math.pow((double)i,(double)r);
                        sum = sum + 1 / ordered;
                }
                System.out.println(sum);
        }
}


