package jag.okinawa.androidstudy.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import jag.okinawa.androidstudy.myapplication.models.Event;
import jag.okinawa.androidstudy.myapplication.models.Eventon;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SecondActivity extends AppCompatActivity {

    private Event mEvent;
    private ProgressBar mProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String id = intent.getStringExtra("event_id");

        mProgressBar = (ProgressBar) findViewById(R.id.progress);
        mProgressBar.setVisibility(View.VISIBLE);

        API api = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(API.BASE_URL)
                .build()
                .create(API.class);

        // API リクエスト
        api.getEvent(id).enqueue(new Callback<Eventon>() {
            @Override
            public void onResponse(Call<Eventon> call, Response<Eventon> response) {
                Eventon eventon = response.body();
                mEvent = eventon.getEvents().get(0);
                mProgressBar.setVisibility(View.GONE);
                setView();
            }
            @Override
            public void onFailure(Call<Eventon> call, Throwable t) {
                // TODO エラー処理
                mProgressBar.setVisibility(View.GONE);
            }
        });
    }

    private void setView(){
        TextView title = (TextView) findViewById(R.id.title);
        ImageView image = (ImageView) findViewById(R.id.image);
        TextView summary = (TextView) findViewById(R.id.summary);
        TextView capacity = (TextView) findViewById(R.id.capacity);
        TextView startAt = (TextView) findViewById(R.id.started_at);
        TextView endedAt = (TextView) findViewById(R.id.ended_at);
        TextView address = (TextView) findViewById(R.id.address);
        WebView contents = (WebView) findViewById(R.id.contents);

        // ブラウザ起動
        findViewById(R.id.brawser).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse(mEvent.getEventUrl());
                Intent i = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(i);
            }
        });

        // タイトル設定
        title.setText(mEvent.getTitle());
        // 画像設定
        Picasso.with(this).load(mEvent.getImagePath()).into(image);
        // 概要
        summary.setText(mEvent.getSummary());
        // 定員
        String capacityStr = "定員：" + mEvent.getAccepted() + "/" + mEvent.getCapacity();
        if(mEvent.getWaiting() != 0){
            capacityStr += " キャンセル待ち：" + mEvent.getWaiting();
        }
        capacity.setText(capacityStr);

        // 日付フォーマッター
        String SDF_W3C_TO_FORMAT = "yyyy-MM-dd'T'HH:mm:ssZ";
        SimpleDateFormat sdf = new SimpleDateFormat(SDF_W3C_TO_FORMAT, Locale.getDefault());
        String SDF_STR_FORMAT = "yyyy/MM/dd HH:mm";
        SimpleDateFormat sdfConvert = new SimpleDateFormat(SDF_STR_FORMAT, Locale.getDefault());

        // 日付情報変換
        String startAtStr = "";
        String endAtStr = "";

        try {
            Date date = sdf.parse(mEvent.getStartedAt());
            startAtStr = sdfConvert.format(date);

            date = sdf.parse(mEvent.getEndedAt());
            endAtStr = sdfConvert.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // 開催日
        startAt.setText("開催日：" + startAtStr);
        // 終了日
        endedAt.setText("終了日：" + endAtStr);
        // 開催場所
        address.setText("開催場所：" + mEvent.getAddress());
        // 詳細
        contents.loadDataWithBaseURL(
                "",
                mEvent.getContents(),
                "text/html",
                "UTF-8",
                "");
    }

}
