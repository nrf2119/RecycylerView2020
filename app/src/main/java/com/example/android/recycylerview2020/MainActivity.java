package com.example.android.recycylerview2020;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    ArrayList<President> presidents;
    PresidentAdapter presAdapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialData(); //notice we call the method in onCreate. why here?

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        presAdapter = new PresidentAdapter(presidents, this);
        recyclerView.setAdapter(presAdapter);
    }

    private void initialData() {
        presidents = new ArrayList<>();
        presidents.add(new President("Bill Clinton", "1993-2001", R.drawable.clinton));
        presidents.add(new President("George W. Bush", "2001-2009", R.drawable.bush));
        presidents.add(new President("Barack Obama", "2009-2017", R.drawable.obama));
    }

    public void addRandomPerson(View view) {
        President newPrez;
        int num = (int) (Math.random() * 3);
        if (num == 0)
            newPrez = new President("Bill Clinton", "1993-2001", R.drawable.clinton);
        else if (num == 1)
            newPrez = new President("George W. Bush", "2001-2009", R.drawable.bush);
        else
            newPrez = new President("Barack Obama", "2009-2017", R.drawable.obama);
        presidents.add(newPrez);
        recyclerView.setAdapter(presAdapter);
    }
}
