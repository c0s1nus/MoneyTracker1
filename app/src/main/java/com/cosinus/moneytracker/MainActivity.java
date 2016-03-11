package com.cosinus.moneytracker;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private TransactionAdapter transactionAdapter;
    List<Transactions> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Transactions> adapterData = getDataList();
        transactionAdapter = new TransactionAdapter(this, adapterData);

        listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(transactionAdapter);

    }

    private List<Transactions> getDataList() {

        data.add(new Transactions("Телефон", "15700"));
        data.add(new Transactions("Толканка", "15"));
        data.add(new Transactions("Кремик", "45"));
        data.add(new Transactions("Молоко", "60"));
        data.add(new Transactions("Хлеб", "30"));

        return data;
    }

}
