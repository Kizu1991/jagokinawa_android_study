package jag.okinawa.androidstudy.myapplication;

import android.os.AsyncTask;
import android.support.annotation.NonNull;
import android.util.Log;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * 通信クラス
 * pdc-k-kamiya on 2017/10/09.
 */
public class HttpConnector {

    /**
     * Callback Interface
     */
    public interface Callback{
        void onSuccess(String json);
        void onError(Exception e);
    }

    /**
     * 通信開始メソッド
     * @param callback {@link Callback}
     */
    public static void connect(@NonNull String url, @NonNull final Callback callback){

        new AsyncTask<String, Void, String>(){

            private Exception mException;

            @Override
            protected String doInBackground(String... strings) {
                String json = "";
                try {
                    // 大阪の天気予報XMLデータ
                    URL url = new URL("http://www.drk7.jp/weather/xml/27.xml");
                    HttpURLConnection con = (HttpURLConnection)url.openConnection();
                    json = InputStreamToString(con.getInputStream());
                    Log.d("HTTP", json);

                    JSONObject object = new JSONObject(json);
                    String test = object.optString("xxxx");


                } catch(Exception exception) {
                    mException = exception;
                }
                return json;
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);

                if(mException == null){
                    // 成功
                    callback.onSuccess(s);
                    return;
                }

                // 失敗
                callback.onError(mException);
            }
        }.execute(url);


    }

    // InputStream -> String
    private static String InputStreamToString(InputStream is) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        br.close();
        return sb.toString();
    }
}
