package cn.learning;

import com.occultusterra.curl.Curl;

/**
 * @author liaorui
 * @date 2019/11/20
 */
public class JavaCurl {

    public static void main(String[] args) throws Exception {
        Curl curl = new Curl();
        curl.setProxy("172.16.3.207:8118");
        curl.setUrl("https://arabic.cnn.com/middle-east/article/2019/11/12/palestine-west-bank-israeli-army-un-nickolay-mladenov");
        //curl.setUrl("https://www.facebook.com");
//        curl.setUrl("https://github.com/WWelna/jCURL");
        curl.setUserAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.97 Safari/537.36");
        curl.setVerbose(true);
        curl.setTimeout(30);
        curl.perform();
        String body = curl.getBody();
        System.out.println(body);
    }
}
