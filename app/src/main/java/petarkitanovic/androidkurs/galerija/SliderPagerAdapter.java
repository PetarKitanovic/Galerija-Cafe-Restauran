package petarkitanovic.androidkurs.galerija;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.bumptech.glide.Glide;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class SliderPagerAdapter extends PagerAdapter {

    private Context mContext;
    private ArrayList<String> mList;

    public SliderPagerAdapter(Context mContext, ArrayList<String> mList) {
        this.mContext = mContext;
        this.mList = mList;
    }


    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {


        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        @SuppressLint("InflateParams") View slideLayout = Objects.requireNonNull(inflater).inflate(R.layout.slide_item, null);


        ImageView slideImg = slideLayout.findViewById(R.id.slide_img);

        InputStream ims = null;
        try {
            ims = mContext.getAssets().open(mList.get(position));
            // load image as Drawable
            Drawable d = Drawable.createFromStream(ims, null);
            // set image to ImageView
            slideImg.setImageDrawable(d);
        } catch (IOException e) {
            e.printStackTrace();
        }


        container.addView(slideLayout);
        return slideLayout;

    }

    @Override
    public int getCount() {

        return mList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }


    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
