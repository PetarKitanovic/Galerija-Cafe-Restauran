package petarkitanovic.androidkurs.galerija.ui.dostava;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import petarkitanovic.androidkurs.galerija.R;

public class DostavaFragment extends Fragment {

    TextView telefon1, telefon2, telefon3, googlemaps, email;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_dostava, container, false);

        telefon1 = root.findViewById(R.id.telefon1);
        telefon2 = root.findViewById(R.id.telefon2);
        telefon3 = root.findViewById(R.id.telefon3);
        googlemaps = root.findViewById(R.id.googlemaps);
        email = root.findViewById(R.id.email_adresa);

        telefon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:0255744600"));
                startActivity(intent);
            }
        });

        telefon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:069740121"));
                startActivity(intent);
            }
        });

        telefon3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:0638769259"));
                startActivity(intent);
            }
        });

        googlemaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:45.508700,19.262025?z=19");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                Uri data = Uri.parse("mailto:galerijaodzaci@gmail.com");
                intent.setData(data);
                startActivity(intent);
            }
        });

        return root;
    }

}