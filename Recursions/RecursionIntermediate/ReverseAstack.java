package Recursions.RecursionIntermediate;

import java.util.*;

// This is crazy that how we are recieving the element in obj and insert it at bottom
// We are just saying jo aae agar stack khali hai toh push krjao
// agar nahi khali toh khali krke push ho , fir bakio ko bula lo jo the already pehle stack mei
// last case mei ekdam khali nahi krna tha sahi position jab greater than next ho tab insert kr jana tha
// yha pe toh sab nikal kr enter kro
public class ReverseAstack {
    
    public static void reverse(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }

        int top = st.pop();
        reverse(st);
        insertAtBottom(st,top);
    }

    public static void insertAtBottom(Stack<Integer> st,int element){
        if(st.isEmpty()){
            st.push(element);
        }

       int val = st.pop();
       insertAtBottom(st, element);
       st.push(val);
    }
}
