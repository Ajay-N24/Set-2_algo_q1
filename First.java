package first;
class First{
    public static int bestProfit(int[] s){
        int minIndex=0,maxIndex;
        for(int i=1;i<s.length;i++){
            if(s[i]<s[minIndex]){
                minIndex=i;
            }
        }
        if(minIndex!=s.length-1){
            maxIndex=minIndex;
            for(int i=minIndex;i<s.length-1;i++){
                if(s[i]>s[maxIndex]){
                    maxIndex=i;
                }
            }
            return (s[maxIndex]-s[minIndex]);
        }
        else{
            return(0);
        }
    }
    public static void main(String args[]){
        int[] prices={7,6,4,3,1};
        int res=bestProfit(prices);
        System.out.println(res);
    }
}