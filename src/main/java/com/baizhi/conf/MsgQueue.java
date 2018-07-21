package com.baizhi.conf;

import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by Administrator on 2018/7/9.
 */
public class MsgQueue {

    public static LinkedBlockingDeque<List<Integer>> deque = new LinkedBlockingDeque<>();


    public static void save(List<Integer> param) {
        try {
            deque.put(param);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static List<Integer> take() {
        List<Integer> take = null;
        try {
            take = deque.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return take;
    }

}
