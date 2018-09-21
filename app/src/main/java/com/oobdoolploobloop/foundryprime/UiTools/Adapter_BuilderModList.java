package com.oobdoolploobloop.foundryprime.UiTools;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.oobdoolploobloop.foundryprime.R;

public class Adapter_BuilderModList extends BaseAdapter {

    Context context;
    String[] data;
    private static LayoutInflater inflater = null;

    public Adapter_BuilderModList(Context context, String[] data){
        this.context = context;
        this.data = data;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount(){
        return data.length;
    }

    @Override
    public Object getItem(int position){
        return data[position];
    }

    @Override
    public long getItemId(int position){
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        View vi = convertView;
        if (vi == null)
            vi = inflater.inflate(R.layout.builder_modlist, null);
        TextView text = (TextView) vi.findViewById(R.id.text);
        text.setText(data[position]);
        return vi;
    }
}
