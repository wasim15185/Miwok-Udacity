package com.example.android.miwok;

import android.view.View;
import android.widget.Toast;

public class NumbersClickListner implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(),"Opening Number List",Toast.LENGTH_LONG).show();
    }
}
