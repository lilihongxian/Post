package com.baizhi.conf;

import com.alibaba.fastjson.JSONObject;
import io.goeasy.GoEasy;

import java.util.List;

/**
 * Created by Administrator on 2018/7/9.
 */
public class MSGRunnable extends Thread {
    @Override
    public void run() {
        while (true) {
            List<Integer> take = MsgQueue.take();
            if (take != null) {
                GoEasy goEasy = new GoEasy("http://rest-hangzhou.goeasy.io", "BC-4be65e4518cf4475a64619932aea9095");

                JSONObject jsonObject = new JSONObject();
                jsonObject.put("data", take);
                String s = jsonObject.toJSONString();
                goEasy.publish("lxtchannel", s);
            }

        }


    }
}
