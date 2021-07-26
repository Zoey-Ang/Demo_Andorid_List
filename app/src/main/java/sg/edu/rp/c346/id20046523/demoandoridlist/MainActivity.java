package sg.edu.rp.c346.id20046523.demoandoridlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<AndroidVersion> al;
    //ArrayAdapter<AndroidVersion> aa;
    CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv=findViewById(R.id.lv);
        al = new ArrayList<AndroidVersion>();
        AndroidVersion item1 =new AndroidVersion("Pie","9.0");
        al.add(item1);

        //faster instead of creating a variable and thn add in
        al.add(new AndroidVersion("Oreo","9.0"));
        al.add(new AndroidVersion("Nougat","7.8"));

//        al.add("Pie - 9.0");
//        al.add("Oreo - 8.0");
//        al.add("Nougat - 7.0");

        //aa = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,al);
        //lv.setAdapter(aa);
        adapter = new CustomAdapter(MainActivity.this, R.layout.row, al);
        lv.setAdapter(adapter);

    }
}