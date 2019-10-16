package com.example.ejemplo_spinner.viewcontrollers.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.ejemplo_spinner.R;
import com.example.ejemplo_spinner.data.models.SpinnerModelAdapter;

import java.util.List;

public class SpinnerCustomAdapter extends BaseAdapter {

    private Context context;
    private List<SpinnerModelAdapter> data;
    private LayoutInflater inflater;

    public SpinnerCustomAdapter(Context context, List<SpinnerModelAdapter> data) {
        this.data = data;
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if(v == null){
            v = inflater.inflate(R.layout.layout_custom,parent,false);
        }
        TextView tv1 = v.findViewById(R.id.nombre);
        TextView tv2 = v.findViewById(R.id.capital);
        tv1.setText(data.get(position).getNombre());
        tv2.setText(data.get(position).getCapital());
        return v;
    }
}
