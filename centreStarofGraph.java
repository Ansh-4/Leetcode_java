class Solution{
    public int CentreStar(int[][] edge){
        int n = edge.length;
        int[] degree = new int[n+2];
        for(int[] t : edges){
            degree[t[0]]++;
            degree[t[1]]++;
        }
        for(int i =1; i<=n+1; i++){
            if(degree[i]==n){
                return i;
            }
        }
        return -1;

    }
}