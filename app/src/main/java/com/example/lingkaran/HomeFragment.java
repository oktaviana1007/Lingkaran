package com.example.lingkaran;


import android.app.Activity;
import android.app.ActivityManager;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener{
    private Button btnCategory,btnCategory2;
    private ImageButton btnInfo;
    public HomeFragment() {
        // Required empty public constructor
        }



        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container ,
                                 Bundle savedInstanceState) {

            View view =  inflater.inflate(R.layout.fragment_home, container, false);
            btnCategory = (Button)view.findViewById(R.id.btn_category) ;
            btnCategory.setOnClickListener(this);
            btnCategory2 = (Button)view.findViewById(R.id.btn_category2) ;
            btnCategory2.setOnClickListener(this);
            btnInfo = (ImageButton)view.findViewById(R.id.info) ;
            btnInfo.setOnClickListener(this);
            return view;
    }
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_category){
            //todo to CategoryFragment
            LuasFragment mCategoryFragment = new LuasFragment();
            FragmentManager mFragmentManager = getFragmentManager();
            FragmentTransaction mFragmentTransaction = mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.frame_container, mCategoryFragment);
            mFragmentTransaction.addToBackStack(null);
            mFragmentTransaction.commit();

        }
        if (v.getId() == R.id.btn_category2){
            //todo to CategoryFragment
            KelilingFragment mCategoryFragment2 = new KelilingFragment();
            FragmentManager mFragmentManager2 = getFragmentManager();
            FragmentTransaction mFragmentTransaction2 = mFragmentManager2.beginTransaction();
            mFragmentTransaction2.replace(R.id.frame_container, mCategoryFragment2);
            mFragmentTransaction2.addToBackStack(null);
            mFragmentTransaction2.commit();

        }
        if (v.getId() == R.id.info){
            //todo to CategoryFragment
            InfoFragment mCategoryFragment3 = new InfoFragment();
            FragmentManager mFragmentManager3 = getFragmentManager();
            FragmentTransaction mFragmentTransaction3 = mFragmentManager3.beginTransaction();
            mFragmentTransaction3.replace(R.id.frame_container, mCategoryFragment3);
            mFragmentTransaction3.addToBackStack(null);
            mFragmentTransaction3.commit();

        }
    }
}