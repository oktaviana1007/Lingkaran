package com.example.lingkaran;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class LuasFragment extends Fragment implements View.OnClickListener{
    private EditText edtJari;
    private Button btnHitung;
    private TextView tvHasil;


    public LuasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_luas, container, false);
        edtJari = (EditText)view.findViewById(R.id.edt_jari);
        btnHitung = (Button)view.findViewById(R.id.btn_hitung);
        tvHasil = (TextView)view.findViewById(R.id.tv_hasil);
        btnHitung.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_hitung){
            String jari = edtJari.getText().toString().trim();

            boolean isEmptyFields = false;
            if (TextUtils.isEmpty(jari)){
                isEmptyFields = true;
                edtJari.setError("Field ini tidak boleh kosong");
            }

            if (!isEmptyFields) {
                double r = Double.parseDouble(jari);

                double luas = r*22/7*r;
                tvHasil.setText(String.valueOf(luas));
            }

        }

    }
}
