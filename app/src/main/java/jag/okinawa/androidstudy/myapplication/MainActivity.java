package jag.okinawa.androidstudy.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<MyModel> mModels;
    private MyAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.list);

        mModels = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            MyModel model = new MyModel();
            model.setImageUrl("http://healthy-lion99.up.n.seesaa.net/healthy-lion99/image/E382ABE382BFE38384E383A0E383AAE38080E6A899E6BA96-thumbnail2.jpg");
            model.setTitle(i + "番目のタイトル");
            model.setDescription(i + "番目の詳細");
            mModels.add(model);
        }

        mAdapter = new MyAdapter(mModels);
        listView.setAdapter(mAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("position", position);
                startActivityForResult(intent, 1);
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
