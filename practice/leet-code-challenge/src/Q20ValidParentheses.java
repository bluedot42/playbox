import java.util.Stack;

public class Q20ValidParentheses {
    public void test(){

        System.out.println(isValid("{{]}"));
    }

    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();

        boolean result = true;

        for(char a:s.toCharArray()){
            if(a == '(' || a == '[' || a=='{'){
                stack.push(a);
            }else{
                if(stack.isEmpty()){
                    result = false;
                    break;
                }
                else{
                    char b = stack.pop();
                    switch(b){
                        case '(':if(a==')'){result=true;}else{return false;}break;
                        case '[':if(a==']'){result=true;}else{return false;}break;
                        case '{':if(a=='}'){result=true;}else{return false;}break;
                        default:result=false;break;
                    }
                }
            }
        }

        if(!stack.isEmpty()){
            result = false;
        }

        return result;
    }
}
