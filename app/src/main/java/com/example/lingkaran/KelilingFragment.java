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
public class KelilingFragment extends Fragment implements View.OnClickListener {
    private EditText edtJari2;
    private Button btnHitung2;
    private TextView tvHasil2;

    public KelilingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_keliling, container, false);
        edtJari2 = (EditText)view.findViewById(R.id.edt_jari2);
        btnHitung2 = (Button)view.findViewById(R.id.btn_hitung2);
        tvHasil2 = (TextView)view.findViewById(R.id.tv_hasil2);
        btnHitung2.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_hitung2){
            String jari2 = edtJari2.getText().toString().trim();

            boolean isEmptyFields = false;
            if (TextUtils.isEmpty(jari2)){
                isEmptyFields = true;
                edtJari2.setError("Field ini tidak boleh kosong");
            }

            if (!isEmptyFields) {
                double r = Double.parseDouble(jari2);

                double keliling = r*22/7*2;
                tvHasil2.setText(String.valueOf(keliling));
            }

        }
    }
}
