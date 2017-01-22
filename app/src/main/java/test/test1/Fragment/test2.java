package test.test1.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import test.test1.R;

/**
 * Created by coder on 07-Jan-17.
 */
public class test2 extends Fragment {

    public test2(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.test2, container, false);

        //((MainActivity) getActivity()).toolbar.setTitle("2");
        //((MainActivity) getActivity()).textView.setText("2");
        return view;



    }
}

