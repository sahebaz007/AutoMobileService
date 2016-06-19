package com.example.hellojarvis;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements OnClickListener {

	EditText et1,et2;
	TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final Button btn = (Button)findViewById(R.id.button1);
        final EditText et1 = (EditText)findViewById(R.id.editText1);
        final EditText et2 = (EditText)findViewById(R.id.editText2);
        final TextView result = (TextView)findViewById(R.id.textView1);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		
		int x = new Integer(et1.getText().toString());
		int y = new Integer(et2.getText().toString());
		int sum = x + y;
		result.setText("The Sum of "+x+" and "+y+" is "+sum);
	}
}
