package usuario.example.tp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import usuario.example.tp2.modelo.Inmueble;

public class MainActivity extends AppCompatActivity {
private ArrayList<Inmueble>list =new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargarDatos();
        generarListView();
    }
    public  void generarListView()
    {
        ArrayAdapter<Inmueble> adapter = new ListaAdapter(this,R.layout.item,list,getLayoutInflater());
        ListView lv=findViewById(R.id.lvmilista);
        lv.setAdapter(adapter);
    }
    public void cargarDatos()
    {
        list.add(new Inmueble(R.drawable.casa,"JK",180.000));
        list.add(new Inmueble(R.drawable.casa1,"LA TOMA",100.000));
        list.add(new Inmueble(R.drawable.casa2,"MERLO",19500.000));
    }
}