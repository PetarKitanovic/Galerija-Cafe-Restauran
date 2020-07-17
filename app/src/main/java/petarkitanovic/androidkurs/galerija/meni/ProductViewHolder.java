package petarkitanovic.androidkurs.galerija.meni;

import android.view.View;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

import petarkitanovic.androidkurs.galerija.R;

public class ProductViewHolder extends ChildViewHolder {

    private TextView naziv, sastojak, cene;

    public ProductViewHolder(View itemView) {
        super(itemView);
        naziv = itemView.findViewById(R.id.nazivJela);
        sastojak = itemView.findViewById(R.id.sastojciJela);
        cene = itemView.findViewById(R.id.cenaJela);
    }

    public void bind(Product product){
        naziv.setText(product.name);
        sastojak.setText(product.sastojci);
        cene.setText(product.cena);
    }
}
