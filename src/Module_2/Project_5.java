public class Project_5{
    public static void main(String[] args){
        
        int natsum = 0;
        
        int n = 0;
        int i;
        ;
        for (i = 1; i<20; i++){
            if(natsum + i > 110){
                break;
            }
            natsum += i;
            n = i;
            
        }
        System.out.println("Final sum: " + natsum);
        System.out.println("nth term: " + n);
    }
}