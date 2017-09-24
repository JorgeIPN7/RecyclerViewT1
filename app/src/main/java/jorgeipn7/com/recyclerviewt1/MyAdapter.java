package jorgeipn7.com.recyclerviewt1;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Jorge on 23/09/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{

    private List<Pais> lista;
    private int layout;
    private Activity activity;
    private OnItemClickListener listener;
    /**************/
    private OnItemClickListener listener2;
    private OnItemClickListener listener3;
    private OnItemClickListener listener4;
    /**************/

/*
    public MyAdapter(List<Pais> lista, int layout, Activity activity, OnItemClickListener listener) {
        this.lista = lista;
        this.layout = layout;
        this.activity = activity;
        this.listener = listener;
    }
*/
    public MyAdapter(List<Pais> lista, int layout, Activity activity, OnItemClickListener listener, OnItemClickListener listener2, OnItemClickListener listener3, OnItemClickListener listener4) {
        this.lista = lista;
        this.layout = layout;
        this.activity = activity;
        this.listener = listener;
        this.listener2 = listener2;
        this.listener3 = listener3;
        this.listener4 = listener4;

    }




    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(layout, parent, false);
        return new ViewHolder(v);
    }

    /*
    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {
        holder.bind(lista.get(position), listener);
    }
    */

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {
        holder.bind(lista.get(position), listener, listener2, listener3, listener4);
    }


    @Override
    public int getItemCount() {
        return lista.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{

        LinearLayout ll_1, ll_2, ll_3;
        TextView tv_pais;

        public ViewHolder(View v) {
            super(v);

            ll_1= (LinearLayout) v.findViewById(R.id.ll_1);
            ll_2= (LinearLayout) v.findViewById(R.id.ll_2);
            ll_3= (LinearLayout) v.findViewById(R.id.ll_3);
            tv_pais= (TextView) v.findViewById(R.id.tv_pais);
        }
/*
        public void bind(final Pais pais, final OnItemClickListener listener){
            tv_pais.setText(pais.getNombre());
            tv_pais.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onItemClickListener(pais, getAdapterPosition());
                }
            });

            ll_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onItemClickListener(pais, getAdapterPosition());
                }
            });

            ll_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onItemClickListener(pais, getAdapterPosition());
                }
            });

            ll_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onItemClickListener(pais, getAdapterPosition());
                }
            });

        }
*/

        public void bind(final Pais pais, final OnItemClickListener listener, final OnItemClickListener listener2, final OnItemClickListener listener3, final OnItemClickListener listener4){
            tv_pais.setText(pais.getNombre());
            tv_pais.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener4.onItemClickListener(pais, getAdapterPosition());
                }
            });

            ll_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onItemClickListener(pais, getAdapterPosition());
                }
            });

            ll_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener2.onItemClickListener(pais, getAdapterPosition());
                }
            });

            ll_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener3.onItemClickListener(pais, getAdapterPosition());
                }
            });

        }


    }


    public interface OnItemClickListener{
        void onItemClickListener(Pais pais, int position);
    }

}
