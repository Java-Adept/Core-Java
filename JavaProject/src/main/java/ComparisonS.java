public class ComparisonS {

    public static void main(String arg[]) {
        long statTime = System.currentTimeMillis();
        StringBuffer sb=new StringBuffer("Welcome");
        for(int i=0; i<100000; i++){
            sb.append("Java");
        }
        System.out.println("Time Taken By StringBuffer : " + (System.currentTimeMillis() - statTime + "ms"));
        statTime = System.currentTimeMillis();
        StringBuilder s=new StringBuilder("Welcome");
        for(int i=0; i<100000; i++){
            sb.append("Java");
        }
        System.out.println("Time Taken By StringBuilder : " + (System.currentTimeMillis() - statTime + "ms"));
    }
}
