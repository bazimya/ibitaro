package com.example.recycleviewassignment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class fragmentVideo extends Fragment {
    private RecyclerView recyclerView;
    private List<callmovie> lstcontact;
    View v;
    public fragmentVideo() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v= inflater.inflate(R.layout.movie_fragment,container,false);
        recyclerView = (RecyclerView)v.findViewById(R.id.movierecycleview_id);
       RecycleviewAdpter recycleviewAdpter = new RecycleviewAdpter(getContext(),lstcontact);
       recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
       recyclerView.setAdapter(recycleviewAdpter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstcontact = new ArrayList<>();

        lstcontact.add(new callmovie("movie of stone","(call)","(A",R.drawable.download));
        lstcontact.add(new callmovie("movie of stone","(call)","(A",R.drawable.download));
        lstcontact.add(new callmovie("movie of stone","(call)","(A",R.drawable.download));
        lstcontact.add(new callmovie("movie of stone","(call)","(A",R.drawable.download));
        lstcontact.add(new callmovie("movie of stone","(call)","(A",R.drawable.download));
        lstcontact.add(new callmovie("movie of stone","(call)","(A",R.drawable.download));
        lstcontact.add(new callmovie("movie of stone","(call)","(A",R.drawable.download));
        lstcontact.add(new callmovie("movie of stone","(call)","(A",R.drawable.download));
        lstcontact.add(new callmovie("movie of stone","(call)","(A",R.drawable.download));
        lstcontact.add(new callmovie("movie of stone","(call)","(A",R.drawable.download));
        lstcontact.add(new callmovie("movie of stone","(call)","(A",R.drawable.download));
        lstcontact.add(new callmovie("movie of stone","(call)","(A",R.drawable.download));
        lstcontact.add(new callmovie("movie of stone","(call)","(A",R.drawable.download));
        lstcontact.add(new callmovie("movie of stone","(call)","(A",R.drawable.download));
        lstcontact.add(new callmovie("movie of stone","(call)","(A",R.drawable.download));
        lstcontact.add(new callmovie("movie of stone","(call)","(A",R.drawable.download));
        lstcontact.add(new callmovie("movie of stone","(call)","(A",R.drawable.download));
        lstcontact.add(new callmovie("movie of stone","(call)","(A",R.drawable.download));
        lstcontact.add(new callmovie("movie of stone","(call)","(A",R.drawable.download));
        lstcontact.add(new callmovie("movie of stone","(call)","(A",R.drawable.download));
        lstcontact.add(new callmovie("movie of stone","(call)","(A",R.drawable.download));
        lstcontact.add(new callmovie("movie of stone","(call)","(A",R.drawable.download));
        lstcontact.add(new callmovie("movie of stone","(call)","(A",R.drawable.download));
        lstcontact.add(new callmovie("movie of stone","(call)","(A",R.drawable.download));
        lstcontact.add(new callmovie("movie of stone","(call)","(A",R.drawable.download));
        lstcontact.add(new callmovie("movie of stone","(call)","(A",R.drawable.download));
        lstcontact.add(new callmovie("movie of stone","(call)","(A",R.drawable.download));
        lstcontact.add(new callmovie("movie of stone","(call)","(A",R.drawable.download));
        lstcontact.add(new callmovie("movie of stone","(call)","(A",R.drawable.download));
        lstcontact.add(new callmovie("movie of stone","(call)","(A",R.drawable.download));
        lstcontact.add(new callmovie("movie of stone","(call)","(A",R.drawable.download));
        lstcontact.add(new callmovie("movie of stone","(call)","(A",R.drawable.download));
        lstcontact.add(new callmovie("movie of stone","(call)","(A",R.drawable.download));
        lstcontact.add(new callmovie("movie of stone","(call)","(A",R.drawable.download));
        lstcontact.add(new callmovie("movie of stone","(call)","(A",R.drawable.download));
        lstcontact.add(new callmovie("movie of stone","(call)","(A",R.drawable.download));
        lstcontact.add(new callmovie("movie of stone","(call)","(A",R.drawable.download));
        lstcontact.add(new callmovie("movie of stone","(call)","(A",R.drawable.download));
        lstcontact.add(new callmovie("movie of stone","(call)","(A",R.drawable.download));
        lstcontact.add(new callmovie("movie of stone","(call)","(A",R.drawable.download));
        lstcontact.add(new callmovie("movie of stone","(call)","(A",R.drawable.download));
        lstcontact.add(new callmovie("movie of stone","(call)","(A",R.drawable.download));
    }
}