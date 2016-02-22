package io.schibsted.workshop3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import jp.wasabeef.recyclerview.animators.ScaleInBottomAnimator;

public class MainActivity extends AppCompatActivity {

    private static List<Offer> offers = new ArrayList<>();

    RecyclerView rv;
    OfferAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = (RecyclerView) findViewById(R.id.rv_main);

        fillStartOffers();

        adapter = new OfferAdapter(offers);

        rv.setAdapter(adapter);
        rv.setLayoutManager(new LinearLayoutManager(this));

        RecyclerView.ItemAnimator itemAnimator = new ScaleInBottomAnimator();
        rv.setItemAnimator(itemAnimator);

        Button button = ((Button) findViewById(R.id.btn_add_offer));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = adapter.getItemCount();
                addOffer();
                rv.scrollToPosition(position);
                adapter.notifyItemInserted(position);
            }
        });
    }

    private void addOffer() {
        int i = adapter.getItemCount();
        Offer offer = new Offer("Oferta " + i, "Empresa " + i, "Random" + i);
        offers.add(offer);
    }

    private void fillStartOffers(){
        offers.add(new Offer("Oferta de empleo", "Schibted", "Barcelona"));
        offers.add(new Offer("Otra oferta de empleo", "InfoJobs", "Madrid"));
        offers.add(new Offer("Nueva oferta", "Foto Casa", "Barcelona"));
    }
}
