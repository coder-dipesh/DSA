package classcode;

public class ParenthesisBalance {

public boolean checkBalance(String exp){

        String oBraces = "[{(";
        String cBraces = "]})";

        StackTestChar stc = new StackTestChar(5);
        for (int i =0; i<exp.length(); i++){
                char bracket = exp.charAt(i);
                // checking for opening bracket if matches then we push bracket to stack of bracket
                if (bracket=='[' || bracket=='{' || bracket=='(' ){
                        stc.push(bracket);
                }
                else {
                        int indexOfClosingBraces = cBraces.indexOf(bracket);
                        char crosspondingOpeningBraces = oBraces.charAt(indexOfClosingBraces);
                        char popBracs = stc.pop();

                        if (crosspondingOpeningBraces!=popBracs){
                                return false;
                        }
                }
        }
        // if stack is empty then it returns true
        if (stc.isEmpty()){
                return true;
        }
        return false;
        }
}
