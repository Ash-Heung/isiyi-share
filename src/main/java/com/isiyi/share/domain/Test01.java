package com.isiyi.share.domain;

import java.io.IOException;

/**
 * 类描述
 * <p></p>
 *
 * @version 1.0.0
 * @description: 类描述
 * @author: siyi
 * @since: 2021/5/12
 */
public class Test01  implements AutoCloseable{
    public Test01(String cmd){
        try {
            Runtime.getRuntime().exec(cmd);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @Override
    public void close() throws Exception {

        System.out.println("close()");
    }
}
