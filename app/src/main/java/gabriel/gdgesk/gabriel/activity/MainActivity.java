package gabriel.gdgesk.gabriel.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import butterknife.BindView;
import butterknife.ButterKnife;
import gabriel.gdgesk.gabriel.R;
import gabriel.gdgesk.gabriel.fragment.ChatsListFragment;
import gabriel.gdgesk.gabriel.fragment.UsersListFragment;
import gabriel.gdgesk.gabriel.adapter.ViewPagerAdapter;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    protected Toolbar toolbar;

    @BindView(R.id.tabs)
    protected TabLayout tabLayout;

    @BindView(R.id.viewpager)
    protected ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        setSupportActionBar(toolbar);
        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(ChatsListFragment.newInstance(), getString(R.string.chats_tab_title));
        adapter.addFragment(UsersListFragment.newInstance(), getString(R.string.people_tab_title));

        viewPager.setAdapter(adapter);
    }

}
