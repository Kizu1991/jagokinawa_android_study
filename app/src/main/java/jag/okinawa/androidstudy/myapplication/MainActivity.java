package jag.okinawa.androidstudy.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ProgressBar;

import java.util.ArrayList;
import java.util.List;

import jag.okinawa.androidstudy.myapplication.models.Event;
import jag.okinawa.androidstudy.myapplication.models.Eventon;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private List<MyModel> mModels;
    private MyAdapter mAdapter;
    private ProgressBar mProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.list);
        mProgressBar = (ProgressBar) findViewById(R.id.progress);

        mModels = new ArrayList<>();
        mAdapter = new MyAdapter(mModels);
        listView.setAdapter(mAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                MyModel model = mModels.get(position);
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("event_id", model.getId());
                startActivityForResult(intent, 1);
            }
        });

        mProgressBar.setVisibility(View.VISIBLE);

        API api = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(API.BASE_URL)
                .build()
                .create(API.class);

        // API リクエスト
        api.apiCall(10).enqueue(new Callback<Eventon>() {
            @Override
            public void onResponse(Call<Eventon> call, Response<Eventon> response) {

                Eventon eventon = response.body();
                for(Event event : eventon.getEvents()){
                    MyModel model = new MyModel();
                    model.setId(event.getEventId());
                    model.setImageUrl(event.getImagePath());
                    model.setTitle(event.getTitle());
                    model.setDescription(event.getSummary());
                    mModels.add(model);
                }

                mAdapter.notifyDataSetChanged();

                mProgressBar.setVisibility(View.GONE);

            }
            @Override
            public void onFailure(Call<Eventon> call, Throwable t) {
                // TODO エラー処理
                mProgressBar.setVisibility(View.GONE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Log.d("Result", "RequestCode = " + requestCode +
                " ResultCode = " + resultCode);
    }
}