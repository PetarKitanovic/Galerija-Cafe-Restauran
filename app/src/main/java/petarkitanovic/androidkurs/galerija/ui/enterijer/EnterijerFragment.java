package petarkitanovic.androidkurs.galerija.ui.enterijer;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import petarkitanovic.androidkurs.galerija.R;
import petarkitanovic.androidkurs.galerija.SliderPagerAdapter;

public class EnterijerFragment extends Fragment {

    private SliderPagerAdapter adapterSlider;
    private ViewPager sliderpager;
    private ArrayList<String> listaSlika;
    private Timer timer;

    private int currentPage = 0;
    final long DELAY = 1000;
    final long PERIOD = 6000;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_enterijer, container, false);

        listaSlika = new ArrayList<>();
        listaSlika.add("gal1.jpg");
        listaSlika.add("gal2.jpg");
        listaSlika.add("gal3.jpg");
        listaSlika.add("gal1.jpg");
        listaSlika.add("gal2.jpg");
        listaSlika.add("gal3.jpg");

        sliderpager = root.findViewById(R.id.viewPager2);
        adapterSlider = new SliderPagerAdapter(getContext(), listaSlika);
        sliderpager.setAdapter(adapterSlider);

        sliderpager.setPageTransformer(true, new ViewPager.PageTransformer() {
            @Override

            public void transformPage(@NonNull View page, float position) {
                page.setAlpha(0.2f);
                page.setVisibility(View.VISIBLE);

                page.animate()
                        .alpha(0.9f)
                        .setDuration(page.getResources().getInteger(android.R.integer.config_shortAnimTime));
            }
        });

        autoScroll();

        return root;
    }
    private void autoScroll(){
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {


                if (currentPage == listaSlika.size()) {
                    currentPage = 0;
                }
                sliderpager.setCurrentItem(currentPage++, true);
            }
        };


        timer = new Timer();
        timer .schedule(new TimerTask() {

            @Override
            public void run() {

                handler.post(Update);
            }
        }, DELAY, PERIOD);
    }

    @Override
    public void onDetach() {
        super.onDetach();

        if(timer != null) {
            timer.cancel();
            timer = null;
        }
    }
}