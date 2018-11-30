package com.example.octav.prebeinscripcion;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaptadorLista extends RecyclerView.Adapter<AdaptadorLista.ViewHolderLista> {

    ArrayList<AsignaturasVo> listaAsignaturas;

    public AdaptadorLista(ArrayList<AsignaturasVo> listaAsignaturas) {
        this.listaAsignaturas = listaAsignaturas;
    }

    @NonNull
    @Override
    public ViewHolderLista onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list,null,false);
        return new ViewHolderLista(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderLista viewHolderLista, int i) {
        viewHolderLista.tvclave.setText(listaAsignaturas.get(i).getClave());
        viewHolderLista.tvcredito.setText(listaAsignaturas.get(i).getCredito());
        viewHolderLista.tvasig.setText(listaAsignaturas.get(i).getAsignatura());
        viewHolderLista.tvhora.setText(listaAsignaturas.get(i).getHorario());


    }

    @Override
    public int getItemCount() {
        return listaAsignaturas.size();
    }

    public class ViewHolderLista extends RecyclerView.ViewHolder {

        TextView tvclave,tvcredito,tvasig,tvhora;

        public ViewHolderLista(@NonNull View itemView) {
            super(itemView);
            tvclave= (TextView) itemView.findViewById(R.id.tvCl1);
            tvcredito= (TextView) itemView.findViewById(R.id.tvCr1);
            tvasig= (TextView) itemView.findViewById(R.id.tvAsignatura1);
            tvhora= (TextView) itemView.findViewById(R.id.tvDisp1);
        }
    }
}
