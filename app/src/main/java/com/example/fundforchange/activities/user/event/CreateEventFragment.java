package com.example.fundforchange.activities.user.event;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import com.example.fundforchange.R;


public class CreateEventFragment extends Fragment {


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    private ConstraintLayout createEventPage1;
    private ConstraintLayout createEventPage2;

    public CreateEventFragment() {


    }

    public static CreateEventFragment newInstance(String param1, String param2) {
        CreateEventFragment fragment = new CreateEventFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }





    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        //donationTypeFieldLayout = getView().findViewById(R.id.donationTypeFieldLayout);
//        donationtypeField = getView().findViewById(R.id.donationTypeField);
//        String[] donationTypes = new String[]{
//                "Type 1",
//                "Type 2",
//                "Type 3",
//                "Type 4"
//        };
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(
//                getActivity(),
//                R.layout.donation_type_dropdown_layout,
//                R.id.donationTypeFieldOptionsLayout,
//                donationTypes
//        );
//        donationtypeField.setAdapter(adapter);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_create_event, container, false);
    }
}