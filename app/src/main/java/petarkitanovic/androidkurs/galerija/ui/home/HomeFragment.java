package petarkitanovic.androidkurs.galerija.ui.home;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import java.util.List;
import java.util.Objects;

import petarkitanovic.androidkurs.galerija.R;

public class HomeFragment extends Fragment {

    ImageView face, insta;
    Context context;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        context = getContext();

        face = root.findViewById(R.id.imageView3);
        insta = root.findViewById(R.id.imageView4);
        face.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse("https://www.facebook.com/galerijaodzaci");
                Intent insta = new Intent(Intent.ACTION_VIEW, uri);
                insta.setPackage("com.facebook.katana");

                if (isIntentAvailable(Objects.requireNonNull(getContext()), insta)) {
                    startActivity(insta);
                } else {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/galerijaodzaci")));
                }
            }
        });

        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse("http://instagram.com/_u/galerijaodzaci");
                Intent insta = new Intent(Intent.ACTION_VIEW, uri);
                insta.setPackage("com.instagram.android");

                if (isIntentAvailable(Objects.requireNonNull(getContext()), insta)) {
                    startActivity(insta);
                } else {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/galerijaodzaci")));
                }
            }
        });
        return root;
    }

    private boolean isIntentAvailable(Context ctx, Intent intent) {
        final PackageManager packageManager = ctx.getPackageManager();
        List<ResolveInfo> list = packageManager.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY);
        return list.size() > 0;
    }
}