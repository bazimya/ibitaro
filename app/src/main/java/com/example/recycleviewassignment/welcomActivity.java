package com.example.recycleviewassignment;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class welcomActivity extends AppCompatActivity {
    Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private  fragmentpageadpter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcom);
        toolbar = (Toolbar)findViewById(R.id.toolbar_layout);
     setSupportActionBar(toolbar);

        tabLayout= (TabLayout)findViewById(R.id.tablayout_id);
        viewPager =(ViewPager)findViewById(R.id.view_pager_id);
        adapter = new fragmentpageadpter(getSupportFragmentManager());

//        add fragment hera

        adapter.Addfragment(new fragamentmovie(),"EMERGENCE ");
        adapter.Addfragment(new fragmentVideo(),"Action");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_call);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_call);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.commonmenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int d = item.getItemId();
        if (d==R.id.dte){

            Toast.makeText(this, "hello saphani", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
