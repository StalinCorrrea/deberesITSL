package com.example.personaroom.adapter;

import android.app.Person;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.personaroom.R;
import com.example.personaroom.database.Persona;

import java.util.ArrayList;



public class ListAdapter extends ArrayAdapter<Persona> {

    private Context context;
    private ArrayList<Persona> list;


    public ListAdapter(Context context, ArrayList<Persona> list) {
        super(context, R.layout.listview_item);
        this.context=context;
        this.list=list;

    }
    @Override
    public int getCount(){

        return list.size();
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        View view;

        final ViewHolder viewHolder;

        if (convertView == null || convertView.getTag() == null) {

            viewHolder=new ViewHolder();
            view = LayoutInflater.from(context).inflate(R.layout.listview_item,parent,false);
            viewHolder.vItemName=(TextView) view.findViewById(R.id.textView2);
            viewHolder.vItemImage=(ImageView) view.findViewById(R.id.imageView) ;
            view.setTag(viewHolder);
        }else{

            viewHolder = (ViewHolder) convertView.getTag();
            view = convertView;


        }

            viewHolder.vItemName.setText(list.get(position).getNombre());
          Glide.with(context).load("http://i.imgur.com/DvpvklR.png")
                  .into(viewHolder.vItemImage);


        return view;
    }

    static class ViewHolder{
        protected TextView vItemName;
        protected ImageView vItemImage;
    }


}
