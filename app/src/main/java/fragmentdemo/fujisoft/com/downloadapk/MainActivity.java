package fragmentdemo.fujisoft.com.downloadapk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private DownloadUtils downloadUtils;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.download).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        downloadUtils =   new DownloadUtils(MainActivity.this);
        downloadUtils.downloadAPK("http://172.29.140.111:8080/app-debug.apk", "app-debug.apk");
    }
}
