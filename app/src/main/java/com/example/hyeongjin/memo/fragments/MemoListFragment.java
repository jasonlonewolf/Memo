package com.example.hyeongjin.memo.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.hyeongjin.memo.R;
import com.example.hyeongjin.memo.adapters.MemoAdapter;
import com.example.hyeongjin.memo.models.Memo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hyeongjin on 2017-10-04.
 */

public class MemoListFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_memo_list, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("memo tile");

        ListView listView = (ListView) view.findViewById(R.id.list);

        List<Memo> list = new ArrayList<>();
//test date
        list.add(new Memo("titlle1","contents1111111","2017-10-4"));


        MemoAdapter adapter = new MemoAdapter(getActivity(),list);

        listView.setAdapter(adapter);
    }
}
