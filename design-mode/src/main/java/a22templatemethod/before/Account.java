package a22templatemethod.before;

public class Account {
    //验证用户信息
    public boolean validate(String account, String password){
        //...
        return true;
    }

    //计算利息
    public void calculateInterest(String type){
        if (type.equalsIgnoreCase("Current")){
            //按活期利率计算利息
        }else if (type.equalsIgnoreCase("Saving")){
            //按定期利率计算利息
        }
    }

    //显示结果
    public void display(){
        //显示
    }
}
