class MinStack {
    Stack<int[]> st;
    Stack<int[]> minSt;
    int index;
    public MinStack() {
        st=new Stack<>();
        minSt=new Stack<>();
        index=0;
    }
    
    public void push(int value) {
        st.push(new int[]{++index,value});
        if(minSt.isEmpty() || (!(minSt.isEmpty()) && minSt.peek()[1]>value)){
            minSt.push(new int[]{index,value});
        }

    }
    
    public void pop() {
        if((!st.isEmpty() && !minSt.isEmpty()) && st.peek()[0]==minSt.peek()[0]){
            st.pop();
            minSt.pop();
        }
        else if(!st.isEmpty()){
            st.pop();
        }
    }
    
    public int top() {
        return st.peek()[1];
    }
    
    public int getMin() {
        return minSt.peek()[1];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */