package com.kddcompany.kdd.kdd;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adaptador extends BaseAdapter{

    private static LayoutInflater inflater = null;
    Context contexto;
    String[][] datos;
    int[] datosImg;

    public Adaptador(Context contexto1, String[][] datos, int[] datosImg){
        this.contexto = contexto1;
        this.datos = datos;
        this.datosImg = datosImg;
        inflater = (LayoutInflater)contexto1.getSystemService(contexto.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {

        final View vista = inflater.inflate(R.layout.elemento_lista, null);

        TextView titulo = (TextView) vista.findViewById(R.id.titulo);
        TextView lugar = (TextView) vista.findViewById(R.id.lugar);
        TextView admin = (TextView) vista.findViewById(R.id.admin);
        TextView fecha = (TextView) vista.findViewById(R.id.fecha);
        TextView duracion = (TextView) vista.findViewById(R.id.duracion);

        ImageView imagen = (ImageView) vista.findViewById(R.id.imagen);

        titulo.setText(datos[i][0]);
        lugar.setText(datos[i][1]);
        admin.setText(datos[i][2]);
        fecha.setText(datos[i][3]);
        duracion.setText(datos[i][4]);

        imagen.setImageResource(datosImg[i]);

        /*
        imagen.setTag(i);
        imagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent visorImagen = new Intent(contexto, visorImagen.class);
                visorImagen.putExtra("IMG", datosImg[(Integer)v.getTag()]);
                contexto.startActivity(visorImagen);
            }
        });
        */

        return vista;
    }

    @Override
    public int getCount() {
        return datosImg.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


}
