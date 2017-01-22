package test.test1;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import test.test1.Adapter.ViewPagerAdapter;
import test.test1.Fragment.test1;
import test.test1.Fragment.test2;
import test.test1.Fragment.test3;
import test.test1.Fragment.test4;

public class MainActivity extends AppCompatActivity {

    public Toolbar toolbar;
    public TextView textView;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private int [] tab ={
            R.drawable.ic_action_name,
            R.drawable.ic_action_name1,
            R.drawable.ic_action_name,
            R.drawable.ic_action_name
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar_parent);
        textView = (TextView) findViewById(R.id.test1);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowTitleEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs1);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();
    }

    private void setupTabIcons(){
        tabLayout.getTabAt(0).setIcon(tab[0]);
        tabLayout.getTabAt(1).setIcon(tab[1]);
        tabLayout.getTabAt(2).setIcon(tab[2]);
        tabLayout.getTabAt(3).setIcon(tab[3]);
    }

    private void setupViewPager(ViewPager viewPager){
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragments(new test1(),"");
        adapter.addFragments(new test2(),"");
        adapter.addFragments(new test3(),"");
        adapter.addFragments(new test4(),"");
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(2, false);
    }
}