package io.rong.example.user;

import io.rong.RongCloud;
import io.rong.methods.user.User;
import io.rong.models.*;
import io.rong.models.response.*;
import io.rong.models.user.UserModel;

/**
 * Demo class
 *
 * @author RongCloud
 *
 */
public class UserExample {
    /**
     * 此处替换成您的appKey
     * */
    //private static final String appKey = "8luwapkv8s7pl";
    private static final String appKey = "qd46yzrfqi2sf";
    /**
     * 此处替换成您的appSecret
     * */
    //private static final String appSecret = "lmkgpHuXezTjV2";
    private static final String appSecret = "iglqtrMTmz";
    /**
     * 自定义api地址
     * */
    //private static final String api = "https://api.cn.ronghub.com";
    private static final String api = "http://apixq.rongcloud.net:9200";


    public static void main(String[] args) throws Exception {

       // RongCloud rongCloud = RongCloud.getInstance(appKey, appSecret);
        //自定义 api 地址方式
         RongCloud rongCloud = RongCloud.getInstance(appKey, appSecret,api);
        User User = rongCloud.user;

        /**
         * API 文档: http://www.rongcloud.cn/docs/server_sdk_api/user/user.html#register
         *
         * 注册用户，生成用户在融云的唯一身份标识 Token
         */
        UserModel user = new UserModel()
                .setId("userxxd2")
                .setName("username")
                .setPortrait("http://www.rongcloud.cn/images/logo.png");
        TokenResult result = User.register(user);
        System.out.println("getToken:  " + result.toString());

        /**
         *
         * API 文档: http://www.rongcloud.cn/docs/server_sdk_api/user/user.html#refresh
         *
         * 刷新用户信息方法
         */
       // Result refreshResult = User.update(user);
       // System.out.println("refresh:  " + refreshResult.toString());

    }
}
