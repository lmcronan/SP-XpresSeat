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

public class RouteActivity extends Activity {
    String route_url = "http://10.11.123.35/testing/route.php";
    //ListView terminal_lv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.tab_route);

        ListView route_lv = (ListView) findViewById(R.id.route_list);
        TerminalBackground tb = new TerminalBackground(RouteActivity.this, route_url, route_lv);
        tb.execute();
    }
}


