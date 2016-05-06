package com.langert.gestures;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.zip.Inflater;


public class bottomSectionFragment extends Fragment {

    private static TextView textView2;
    private static TextView textView3;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.bottom_section_fragment, container, false);

        textView2=(TextView) view.findViewById(R.id.textView2);
        textView3=(TextView) view.findViewById(R.id.textView3);
        return view;
    }

    public void setMemeText(String top, String bottom){
        textView2.setText(top);
        textView3.setText(bottom);
    }
}
