package petarkitanovic.androidkurs.galerija.ui.jelovnik;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.thoughtbot.expandablerecyclerview.listeners.GroupExpandCollapseListener;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.ArrayList;

import petarkitanovic.androidkurs.galerija.LinearLayoutManagerWithSmoothScroller;
import petarkitanovic.androidkurs.galerija.R;
import petarkitanovic.androidkurs.galerija.meni.Company;
import petarkitanovic.androidkurs.galerija.meni.Product;
import petarkitanovic.androidkurs.galerija.meni.ProductAdapter;

public class JelovnikFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_jelovnik, container, false);

        final RecyclerView recyclerView = root.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManagerWithSmoothScroller(getContext()));

        ArrayList<Company> companies = new ArrayList<>();

        ArrayList<Product> dorucakMeni = new ArrayList<>();
        dorucakMeni.add(new Product("Jaja u tortilji", "jaja, salata, majonez", "320"));
        dorucakMeni.add(new Product("Engleski dorucak", "3 jaja, kobasica", "450"));
        dorucakMeni.add(new Product("Sendvic", "kifla, pavlaka, zelena salata", "150"));
        dorucakMeni.add(new Product("Jaja u tortilji", "jaja, salata, majonez", "320"));
        dorucakMeni.add(new Product("Engleski dorucak", "3 jaja, kobasica", "450"));
        dorucakMeni.add(new Product("Sendvic", "kifla, pavlaka, zelena salata", "150"));
        dorucakMeni.add(new Product("Jaja u tortilji", "jaja, salata, majonez", "320"));
        dorucakMeni.add(new Product("Engleski dorucak", "3 jaja, kobasica", "450"));
        dorucakMeni.add(new Product("Sendvic", "kifla, pavlaka, zelena salata", "150"));
        dorucakMeni.add(new Product("Jaja u tortilji", "jaja, salata, majonez", "320"));
        dorucakMeni.add(new Product("Engleski dorucak", "3 jaja, kobasica", "450"));

        Company dorucak = new Company("Dorucak", dorucakMeni);
        companies.add(dorucak);

        ArrayList<Product> sendviciMeni = new ArrayList<>();
        sendviciMeni.add(new Product("Margarita", "kecap, sir, maslina", "350"));
        sendviciMeni.add(new Product("Capricciosa", "kecap, sir, sunka, sampinjoni", "390"));
        sendviciMeni.add(new Product("Milanese", "kecap, sunka, sir, sampinjoni, pavlaka, suvi vrat", "450"));
        sendviciMeni.add(new Product("Madjarica", "kecap, sunka, sir, sampinjoni, pavlaka, suvi vrat", "500"));
        sendviciMeni.add(new Product("Margarita", "kecap, sir, maslina", "350"));
        sendviciMeni.add(new Product("Capricciosa", "kecap, sir, sunka, sampinjoni", "390"));
        sendviciMeni.add(new Product("Milanese", "kecap, sunka, sir, sampinjoni, pavlaka, suvi vrat", "450"));
        sendviciMeni.add(new Product("Madjarica", "kecap, sunka, sir, sampinjoni, pavlaka, suvi vrat", "500"));

        Company sendvic = new Company("Sendvici", sendviciMeni);
        companies.add(sendvic);

        ArrayList<Product> corbaMeni = new ArrayList<>();
        corbaMeni.add(new Product("Margarita", "kecap, sir, maslina", "200"));
        corbaMeni.add(new Product("Capricciosa", "kecap, sir, sunka, sampinjoni", "200"));
        corbaMeni.add(new Product("Milanese", "kecap, sunka, sir, sampinjoni, pavlaka, suvi vrat", "200"));
        corbaMeni.add(new Product("Madjarica", "kecap, sunka, sir, sampinjoni, pavlaka, suvi vrat", "200"));

        Company corba = new Company("Corbe", corbaMeni);
        companies.add(corba);

        ArrayList<Product> pastaMeni = new ArrayList<>();
        pastaMeni.add(new Product("Margarita", "kecap, sir, maslina", "200"));
        pastaMeni.add(new Product("Capricciosa", "kecap, sir, sunka, sampinjoni", "200"));
        pastaMeni.add(new Product("Milanese", "kecap, sunka, sir, sampinjoni, pavlaka, suvi vrat", "200"));
        pastaMeni.add(new Product("Madjarica", "kecap, sunka, sir, sampinjoni, pavlaka, suvi vrat", "200"));
        pastaMeni.add(new Product("Capricciosa", "kecap, sir, sunka, sampinjoni", "200"));

        Company pasta = new Company("Paste", pastaMeni);
        companies.add(pasta);

        ArrayList<Product> pizzaMeni = new ArrayList<>();
        pizzaMeni.add(new Product("Margarita", "kecap, sir, maslina", "350/520/780"));
        pizzaMeni.add(new Product("Capricciosa", "kecap, sir, sunka, sampinjoni", "390/580/880"));
        pizzaMeni.add(new Product("Milanese", "kecap, sunka, sir, sampinjoni, pavlaka, suvi vrat", "450/640/960"));
        pizzaMeni.add(new Product("Madjarica", "kecap, sunka, sir, sampinjoni, pavlaka, suvi vrat", "500/710/1050"));
        pizzaMeni.add(new Product("Margarita", "kecap, sir, maslina", "350/520/780"));
        pizzaMeni.add(new Product("Capricciosa", "kecap, sir, sunka, sampinjoni", "390/580/880"));
        pizzaMeni.add(new Product("Milanese", "kecap, sunka, sir, sampinjoni, pavlaka, suvi vrat", "450/640/960"));
        pizzaMeni.add(new Product("Madjarica", "kecap, sunka, sir, sampinjoni, pavlaka, suvi vrat", "500/710/1050"));
        pizzaMeni.add(new Product("Margarita", "kecap, sir, maslina", "350/520/780"));
        pizzaMeni.add(new Product("Capricciosa", "kecap, sir, sunka, sampinjoni", "390/580/880"));
        pizzaMeni.add(new Product("Milanese", "kecap, sunka, sir, sampinjoni, pavlaka, suvi vrat", "450/640/960"));
        pizzaMeni.add(new Product("Madjarica", "kecap, sunka, sir, sampinjoni, pavlaka, suvi vrat", "500/710/1050"));
        pizzaMeni.add(new Product("Margarita", "kecap, sir, maslina", "350/520/780"));
        pizzaMeni.add(new Product("Capricciosa", "kecap, sir, sunka, sampinjoni", "390/580/880"));
        pizzaMeni.add(new Product("Milanese", "kecap, sunka, sir, sampinjoni, pavlaka, suvi vrat", "450/640/960"));
        pizzaMeni.add(new Product("Madjarica", "kecap, sunka, sir, sampinjoni, pavlaka, suvi vrat", "500/710/1050"));

        Company pizza = new Company("Pizza", pizzaMeni);
        companies.add(pizza);


        ArrayList<Product> obrokSalateMeni = new ArrayList<>();
        obrokSalateMeni.add(new Product("Margarita", "kecap, sir, maslina", "200"));
        obrokSalateMeni.add(new Product("Capricciosa", "kecap, sir, sunka, sampinjoni", "200"));
        obrokSalateMeni.add(new Product("Milanese", "kecap, sunka, sir, sampinjoni, pavlaka, suvi vrat", "200"));
        obrokSalateMeni.add(new Product("Madjarica", "kecap, sunka, sir, sampinjoni, pavlaka, suvi vrat", "200"));
        obrokSalateMeni.add(new Product("Capricciosa", "kecap, sir, sunka, sampinjoni", "200"));
        obrokSalateMeni.add(new Product("Margarita", "kecap, sir, maslina", "200"));

        Company obrokSalate = new Company("Obrok salate", obrokSalateMeni);
        companies.add(obrokSalate);

        ArrayList<Product> prilogSalateMeni = new ArrayList<>();
        prilogSalateMeni.add(new Product("Margarita", "kecap, sir, maslina", "200"));
        prilogSalateMeni.add(new Product("Capricciosa", "kecap, sir, sunka, sampinjoni", "200"));
        prilogSalateMeni.add(new Product("Milanese", "kecap, sunka, sir, sampinjoni, pavlaka, suvi vrat", "200"));
        prilogSalateMeni.add(new Product("Madjarica", "kecap, sunka, sir, sampinjoni, pavlaka, suvi vrat", "200"));
        prilogSalateMeni.add(new Product("Capricciosa", "kecap, sir, sunka, sampinjoni", "200"));
        prilogSalateMeni.add(new Product("Margarita", "kecap, sir, maslina", "200"));

        Company prilogSalate = new Company("Prilog salate", prilogSalateMeni);
        companies.add(prilogSalate);

        ArrayList<Product> biftekMeni = new ArrayList<>();
        biftekMeni.add(new Product("Margarita", "kecap, sir, maslina", "1500"));
        biftekMeni.add(new Product("Capricciosa", "kecap, sir, sunka, sampinjoni", "1500"));
        biftekMeni.add(new Product("Milanese", "kecap, sunka, sir, sampinjoni, pavlaka, suvi vrat", "1400"));
        biftekMeni.add(new Product("Madjarica", "kecap, sunka, sir, sampinjoni, pavlaka, suvi vrat", "1500"));

        Company biftek = new Company("Biftek", biftekMeni);
        companies.add(biftek);


        ArrayList<Product> meksickaMeni = new ArrayList<>();
        meksickaMeni.add(new Product("Margarita", "kecap, sir, maslina", "500"));
        meksickaMeni.add(new Product("Capricciosa", "kecap, sir, sunka, sampinjoni", "500"));
        meksickaMeni.add(new Product("Milanese", "kecap, sunka, sir, sampinjoni, pavlaka, suvi vrat", "400"));
        meksickaMeni.add(new Product("Madjarica", "kecap, sunka, sir, sampinjoni, pavlaka, suvi vrat", "500"));
        meksickaMeni.add(new Product("Madjarica", "kecap, sunka, sir, sampinjoni, pavlaka, suvi vrat", "500"));

        Company meksickaHrana = new Company("Meksicka hrana", meksickaMeni);
        companies.add(meksickaHrana);


        ArrayList<Product> glavnaJelaMeni = new ArrayList<>();
        glavnaJelaMeni.add(new Product("Margarita", "kecap, sir, maslina", "500"));
        glavnaJelaMeni.add(new Product("Capricciosa", "kecap, sir, sunka, sampinjoni", "500"));
        glavnaJelaMeni.add(new Product("Milanese", "kecap, sunka, sir, sampinjoni, pavlaka, suvi vrat", "400"));
        glavnaJelaMeni.add(new Product("Madjarica", "kecap, sunka, sir, sampinjoni, pavlaka, suvi vrat", "500"));
        glavnaJelaMeni.add(new Product("Madjarica", "kecap, sunka, sir, sampinjoni, pavlaka, suvi vrat", "500"));
        glavnaJelaMeni.add(new Product("Margarita", "kecap, sir, maslina", "500"));
        glavnaJelaMeni.add(new Product("Capricciosa", "kecap, sir, sunka, sampinjoni", "500"));
        glavnaJelaMeni.add(new Product("Milanese", "kecap, sunka, sir, sampinjoni, pavlaka, suvi vrat", "400"));
        glavnaJelaMeni.add(new Product("Madjarica", "kecap, sunka, sir, sampinjoni, pavlaka, suvi vrat", "500"));
        glavnaJelaMeni.add(new Product("Madjarica", "kecap, sunka, sir, sampinjoni, pavlaka, suvi vrat", "500"));

        Company glavnaJela = new Company("Glavna jela", glavnaJelaMeni);
        companies.add(glavnaJela);


        ArrayList<Product> burgeriMeni = new ArrayList<>();
        burgeriMeni.add(new Product("Margarita", "kecap, sir, maslina", "400"));
        burgeriMeni.add(new Product("Capricciosa", "kecap, sir, sunka, sampinjoni", "400"));

        Company burgeri = new Company("Burgeri", burgeriMeni);
        companies.add(burgeri);


        ArrayList<Product> slanePalacinkeMeni = new ArrayList<>();
        slanePalacinkeMeni.add(new Product("Margarita", "kecap, sir, maslina", "230"));
        slanePalacinkeMeni.add(new Product("Capricciosa", "kecap, sir, sunka, sampinjoni", "250"));

        Company slanePalacinke = new Company("Slane palacinke", slanePalacinkeMeni);
        companies.add(slanePalacinke);


        ArrayList<Product> desertiMeni = new ArrayList<>();
        desertiMeni.add(new Product("Jaja u tortilji", null, "320"));
        desertiMeni.add(new Product("Engleski dorucak", null, "450"));
        desertiMeni.add(new Product("Sendvic", null, "150"));
        desertiMeni.add(new Product("Jaja u tortilji", null, "320"));
        desertiMeni.add(new Product("Engleski dorucak", null, "450"));
        desertiMeni.add(new Product("Sendvic", null, "150"));
        desertiMeni.add(new Product("Jaja u tortilji", null, "320"));
        desertiMeni.add(new Product("Engleski dorucak", null, "450"));
        desertiMeni.add(new Product("Sendvic", null, "150"));
        desertiMeni.add(new Product("Jaja u tortilji", "jaja, salata, majonez", "320"));
        desertiMeni.add(new Product("Engleski dorucak", "3 jaja, kobasica", "450"));

        Company dezert = new Company("Dezerti", desertiMeni);
        companies.add(dezert);


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