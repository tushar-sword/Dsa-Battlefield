package Recursions.RecursionIntermediate;
import java.util.*;
// Crazy how we are entering the element in stack
// element aaega dekhega kya uski sahi jgh hai , neche wala element usse chota hai ki nahi
// agar nahi hai stack se element nikal kr apne jgh banaega sahi time pe enter krlega
// fir jinko nikala tha vapis bula lega using st.push(val);
public class SortAstack {
    public void sortStack(Stack<Integer> st){
        if(!st.isEmpty()){
            int temp = st.pop();
            sortStack(st);
            insert(st,temp);
        }
    }

    public void insert(Stack<Integer> st, int temp){

        if(st.isEmpty() || st.peek() <= temp){
            st.push(temp);
            return ;
        }

        int val = st.pop();
        insert(st , temp);
        st.push(val);
    }
}
