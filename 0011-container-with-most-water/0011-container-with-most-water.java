/*class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0,j=n-1;
        int max_area=0;
        
        

        while(i<=j){
            int width=j-i;
            int minh=Math.min(height[i],height[j]);
            int area=minh*width;
            max_area=Math.max(max_area,area);
        }
        if(height[i]<height[j])
        i++;
        else
        j--;
        
        return max_area;   
    }
}*/
class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            maxArea = Math.max(maxArea, (right - left) * Math.min(height[left], height[right]));

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;        
    }
}


