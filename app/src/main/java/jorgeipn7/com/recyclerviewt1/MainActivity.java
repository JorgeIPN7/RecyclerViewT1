package jorgeipn7.com.recyclerviewt1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Pais> paises;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        paises= new ArrayList<>();
        paises.add(new Pais(1, "México"));
        paises.add(new Pais(2, "Italia"));

        Log.i("Paises", "" + paises.size());

        recyclerView= (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);

        layoutManager= new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

/*        adapter= new MyAdapter(paises, R.layout.cardview, this, new MyAdapter.OnItemClickListener() {
            @Override
            public void onItemClickListener(Pais pais, int position) {

    //QUISIERA HACER ALGO MO ESTO.
                switch (v.getId()){
                    case R.id.ll_1:
                        Toast.makeText(getApplicationContext(), "-> " + position + "\n*************************\n Layout 1", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.ll_2:
                        Toast.makeText(getApplicationContext(), "-> " + position + "\n*************************\n Layout 2", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.ll_3:
                        Toast.makeText(getApplicationContext(), "-> " + position + "\n*************************\n Layout 3", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.tv_pais:
                        Toast.makeText(getApplicationContext(), "-> " + position + "\n*************************\n" + pais.toString(), Toast.LENGTH_LONG).show();
                        break;
                    default:
                        break;
                }


            }
        });
*/

        adapter= new MyAdapter(paises, R.layout.cardview, this, new MyAdapter.OnItemClickListener() {
            @Override
            public void onItemClickListener(Pais pais, int position) {
                Toast.makeText(getApplicationContext(), "-> " + position + "\n*************************\n Layout 1", Toast.LENGTH_LONG).show();

            }
        }

                , new MyAdapter.OnItemClickListener() {
            @Override
            public void onItemClickListener(Pais pais, int position) {
                Toast.makeText(getApplicationContext(), "-> " + position + "\n*************************\n Layout 2", Toast.LENGTH_LONG).show();

            }
        }
                , new MyAdapter.OnItemClickListener() {
            @Override
            public void onItemClickListener(Pais pais, int position) {

                Toast.makeText(getApplicationContext(), "-> " + position + "\n*************************\n Layout 3", Toast.LENGTH_LONG).show();
            }
        }
                , new MyAdapter.OnItemClickListener() {
            @Override
            public void onItemClickListener(Pais pais, int position) {
                Toast.makeText(getApplicationContext(), "-> " + position + "\n*************************\n" + pais.toString(), Toast.LENGTH_LONG).show();

            }
        }
        );


        recyclerView.setAdapter(adapter);

    }
}
