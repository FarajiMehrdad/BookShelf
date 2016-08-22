package ir.approom.bookshelf;

import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_avtvity);

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.bookmark){
            ListFragment fragment = new ListFragment();
            getSupportFragmentManager().beginTransaction().
                    replace(R.id.conainer , fragment).commit();
            return true;
        } else if(item.getItemId() == R.id.friends){

            FragmentContent fragment = new FragmentContent();
            getSupportFragmentManager().beginTransaction().
                    replace(R.id.conainer , fragment).commit();
            return true;
        }

        return false;
    }
}
