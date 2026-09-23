import java.util.Arrays;
class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = speed.length;
        int[][] car = new int[n][2];
        for(int i = 0; i<n ; i++){
            car[i][0] = position[i];
            car[i][1] = speed[i];
        }
        Arrays.sort(car, (a,b)->b[0]-a[0]);
        int fleets = 0;
        double[] fleetTime = new double[n];
        for(int i = 0; i<n; i++){
            double time = (double) (target - car[i][0])/car[i][1];
            if(fleets == 0 || fleetTime[fleets-1]<time){
                fleetTime[fleets] = time;
                fleets++;
            }
        }
        return fleets;
    }
}