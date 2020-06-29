class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> stack = new Stack();
        
        for (int i=0; i<asteroids.length; i++) {
        
            collision: {
                
                while (!stack.isEmpty() && asteroids[i] < 0 && stack.peek() > 0) {
                  
                    if (stack.peek() < -asteroids[i]) {
                        stack.pop();
                        continue;
                    } else if (stack.peek() == -asteroids[i]) {
                        stack.pop();
                    }
                    break collision;
                }
                stack.push(asteroids[i]);
            }
        }

        int[] ans = new int[stack.size()];
        
        for (int t = ans.length - 1; t >= 0; --t) {
            ans[t] = stack.pop();
        }
        
        return ans;
    }
}
