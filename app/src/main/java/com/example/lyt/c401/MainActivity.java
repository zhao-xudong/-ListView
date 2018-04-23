package com.example.lyt.c401;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private final static  String USERNAME="用户名";
    private final static String CLASS="班级";
    private final static String SNO="学号";
    private final static String SEX="性别";
    private final static String PHONE="手机";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[]usernames={"大哥","二哥","三哥","四哥"};
        String[]classs={"101","102","103","104"};
        String[]snos={"001","002","003","004"};
        String[]sexs={"M","F","M","F"};
        String[]phones={"110","119","114","120"};
        List<Map<String,Object>> items= new ArrayList<Map<String,Object>>();
        for (int i=0;i<usernames.length;i++)
        {
            Map<String,Object>item=new HashMap<String,Object>();
            item.put(USERNAME, usernames[i]);
            item.put(CLASS, classs[i]);
            item.put(SNO,snos[i]);
            item.put(SEX,sexs[i]);
            item.put(PHONE, phones[i]);
            items.add(item);

        }
        SimpleAdapter adapter=new SimpleAdapter(this,items,R.layout.item,new String[]{USERNAME ,CLASS,SNO,SEX,PHONE},new int[]{R.id.txtusername,R.id.txtclass,R.id.txtsno,R.id.txtsex,R.id.txtphone});

        ListView list=(ListView)findViewById(R.id.list);

        list.setAdapter(adapter);
        registerForContextMenu(list);

    }
}
