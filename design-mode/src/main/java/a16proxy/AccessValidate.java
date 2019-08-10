package a16proxy;

/**
 * 业务类：身份验证
 */
public class AccessValidate {

    public boolean validate(String userId){
        if (userId.equals("杨过")){
            System.out.println(userId+"校验通过");
            return true;
        }else {
            System.out.println(userId+"校验失败");
            return false;
        }
    }
}
