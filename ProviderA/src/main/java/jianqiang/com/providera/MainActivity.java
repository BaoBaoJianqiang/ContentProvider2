package jianqiang.com.providera;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    ContentResolver contentResolver;
    Uri uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uri = Uri.parse("content://baobao222/jianqiang");
        contentResolver = getContentResolver();
    }

    public void delete(View source) {
        int count = contentResolver.delete(uri, "delete_where", null);
        Toast.makeText(this, "delete uri:" + count, Toast.LENGTH_LONG).show();
    }
}
