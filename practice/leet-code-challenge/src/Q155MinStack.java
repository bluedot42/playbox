import java.util.ArrayList;
import java.util.Iterator;

public class Q155MinStack {


}

class MinStack{
    private ArrayList<Integer> myStack;

    public MinStack(){
        this.myStack = new ArrayList<>();
    }

    public void push(int x){
        this.myStack.add(x);
    }

    public void pop(){
        this.myStack.remove(this.myStack.size()-1);
    }

    public int top(){
        return this.myStack.get(this.myStack.size()-1);
    }

    public int getMin(){

        int tmp = myStack.get(0);

        for(int i=1;i<myStack.size();i++){
            if(myStack.get(i)<tmp){
                tmp = myStack.get(i);
            }
        }

        return tmp;
    }
}
