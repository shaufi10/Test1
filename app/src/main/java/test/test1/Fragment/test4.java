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
public class test4 extends Fragment {
    public test4(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.test4, container, false);

        //((MainActivity) getActivity()).toolbar.setTitle("4");
        //((MainActivity) getActivity()).textView.setText("4");
        return view;



    }
}
