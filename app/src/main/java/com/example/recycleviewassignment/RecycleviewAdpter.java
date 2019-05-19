package com.example.recycleviewassignment;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecycleviewAdpter extends RecyclerView.Adapter<RecycleviewAdpter.Myviewholder> {
 Context mcontext;
 List<callmovie> mdata;

    public RecycleviewAdpter(Context context, List<callmovie> mdata) {
        this.mcontext = context;
        this.mdata = mdata;
    }

    @NonNull
    @Override
    public Myviewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v;
        v= LayoutInflater.from(mcontext).inflate(R.layout.movies_content,viewGroup,false);
        Myviewholder mviewhold = new Myviewholder(v);

        return mviewhold;
    }

    @Override
    public void onBindViewHolder(@NonNull Myviewholder myviewholder, int i) {
        myviewholder.tv_discription.setText(mdata.get(i).getName());
        myviewholder.another.setText(mdata.get(i).getCall());
        myviewholder.ytpe21.setText(mdata.get(i).getType());
//        myviewholder.img.setImageResource(mdata.get(i).getImage());

    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public  static  class Myviewholder extends RecyclerView.ViewHolder{

      private TextView tv_discription;
      private  TextView another;
      private TextView ytpe21;
      private ImageView img;
       public Myviewholder(@NonNull View itemView) {
           super(itemView);
           tv_discription = (TextView)itemView.findViewById(R.id.movie_content);
           another = (TextView)itemView.findViewById(R.id.inbetween);
           ytpe21 = (TextView)itemView.findViewById(R.id.type1);

//           img = (ImageView)itemView.findViewById(R.id.image_id);
       }

   }
}
