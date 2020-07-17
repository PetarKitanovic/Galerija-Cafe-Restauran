package petarkitanovic.androidkurs.galerija.meni;

import android.view.View;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

import petarkitanovic.androidkurs.galerija.R;

public class CompanyViewHolder extends GroupViewHolder {

    private TextView title;

    public CompanyViewHolder(View itemView) {
        super(itemView);

        title = itemView.findViewById(R.id.kategorija);
    }

    public void bind (Company company){
        title.setText(company.getTitle());
    }
}
