package cn.learning;

import com.occultusterra.curl.Curl;

/**
 * @author liaorui
 * @date 2019/11/20
 */
public class JavaCurl {

    public static void main(String[] args) throws Exception {
        Curl curl = new Curl();
        curl.setUrl("https://en.wikipedia.org/wiki/CURL");
        curl.setProxy("127.0.0.1:1087");
        curl.setSSLVerifyPeer(false);
        curl.setTimeout(10);
        curl.perform();
        String body = curl.getBody();
        System.out.println(body);
    }
}
