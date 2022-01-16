package com.example.fundforchange.activities.user.myevents;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.fundforchange.R;
import com.example.fundforchange.adapters.myevent_adapter;

public class myevent extends Fragment {

    private MyeventViewModel mViewModel;
    myevent_adapter myAdapter;
    RecyclerView recyclerView;
    int[] images = {R.drawable.ayhay,
            R.drawable.usa,
            R.drawable.pusa,
            R.drawable.kana,
            R.drawable.kira,
            R.drawable.dunno,
            R.drawable.hoi};
    String[] title, desc;

    public static myevent newInstance() {
        return new myevent();
    }



    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,
                              Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_myevent, container, false);
        title = getResources().getStringArray(R.array.event_name);
        desc = getResources().getStringArray(R.array.event_desc);
        recyclerView = view.findViewById(R.id.myeventview);

        myAdapter = new myevent_adapter(getActivity(), title, desc, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


        return view;


    }
}