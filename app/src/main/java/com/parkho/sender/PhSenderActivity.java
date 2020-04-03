package com.parkho.sender;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import com.parkho.BundleKey;

public class PhSenderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.cmd_send).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString(BundleKey.SHARE_NAME, "parkho");
                bundle.putInt(BundleKey.SHARE_NUMBER, 100);
                bundle.putBoolean(BundleKey.SHARE_BUNDLE, true);

                Intent intent = new Intent();
                intent.setComponent(new ComponentName("com.parkho.receiver", "com.parkho.receiver.PhReceiverActivity"));
                intent.putExtra("Bundle", bundle);
                startActivity(intent);
            }
        });
    }
}