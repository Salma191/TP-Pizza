package ma.ensa.pizza.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import ma.ensa.pizza.R;
import ma.ensa.pizza.classes.Produit;

public class PizzaAdapter extends BaseAdapter {
    private List<Produit> produits;
    private LayoutInflater inflater;

    public PizzaAdapter(Activity activity, List<Produit> produits) {
        this.produits = produits;
        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return produits.size();
    }

    @Override
    public Object getItem(int position) {
        return produits.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position + 1;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null)
            convertView = inflater.inflate(R.layout.produit_item, null);

        TextView idf = convertView.findViewById(R.id.id);
        TextView nom = convertView.findViewById(R.id.nom);
        TextView nbrIngredients = convertView.findViewById(R.id.nbrIngredients);
        ImageView photo = convertView.findViewById(R.id.photo);
        TextView duree = convertView.findViewById(R.id.duree);

        idf.setText(produits.get(position).getId()+"");
        nom.setText(produits.get(position).getNom());
        nbrIngredients.setText(produits.get(position).getNbrIngredients()+"");
        photo.setImageResource(produits.get(position).getPhoto());
        duree.setText(produits.get(position).getDuree()+"");




        return convertView;
    }
}
