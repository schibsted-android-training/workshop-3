package io.schibsted.workshop3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static List<Offer> offers = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rv = (RecyclerView) findViewById(R.id.rv_main);

        fillStartOffers(offers);

        OfferAdapter adapter = new OfferAdapter(offers);

        rv.setAdapter(adapter);
        rv.setLayoutManager(new LinearLayoutManager(this));
    }

    private void fillStartOffers(List<Offer> offers){
        offers.add(new Offer("Oferta de empleo", "Schibted", "Barcelona"));
        offers.add(new Offer("Otra oferta de empleo", "InfoJobs", "Madrid"));
        offers.add(new Offer("Nueva oferta", "Foto Casa", "Barcelona"));
    }
}
