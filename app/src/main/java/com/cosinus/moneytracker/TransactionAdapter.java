package com.cosinus.moneytracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Afonichev on 06.03.2016.
 */
public class TransactionAdapter extends ArrayAdapter<Transactions> {

    List<Transactions> transactions;

    public TransactionAdapter(Context context, List<Transactions> transactions) {
        super(context, 0, transactions);
        this.transactions = transactions;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Transactions transaction = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,
                    parent, false);
        }

        TextView title = (TextView) convertView.findViewById(R.id.title);
        TextView sum = (TextView) convertView.findViewById(R.id.sum);

        title.setText(transaction.title);
        sum.setText(transaction.sum);

        return convertView;
    }
}
