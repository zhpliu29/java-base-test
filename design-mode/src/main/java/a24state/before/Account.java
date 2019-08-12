package a24state.before;

public class Account {

    private String state;//状态
    private int balance;//余额

    //...

    //存款
    public void deposit(){
        stateCheck();
    }

    //取款
    public void withdraw(){
        if (state.equalsIgnoreCase("NormalState") ||
                state.equalsIgnoreCase("OverdraftState")){
            //取款
            stateCheck();
        }else {
            //取款受限
        }
    }

    //计算利息
    public void computeInterest(){
        if (state.equalsIgnoreCase("RestrictedState") ||
                state.equalsIgnoreCase("OverdraftState")){
            //计算利息
        }
    }

    //状态检查和转换操作
    public void stateCheck(){
        if (balance>=0){
            state="NormalState"; //正常状态
        }else if (balance>-2000 && balance<0){
            state="OverdraftState";//透支状态
        }else if (balance== -2000){
            state="RestrictedState";//受限状态
        }else if (balance<-2000){
            //操作受限
        }
    }

}
