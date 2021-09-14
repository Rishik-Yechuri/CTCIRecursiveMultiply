public class CTCIRecursiveMultiply {
    public static void main(String[] args){
        try
        {
            CTCIRecursiveMultiply obj = new CTCIRecursiveMultiply();
            obj.run (args);
        }
        catch (Exception e)
        {
            e.printStackTrace ();
        }
    }
    public void run(String[] args){
        int multiplicationResult = recursiveMultiplierStarter(7,5);
        System.out.println(multiplicationResult);
    }
    public int recursiveMultiplierStarter(int a,int b){
        if(b > a){
            return recursiveMultiplier(a,b);
        }
        return recursiveMultiplier(b,a);
    }
    public int recursiveMultiplier(int a,int b){
        if(a == 1){
            return b;
        }
        return b+recursiveMultiplier(a-1,b);
    }
}
