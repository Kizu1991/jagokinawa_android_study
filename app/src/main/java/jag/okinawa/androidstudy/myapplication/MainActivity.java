package jag.okinawa.androidstudy.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1);

        for(int i = 0; i < 20; i++){
            adapter.add("Position " + i);
        }

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d("onItemClick", "OnItemClick!!");
            }
        });


//        LinearLayout view = (LinearLayout)findViewById(R.id.top);
//        view.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.d("OnClick", "OnClick!!");
//            }
//        });
//
//        view.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View view) {
//                Log.d("OnLongClick", "OnLongClick!!");
//                return false;
//            }
//        });
//
//        view.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View view, MotionEvent motionEvent) {
//                Log.d("onTouch",
//                        "Action = " + motionEvent.getAction() +
//                        "X = " + motionEvent.getX() +
//                        "Y = " + motionEvent.getY());
//                return false;
//            }
//        });
    }
}
