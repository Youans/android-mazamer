package org.heaven.mazamer.activities;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;
import org.heaven.mazamer.R;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    private String psalmNumber;
    static final String[] letters = new String[151];
    GridView grid;

    @AfterViews
    public void initView() {
        for (int i = 1; i < 152; i++) {
            letters[i - 1] = "" + i;
        }

        grid = (GridView) findViewById(R.id.gridView);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, letters);

        grid.setAdapter(adapter);

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                //Toast.makeText(getApplicationContext(),((TextView) v).getText(), Toast.LENGTH_SHORT).show();
                psalmNumber ="" +((TextView) v).getText();
                org.heaven.mazamer.activities.PsalmViewActivity_.intent(v.getContext()).psalmNumber(psalmNumber).start();
            }
        });
    }
}
