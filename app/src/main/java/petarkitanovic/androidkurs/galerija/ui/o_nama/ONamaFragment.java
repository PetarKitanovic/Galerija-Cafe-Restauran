package petarkitanovic.androidkurs.galerija.ui.o_nama;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import petarkitanovic.androidkurs.galerija.R;

public class ONamaFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_o_nama, container, false);

        return root;
    }
}