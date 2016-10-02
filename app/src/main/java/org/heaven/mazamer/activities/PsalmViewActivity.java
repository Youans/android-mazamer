package org.heaven.mazamer.activities;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.ViewById;
import org.heaven.mazamer.R;

@EActivity(R.layout.activity_psalm_view)
public class PsalmViewActivity extends AppCompatActivity {

    @ViewById(R.id.psalmTextView)
    protected TextView psalmTextView;
    @ViewById(R.id.psalmTextViewHead)
    protected TextView psalmTextViewHead;

    @Extra
    protected String psalmNumber;

    @AfterViews
    public void initView() {
        psalmTextViewHead.setText("المزمور "+psalmNumber);
        psalmTextView.setText(getResources().getString(getResources().getIdentifier(("psalm"+psalmNumber), "string", getPackageName())));
    }

}
