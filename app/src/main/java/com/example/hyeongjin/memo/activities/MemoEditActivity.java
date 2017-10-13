package com.example.hyeongjin.memo.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.hyeongjin.memo.R;

import com.example.hyeongjin.memo.fragments.MemoEditFragment;

public class MemoEditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memo_edit);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.contents, new MemoEditFragment())
                .commit();
    }
}
