package petarkitanovic.androidkurs.galerija.ui.karta_pica;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import petarkitanovic.androidkurs.galerija.R;

public class KartaPicaFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_karta_pica, container, false);
        final TextView textView = root.findViewById(R.id.text_slideshow);

        textView.setText("Karta pica");

        return root;
    }
}