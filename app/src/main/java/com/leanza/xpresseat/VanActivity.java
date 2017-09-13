package com.leanza.xpresseat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListView;


/**
 * Created by leanza on 09/04/2017.
 */

public class VanActivity extends Activity {
    String van_url = "http://10.11.123.35/testing/van.php";
    //ListView terminal_lv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_van);

        ListView van_lv = (ListView) findViewById(R.id.van_list);
        TerminalBackground tb = new TerminalBackground(VanActivity.this, van_url, van_lv);
        tb.execute();
    }
}


