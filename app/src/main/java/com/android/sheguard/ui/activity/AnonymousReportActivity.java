package com.android.sheguard.ui.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.android.sheguard.R;

public class AnonymousReportActivity extends AppCompatActivity {

    private static final String GOOGLE_FORM_URL = "https://forms.gle/YOUR_LINK";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anonymous_report);

        //  Use your own toolbar (because theme has NoActionBar)
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(null);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        //  Back arrow click
        toolbar.setNavigationOnClickListener(v -> finish());

        Button reportBtn = findViewById(R.id.btn_report_anonymous);
        reportBtn.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse(GOOGLE_FORM_URL));
            startActivity(intent);
        });
    }
}
