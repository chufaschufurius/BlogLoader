package es.chufurius.chufas.blogloader;

import android.app.ListActivity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TextView;


public class Blog extends ListActivity {
    protected String [] mAndroidNames;
    protected TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog);
        final Resources resources=getResources();
        textView= (TextView) findViewById(R.id.textView2);
        mAndroidNames=resources.getStringArray(R.array.stringArray);
        if(mAndroidNames!=null){
            textView.setVisibility(View.INVISIBLE);
            ArrayAdapter<String> adapter=
                    new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mAndroidNames);
            setListAdapter(adapter);
        }
    }

  /*  private void setVisible(int invisible) {
        int view=View.VISIBLE;
    }

    private String[] getStringArray(Resources resources) {
        return new String[0];
    }*/


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.blog, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
