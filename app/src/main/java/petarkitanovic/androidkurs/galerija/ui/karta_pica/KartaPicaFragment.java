package petarkitanovic.androidkurs.galerija.ui.karta_pica;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.thoughtbot.expandablerecyclerview.listeners.GroupExpandCollapseListener;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.ArrayList;

import petarkitanovic.androidkurs.galerija.LinearLayoutManagerWithSmoothScroller;
import petarkitanovic.androidkurs.galerija.R;
import petarkitanovic.androidkurs.galerija.meni.Company;
import petarkitanovic.androidkurs.galerija.meni.Product;
import petarkitanovic.androidkurs.galerija.meni.ProductAdapter;

public class KartaPicaFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_karta_pica, container, false);


        final RecyclerView recyclerView = root.findViewById(R.id.recyclerViewPice);
        recyclerView.setLayoutManager(new LinearLayoutManagerWithSmoothScroller(getContext()));

        ArrayList<Company> companies = new ArrayList<>();

        ArrayList<Product> topliNapici = new ArrayList<>();
        topliNapici.add(new Product("Domaca kafa", "", "320"));
        topliNapici.add(new Product("Espresso", "", "450"));
        topliNapici.add(new Product("Cappucino", "", "150"));
        topliNapici.add(new Product("Caj od nane", "", "320"));
        topliNapici.add(new Product("Kuvano vino", "", "450"));

        Company topliNapiciPice = new Company("Topli napici", topliNapici);
        companies.add(topliNapiciPice);

        ArrayList<Product> bezalkoholnaPica = new ArrayList<>();
        bezalkoholnaPica.add(new Product("Domaca kafa", "", "320"));
        bezalkoholnaPica.add(new Product("Espresso", "", "450"));
        bezalkoholnaPica.add(new Product("Cappucino", "", "150"));
        bezalkoholnaPica.add(new Product("Caj od nane", "", "320"));
        bezalkoholnaPica.add(new Product("Kuvano vino", "", "450"));

        Company bezAlkoholnaPica = new Company("Bezalkoholna Pića", bezalkoholnaPica);
        companies.add(bezAlkoholnaPica);

        ArrayList<Product> gaziraniSokovi = new ArrayList<>();
        gaziraniSokovi.add(new Product("Domaca kafa", "", "320"));
        gaziraniSokovi.add(new Product("Espresso", "", "450"));
        gaziraniSokovi.add(new Product("Cappucino", "", "150"));
        gaziraniSokovi.add(new Product("Caj od nane", "", "320"));


        Company gaziraniSok = new Company("Gazirani sokovi", gaziraniSokovi);
        companies.add(gaziraniSok);

        ArrayList<Product> negaziraniSokovi = new ArrayList<>();
        negaziraniSokovi.add(new Product("Domaca kafa", "", "320"));
        negaziraniSokovi.add(new Product("Espresso", "", "450"));
        negaziraniSokovi.add(new Product("Cappucino", "", "150"));
        negaziraniSokovi.add(new Product("Caj od nane", "", "320"));
        negaziraniSokovi.add(new Product("Kuvano vino", "", "450"));

        Company neGaziraniSok = new Company("Negazirani sokovi", negaziraniSokovi);
        companies.add(neGaziraniSok);

        ArrayList<Product> piva = new ArrayList<>();
        piva.add(new Product("Domaca kafa", "", "320"));
        piva.add(new Product("Espresso", "", "450"));
        piva.add(new Product("Cappucino", "", "150"));
        piva.add(new Product("Caj od nane", "", "320"));
        piva.add(new Product("Kuvano vino", "", "450"));

        Company pivo = new Company("Pivo", piva);
        companies.add(pivo);


        ArrayList<Product> zestokaPica = new ArrayList<>();
        zestokaPica.add(new Product("Domaca kafa", "", "320"));
        zestokaPica.add(new Product("Espresso", "", "450"));
        zestokaPica.add(new Product("Cappucino", "", "150"));
        zestokaPica.add(new Product("Caj od nane", "", "320"));
        zestokaPica.add(new Product("Kuvano vino", "", "450"));
        zestokaPica.add(new Product("Domaca kafa", "", "320"));
        zestokaPica.add(new Product("Espresso", "", "450"));
        zestokaPica.add(new Product("Cappucino", "", "150"));
        zestokaPica.add(new Product("Caj od nane", "", "320"));
        zestokaPica.add(new Product("Kuvano vino", "", "450"));

        Company zestina = new Company("Žestoka pića", zestokaPica);
        companies.add(zestina);



        final ProductAdapter adapter = new ProductAdapter(companies);

        adapter.setOnGroupExpandCollapseListener(new GroupExpandCollapseListener() {
            @Override
            public void onGroupExpanded(ExpandableGroup group) {
                recyclerView.smoothScrollToPosition(adapter.getGroupPositionWhenExpand(group));
            }

            @Override
            public void onGroupCollapsed(ExpandableGroup group) {
                recyclerView.smoothScrollToPosition(adapter.getGroupPositionWhenCollapse(group));
            }
        });


        recyclerView.setAdapter(adapter);

        return root;
    }
}