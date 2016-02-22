package io.schibsted.workshop3;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by roger.martinez on 22/2/16.
 */
public class OfferAdapter extends RecyclerView.Adapter<OfferAdapter.ViewHolder> {

    private List<Offer> offers;

    public OfferAdapter(List<Offer> offers) {
        this.offers = offers;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView titleTV;
        TextView companyNameTV;
        TextView cityTV;

        public ViewHolder(View itemView) {
            super(itemView);
            titleTV = ((TextView) itemView.findViewById(R.id.tv_title));
            companyNameTV = ((TextView) itemView.findViewById(R.id.tv_company_name));
            cityTV = ((TextView) itemView.findViewById(R.id.tv_city));
        }
    }
}
