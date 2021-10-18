package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


public class MainActivity extends Activity {
    private ListView listView;
    private SimpleAdapter simple_adapter;
    private List< Map<String, Object>> dataList ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView=(ListView) findViewById(R.id.listView);
        dataList=new ArrayList< Map<String, Object>>();


//适配器设置
        simple_adapter=new SimpleAdapter(this, getData(), R.layout.item, new
                String[] {"pic","text"}, new int[] {R.id.pic,R.id.text});

//启用适配器
        listView.setAdapter(simple_adapter);

    }

    //	设置数据源
    private List<Map<String, Object>> getData() {
        for(int i=0;i<20;i++) {
            Map map=new HashMap<String, Object>();
            map.put("pic", R.drawable.ic_launcher);
            map.put("text", "慕课网"+i);
            dataList.add(map);
        }

        return dataList;
    };

}

