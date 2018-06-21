package jianqiang.com.providerbhost;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * @author weishu
 * @date 16/7/8.
 */
public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";

    // demo ContentProvider 的URI
    private static Uri URI = Uri.parse("content://jianqiang/moveis/2");

    static int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button insert = new Button(this);
        insert.setText("delete");
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContentValues values = new ContentValues();
                Integer count = getContentResolver().delete(URI, "where", null);
                Toast.makeText(MainActivity.this, String.valueOf(count), Toast.LENGTH_LONG).show();
            }
        });

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.addView(insert);

        setContentView(layout);
    }
}
