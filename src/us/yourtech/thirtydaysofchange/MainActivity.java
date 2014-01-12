package us.yourtech.thirtydaysofchange;

import android.os.Bundle;
import android.app.Activity;
import java.util.Random;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.TextView;
import android.widget.Spinner;
import android.widget.ImageView;

public class MainActivity extends Activity {

	private Spinner dayspinner;
    Random r1 = new Random();
    TextView t1;
    ImageView i1;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i1 =(ImageView)findViewById(R.id.imageView1);
        
        dayspinner = (Spinner)findViewById(R.id.days_spinner);
        dayspinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				
				String uri = "drawable/" + dayspinner.getSelectedItem().toString();
				int imageResource = getResources().getIdentifier(uri, null, getPackageName());
				// t1.setText(uri);
				i1.setImageResource(imageResource);
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
    }
		
}
